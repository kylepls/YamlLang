# YamlLang

A terrible programming language built on top of the YAML syntax using Antlr4.

### Code Examples

Variables, loops, arrays, and functions:
```yaml
value: []
i: 0
while: i < 10
do:
  i: i + 1
  value: [] <- i
PRINTLN: value
```

>[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
 
Equality, conditionals, reassignment:

```yaml
i: 4
if: i = 4
then:
  i: i + 1
  PRINTLN: i
PRINTLN: "Done"
```

> 5
>
> Done

### Motivation

At the time of writing this (some time in 2017) I wanted to create some form of a programming language. 
YAML was obviously the go-to starting point for this project. 
From there, I worked backwards to create what is the most seamless programming language made to date.

### A Short Explanation

This is all built on top of [Antlr4](https://www.antlr.org/). 
The parser is generated from the grammar file [YAML.g4](/src/main/antlr/YAML.g4).
Once generated, the parser can be used to create an AST for a given input string. 
The generated AST is then converted into the proper domain objects using an over-the-top visitor implementation in [Constructor](/src/main/java/in/kyle/yaml/Constructor.java)
Finally, the returned [Function](/src/main/java/in/kyle/yaml/internal/Function.java) is evaluated using a [Scope](/src/main/java/in/kyle/yaml/internal/Scope.java) to hold the relevant execution context.