# Estruturas Condicionais

## Estrutura `if` - *Se*

```java
if(/*condição*/) {
  /*código se for verdade*/
}
```

```java
if( media >= 7.0 ) {
  System.out.println("Aprovado!");
}

if( media < 7.0 ) {
  System.out.println("Recuperação");
}
```

## Estrutura `if-else` - *Se-Senão*

melhorando...
```java
if( media >= 7.0 ) {
  System.out.println("Aprovado!");
} else {
  System.out.println("Recuperação");
}
```

## Estrutura `if-else if-else`

O `else if` serve para colocarmos diversos testes sucessivos linkados a um mesmo `if`.