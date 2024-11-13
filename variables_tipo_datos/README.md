README


# Introducción a Java

## Breve Historia de Java
Java fue creado a principios de los años 90 por **James Gosling** y su equipo en **Sun Microsystems** (ahora parte de Oracle). Originalmente, el lenguaje fue diseñado para dispositivos electrónicos, pero rápidamente ganó popularidad como un lenguaje versátil, confiable y seguro, ideal para aplicaciones de gran escala y programas multiplataforma. Su filosofía es "Escribe una vez, ejecuta en cualquier lugar" (_Write Once, Run Anywhere_ o WORA), lo que significa que los programas en Java pueden ejecutarse en cualquier plataforma sin necesidad de modificación.

## Tipos de Datos en Java

Java tiene dos categorías de tipos de datos:

1. **Tipos Primitivos:** Representan datos básicos y no son objetos. Ocupan menos memoria y son más rápidos. Hay 8 tipos primitivos en Java:
    - `byte`: un entero de 8 bits
    - `short`: un entero de 16 bits
    - `int`: un entero de 32 bits
    - `long`: un entero de 64 bits
    - `float`: un número de punto flotante de 32 bits
    - `double`: un número de punto flotante de 64 bits
    - `char`: un carácter Unicode de 16 bits
    - `boolean`: almacena `true` o `false`

2. **Tipos de Referencia:** Estos son todos los demás tipos, como las **clases**, **interfaces**, **arrays** y **cadenas de texto** (`String`). A diferencia de los tipos primitivos, los tipos de referencia apuntan a objetos en la memoria y, por lo tanto, pueden tener valores nulos (`null`).

## Declaración y Creación de Variables en Java

En Java, las variables se declaran especificando primero el tipo de datos, seguido del nombre de la variable. La asignación de un valor es opcional al momento de la declaración.

### Sintaxis de Declaración de Variables

```java
tipo nombreVariable = valorInicial;
```
- `tipo`: el tipo de dato de la variable.
- `nombreVariable`: el identificador de la variable.
- `valorInicial` (opcional): el valor con el que inicializamos la variable.

### Ejemplos
```java
// Tipos primitivos
int edad = 25;
double salario = 4500.50;
char inicial = 'J';
boolean esEstudiante = true;

// Tipos de referencia
String nombre = "Juan Perez";
int[] numeros = {1, 2, 3, 4, 5};
```
### Ejemplo Completo en programa
Este es un programa básico en Java que declara variables y las imprime en la consola:
```java
public class Main {
    public static void main(String[] args) {
        // Tipos primitivos
        int edad = 30;
        double salario = 8500.75;
        char inicial = 'J';
        boolean esEstudiante = false;

        // Tipos de referencia
        String nombre = "Laura García";
        int[] numeros = {10, 20, 30, 40, 50};

        // Imprimir las variables
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Salario: " + salario);
        System.out.println("Inicial: " + inicial);
        System.out.println("Es estudiante: " + esEstudiante);
        System.out.println("Números: ");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
    }
}
```
### Salida Esperada
```yaml
Nombre: Laura García
Edad: 30
Salario: 8500.75
Inicial: J
Es estudiante: false
Números:
10 20 30 40 50
```
## Resumen
Java es un lenguaje orientado a objetos con una rica historia y una sintaxis que permite tanto trabajar con tipos básicos como manipular objetos complejos. En esta guía, exploramos los tipos de datos primitivos y de referencia, y vimos ejemplos de cómo crear y usar variables en un programa Java.