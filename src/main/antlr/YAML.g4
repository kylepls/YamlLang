grammar YAML ;

tokens { INDENT, DEDENT, NL }

@lexer::members {
    java.util.LinkedList<Token> extra = new java.util.LinkedList<>();
    java.util.Stack<Integer> indents = new java.util.Stack<>();
    
    Token lastToken;
    
    @Override
    public void emit(Token t) {
//       super.setToken(t);
       extra.offer(t);
    }
    
    @Override
    public Token nextToken() {
       Token next = super.nextToken(); 
       if (next != null && next.getChannel() == Token.DEFAULT_CHANNEL) {
            lastToken = next;
       }
       return extra.isEmpty() ? next : extra.poll();
    }
    
    public Token makeDedent() {
        CommonToken ct = commonToken(YAMLParser.DEDENT, "\u2190");
        ct.setLine(getCurrentLine());
        return ct;
    }
    
    public Token makeNL(String spaces) {
        CommonToken ct = commonToken(YAMLParser.NL, "\n\u2424" + spaces);
        ct.setLine(getCurrentLine());
        return ct;
    }
    
    public Token makeIndent() {
        return commonToken(YAMLParser.INDENT, "\u2192");
    }
    
    private CommonToken commonToken(int type, String text) {
        int stop = this.getCharIndex() - 1;
        int start = text.isEmpty() ? stop : stop - text.length() + 1;
        CommonToken ct = new CommonToken(this._tokenFactorySourcePair, type, DEFAULT_TOKEN_CHANNEL, start, stop);
        ct.setText(text);
        return ct;
    }
    
    private int getCurrentLine() {
        return lastToken != null ? lastToken.getLine() : 0;
    }
}


file         : content+ EOF;

content      : if_stmt
             | while_stmt
             | array_set
             | array_dec
             | assign 
             | function_call
             | NL 
             ;
             
if_stmt      : IF CO condition=expr NL THEN CO block? else_if_stmt*? else_stmt?;
else_if_stmt : ELIF CO expr NL THEN CO block ;
else_stmt    : ELSE CO block? ;

while_stmt   : WHILE CO condition=expr NL DO CO block?;

assign       : ID CO expr NL ;

function_call: function_list 
             | function_expr ; 
function_list: FUNCTION_ID CO list;
function_expr: FUNCTION_ID CO expr? NL;             

block        : NL INDENT content*? DEDENT ;
list         : INDENT list_item (list_item)* NL DEDENT ;
list_item    : NL LIST_START expr ; 

array_dec    : ID CO ARRAY_START ARRAY_END NL;
array_set    : ID CO ARRAY_START index_expr=expr? ARRAY_END ARRAY_SET value_expr=expr NL;
array_acc    : ID ARRAY_START expr ARRAY_END ;

expr         : left=expr op=(MUL | DIV) right=expr # MULDIV
             | left=expr ADD right=expr            # ADD
             | left=expr SUB right=expr            # SUB
             | left=expr EQ right=expr             # EQ
             | left=expr NOTEQ right=expr          # NOTEQ
             | left=expr op=(LT|GT) right=expr     # LESSGREAT
             | '(' expr ')'                        # PARENS
             | '\'' expr '\''                      # WRAP
             | NOT expr                            # NOT
             | array_acc                           # ACCESS 
             | NUMBER                              # NUMBER
             | STRING                              # STRING
             | BOOL                                # BOOL
             | ID                                  # ID
             ;
             
ARRAY_START  : '[' ;
ARRAY_END    : ']' ;            
ARRAY_SET    : '<-' ;
NUMBER       : INT ;
BOOL         : 'true' | 'false' ;
WHILE        : 'while' ;
DO           : 'do' ;
IF           : 'if' ;
THEN         : 'then' ;
ELIF         : 'elif' ;
ELSE         : 'else' ;
ADD          : '+' ;
DIV          : '/' ;
MUL          : '*' ;
SUB          : '-' ;
NOTEQ        : '!=' ;
EQ           : '=' ;
NOT          : '!' ;
LT           : '<' ;
GT           : '>' ;
ID           : [a-z] [a-zA-Z0-9]* ;
FUNCTION_ID  : [A-Z] [A-Z0-9]*;
STRING       : '"' ANY? '"';
CO           : ':' ;
LIST_START   : '- ';
NL_  : ('\r'? '\n' SPACES?) 
    {
        String stringSpaces = getText().replaceAll("[\r\n]+", "");
        int spaces = stringSpaces.length();
        int indent = indents.isEmpty() ? 0 : indents.peek();
        if (spaces > indent) {
            indents.push(spaces);
            emit(makeNL(stringSpaces));
            emit(makeIndent());
        } else if (spaces < indent) {
            emit(makeNL(stringSpaces));
            do {
                if (!indents.isEmpty()) {
                    indent = indents.pop();
                }
                emit(makeDedent());
            } while (!indents.isEmpty() && spaces < indents.peek()); 
        } else {
            emit(makeNL(stringSpaces));
        }
    } -> skip ;
    
SKIP_ : (SPACES) -> skip ;
COMMENT : ('#' ~[\n]) -> skip ;

fragment SPACES : [ ]+;
fragment ANY    : .*?;
fragment INT    : [0-9]+ ;
