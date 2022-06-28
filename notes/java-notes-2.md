# Estruturas Condicionais/Seleção

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

```java
double nota = 7.2;

if( nota >= 7.0 ) {
  System.out.println("Aprovado!");
} else {
  if( nota >= 4.0 ) {
    // recuperação
  } else {
    // reprovado
  }
}
```

melhorando...
```java
if ( nota >= 7.0) {
  // aprovado
} else if ( nota >= 4.0 ) {
  // recuperação
} else {
  // reprovado
}
```

## Proposições

Conectivo `&&` - *AND*

Ambas os testes devem retornar verdadeiro.

```java
if ( agua && cafe ) {
  // faço café
} else {
  // não faço
}
```

Conectivo `||` - *OR*

Pelo menos uma das expressões deve ser verdadeira.

```java
if(agua || suco) {
  // consigo matar a sede
} else {
  // nao consigo
}
```

```java
if(agua) {
  // consigo matar a sede
} else if(suco) {
  // consigo matar a sede
} else {
  // nao consigo
}
```