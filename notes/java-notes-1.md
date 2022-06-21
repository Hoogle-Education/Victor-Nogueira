# Relembrando alguns conceitos

## 1. Saídas

### Comum:
```java
  System.out.println("Minha string");
  System.out.print("Nao pulei linha");
```

### Formatando saídas de precisao:

```
printf(expressao_regular, parametro1, parametro2, ...);
```

```java
  int x = 10;
  System.out.printf("X = %d\n", x);
```

> `%d` é uma associação a valores inteiros.

```
X = 10
```

```java
  double pi = 3.14159265;
  System.out.printf("PI = %.2f\n", x);
```

```
PI = 3.14
```

## Entradas 

Para lidarmos com entradas digitadas pelo terminal, será necessário criar uma variável do tipo `Scanner`.

Será necessário importar a classe `Scanner`:

```java
  import java.util.Scanner;
```

```java
  Scanner sc = new Scanner(System.in);
```

Métodos
|método|objetivo|
|:-:|:-:|
|`.next()`|pega a proxima String até o espaço ou enter|
|`.nextInt()`|pega a proxima String e interpreta ela como inteiro|
|`.nextDouble()`/`.nextFloat()`|Capturam a variável no tipo correspondente|
|`.nextLine()`|Captura a linha até ler um caracter fim de linha (enter)|

🚩 Cuidado com o erro de leitura no `buffer`, um enter não consumido pode atrapalhar na leitura dos próximos dados.