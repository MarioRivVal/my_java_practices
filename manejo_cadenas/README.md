## **¿Qué es la Memoria Heap y la Memoria Stack en Java?**

? Cuando ejecutas un programa en Java, el sistema necesita guardar diferentes
tipos de datos. Para organizar esto, Java divide la memoria en **Heap** y
**Stack**

1. **Memoria Stack (Pila)**:

- Es más pequeña y más rápida.
- Guarda datos **temporales** como variables locales y referencias a objetos.
- Los datos en el Stack se eliminan automáticamente cuando ya no se necesitan
  (por ejemplo, cuando se sale de un método).

2. **Memoria Heap (Montón)**:

- Es más grande y más lenta que el Stack.
- Guarda **objetos** y datos más complejos.
- Los datos en el Heap son administrados por el recolector de basura (Garbage
  Collector) y no se eliminan automáticamente al salir de un método.

### Analogía Sencilla

Piensa en el Stack como una **bandeja apilada**: añades datos en la parte
superior (cuando entras en un método) y los quitas en el mismo orden (cuando
sales del método).

Piensa en el Heap como un **almacén grande**: puedes guardar cosas donde
quieras, pero necesitas una **etiqueta (referencia)** para encontrarlas.

## **¿Cómo Funciona Esto con Strings?**

En Java, los `String` son **objetos** especiales que se almacenan en el Heap,
pero sus referencias se guardan en el Stack.

### **Ejemplo Básico**

```java
public class Main {
    public static void main(String[] args) {
        String saludo = "Hola";
    }
}
```

- **Stack**:
  - Se guarda la referencia de `saludo` que apunta al objeto en el Heap.
- **Heap**:
  - Se guarda el objeto `"Hola"`.

---

## **Heap y el String Pool**

Java tiene una optimización especial para `String` llamada el **String Pool**.
Es una zona dentro del Heap donde se almacenan las cadenas **literales** únicas
para reutilizarlas, ahorrando memoria.

### Ejemplo:

```java
public class Main {
    public static void main(String[] args) {
        String saludo1 = "Hola";
        String saludo2 = "Hola";
    }
}
```

- **Heap (String Pool)**:

  - Solo se guarda **una instancia de `"Hola"`** porque ambas referencias
    (`saludo1` y `saludo2`) apuntan al mismo objeto literal.

- **Stack**:
  - `saludo1` y `saludo2` guardan la referencia al mismo objeto `"Hola"` en el
    String Pool.

---

## **¿Qué Pasa con `new String`?**

Cuando creas un `String` con `new`, fuerzas a Java a crear un **nuevo objeto en
el Heap**, incluso si la cadena ya existe en el String Pool.

### Ejemplo:

```java
public class Main {
    public static void main(String[] args) {
        String saludo1 = "Hola";         // Usa el String Pool
        String saludo2 = new String("Hola"); // Crea un nuevo objeto
    }
}
```

- **Heap (String Pool)**:

  - Contiene `"Hola"` que se reutiliza para `saludo1`.

- **Heap (Fuera del Pool)**:

  - Crea un segundo objeto `"Hola"` para `saludo2`.

- **Stack**:
  - `saludo1` apunta al String Pool.
  - `saludo2` apunta al nuevo objeto fuera del String Pool.

### **Comparación con `==` y `equals()`**

- `==` compara las **referencias** (si apuntan al mismo objeto).
- `equals()` compara el **contenido** (si los textos son iguales).

```java
System.out.println(saludo1 == saludo2);       // false (diferentes objetos)
System.out.println(saludo1.equals(saludo2)); // true (mismo contenido)
```

---

## **Ejemplo Completo**

```java
public class Main {
    public static void main(String[] args) {
        String texto1 = "Java";            // Se guarda en el String Pool
        String texto2 = "Java";            // Reutiliza el mismo objeto del String Pool
        String texto3 = new String("Java"); // Crea un nuevo objeto en el Heap

        System.out.println(texto1 == texto2);       // true (misma referencia en el Pool)
        System.out.println(texto1 == texto3);       // false (diferentes referencias)
        System.out.println(texto1.equals(texto3)); // true (mismo contenido)
    }
}
```

### Estado de la Memoria:

1. **Heap (String Pool)**:

   - `"Java"` (usado por `texto1` y `texto2`).

2. **Heap (Fuera del Pool)**:

   - Nuevo objeto `"Java"` (usado por `texto3`).

3. **Stack**:
   - `texto1` → referencia al String Pool.
   - `texto2` → referencia al String Pool.
   - `texto3` → referencia al nuevo objeto en el Heap.

---

## **Resumen**

- **Stack**:

  - Almacena **referencias** a objetos y variables locales.
  - Es temporal y más rápida.

- **Heap**:

  - Guarda los objetos `String`.
  - Contiene el **String Pool**, que reutiliza literales para ahorrar memoria.

- **String Pool**:
  - Es una optimización especial para cadenas literales únicas.
  - `new String` crea un objeto **fuera del Pool**.

¡Entendido! Vamos a desglosar estos conceptos (inmutabilidad de cadenas, manejo
de índices, y cadenas multilínea) de manera sencilla y clara, paso a paso.

---

## **Inmutabilidad de las Cadenas**

### **¿Qué significa que las cadenas sean inmutables?**

En Java, un `String` **no puede cambiar después de ser creado**. Si intentas
"modificarlo", en realidad se crea un **nuevo objeto en memoria** con el cambio
aplicado.

Esto significa que las cadenas no se pueden alterar directamente, pero puedes
generar nuevas cadenas basadas en ellas.

---

### **Ejemplo Básico**

```java
public class InmutabilidadEjemplo {
    public static void main(String[] args) {
        String texto = "Hola";

        // Intento de modificación
        texto = texto + " Mundo";

        // Salida
        System.out.println(texto); // Salida: Hola Mundo
    }
}
```

### **¿Qué ocurre en memoria?**

1. Se crea el `String` `"Hola"` en el Heap.
2. Cuando se concatena `" Mundo"`, se crea un **nuevo objeto** con el valor
   `"Hola Mundo"`.
3. La variable `texto` apunta al nuevo objeto, pero el original `"Hola"` sigue
   existiendo en la memoria hasta que sea eliminado por el Garbage Collector.

---

### **Ventajas de la Inmutabilidad**

1. **Seguridad:** Los objetos `String` son seguros para usar en múltiples hilos
   (thread-safe) porque no pueden cambiar.
2. **Eficiencia con el String Pool:** Si una cadena no cambia, se puede
   reutilizar desde el String Pool, ahorrando memoria.

---

## **Manejo de Índices en Cadenas**

### **¿Qué son los índices en cadenas?**

Cada carácter en una cadena tiene una posición (índice), que comienza en `0`.
Puedes acceder a un carácter específico usando el método `charAt`.

---

### **Ejemplo Básico: `charAt`**

```java
public class IndicesEjemplo {
    public static void main(String[] args) {
        String texto = "Java";

        // Acceso a caracteres por índice
        System.out.println(texto.charAt(0)); // Salida: J
        System.out.println(texto.charAt(1)); // Salida: a
        System.out.println(texto.charAt(2)); // Salida: v
    }
}
```

- **Índice 0:** Representa el primer carácter (`'J'` en este caso).
- **Índice 1:** Representa el segundo carácter (`'a'`).
- Y así sucesivamente.

---

### **¿Cómo recorrer toda una cadena?**

Usa un bucle para recorrer cada carácter en la cadena utilizando su índice.
(Veremos los bucles mas adelante)

```java
public class RecorrerCadena {
    public static void main(String[] args) {
        String texto = "Hola";

        for (int i = 0; i < texto.length(); i++) {
            System.out.println("Índice " + i + ": " + texto.charAt(i));
        }
    }
}
```

**Salida:**

```plaintext
Índice 0: H
Índice 1: o
Índice 2: l
Índice 3: a
```

---

### **Búsqueda en Cadenas**

Puedes buscar la posición (índice) de un carácter o palabra dentro de una cadena
usando:

1. **`indexOf`**: Encuentra la primera aparición de un carácter o texto.
2. **`lastIndexOf`**: Encuentra la última aparición de un carácter o texto.

```java
public class BusquedaEjemplo {
    public static void main(String[] args) {
        String texto = "Java es divertido";

        System.out.println(texto.indexOf('a')); // Salida: 1 (primera 'a')
        System.out.println(texto.lastIndexOf('a')); // Salida: 3 (última 'a')
        System.out.println(texto.indexOf("es")); // Salida: 5
    }
}
```

---

## **Cadenas Multilínea (Text Blocks)**

### **¿Qué es un Text Block?**

Los **text blocks** son una característica de Java (desde la versión 13) que
permiten escribir cadenas largas o de múltiples líneas de forma más legible.
Usan `"""` para definir el inicio y el fin.

### **¿Por Qué Usarlos?**

1. Hace que las cadenas largas (como HTML, JSON, o texto formateado) sean más
   fáciles de leer y escribir.
2. Evita el uso excesivo de concatenaciones o caracteres de escape.

---

### **Ejemplo de Texto Multilínea**

```java
public class TextBlockEjemplo {
    public static void main(String[] args) {
        String textoMultilinea = """
            Este es un bloque de texto
            que abarca varias líneas
            sin necesidad de concatenaciones.
            """;

        System.out.println(textoMultilinea);
    }
}
```

**Salida:**

```plaintext
Este es un bloque de texto
que abarca varias líneas
sin necesidad de concatenaciones.
```

---

### **Uso con JSON o HTML**

Los bloques de texto son útiles para trabajar con formatos como JSON o HTML.

#### **Ejemplo con JSON**

```java
public class JsonTextBlock {
    public static void main(String[] args) {
        String json = """
            {
                "nombre": "Juan",
                "edad": 30,
                "profesion": "Desarrollador"
            }
            """;

        System.out.println(json);
    }
}
```

#### **Ejemplo con HTML**

```java
public class HtmlTextBlock {
    public static void main(String[] args) {
        String html = """
            <html>
                <head>
                    <title>Mi Página</title>
                </head>
                <body>
                    <h1>Hola, Mundo</h1>
                </body>
            </html>
            """;

        System.out.println(html);
    }
}
```

---

### **Ventajas de los Text Blocks**

1. **Legibilidad:** Las cadenas largas son más fáciles de escribir y leer.
2. **Menos Errores:** No necesitas preocuparte tanto por caracteres de escape
   (`\n`, `\t`, etc.).
3. **Formato Automático:** Mantienen la estructura del texto como se escribe en
   el código.

---

## **Resumen**

- **Inmutabilidad:** Los `String` no pueden cambiar, y cada operación crea un
  nuevo objeto.
- **Índices en Cadenas:** Usa índices para acceder o buscar caracteres
  específicos.
- **Text Blocks:** Facilitan la escritura de cadenas largas y estructuradas.

¡Claro! Vamos a desglosar estos conceptos de forma clara y detallada, con
ejemplos sencillos para que un principiante pueda entender cómo funcionan los
métodos de cadenas y las formas de concatenarlas en Java.

---

## **Métodos de Cadenas**

Los métodos de cadenas son funciones predefinidas en la clase `String` que te
permiten trabajar con texto de manera eficiente. A continuación, te explico los
más comunes:

---

### **1.1 `length()`**

Devuelve la **longitud** (número de caracteres) de una cadena.

#### Ejemplo:

```java
public class MetodoLength {
    public static void main(String[] args) {
        String texto = "Hola Mundo";
        System.out.println("Longitud: " + texto.length()); // Salida: Longitud: 10
    }
}
```

---

### **1.2 `replace()`**

Reemplaza **todas las apariciones** de un carácter o texto específico por otro.

#### Ejemplo:

```java
public class MetodoReplace {
    public static void main(String[] args) {
        String texto = "Java es divertido";
        String reemplazado = texto.replace("a", "o");
        System.out.println(reemplazado); // Salida: Jovo es divertido
    }
}
```

---

### **1.3 `replaceAll()`**

Reemplaza texto basado en un **patrón (expresión regular)**.

#### Ejemplo:

```java
public class MetodoReplaceAll {
    public static void main(String[] args) {
        String texto = "123-456-789";
        String reemplazado = texto.replaceAll("\\d", "*"); // Reemplaza todos los dígitos
        System.out.println(reemplazado); // Salida: ***-***-***
    }
}
```

---

### **1.4 `toUpperCase()` y `toLowerCase()`**

- **`toUpperCase()`**: Convierte toda la cadena a **mayúsculas**.
- **`toLowerCase()`**: Convierte toda la cadena a **minúsculas**.

#### Ejemplo:

```java
public class MetodoToCase {
    public static void main(String[] args) {
        String texto = "Java Es Genial";
        System.out.println(texto.toUpperCase()); // Salida: JAVA ES GENIAL
        System.out.println(texto.toLowerCase()); // Salida: java es genial
    }
}
```

---

### **1.5 `trim()`**

Elimina los espacios en blanco al **principio** y al **final** de la cadena.

#### Ejemplo:

```java
public class MetodoTrim {
    public static void main(String[] args) {
        String texto = "   Hola Mundo   ";
        System.out.println("Antes: '" + texto + "'");
        System.out.println("Después: '" + texto.trim() + "'");
    }
}
```

**Salida:**

```plaintext
Antes: '   Hola Mundo   '
Después: 'Hola Mundo'
```

---

### **1.6 `substring()`**

Extrae una **subcadena** de una cadena. Puedes especificar:

- **Inicio:** Índice desde donde comienza.
- **Fin (opcional):** Índice donde termina (no incluido).

#### Ejemplo:

```java
public class MetodoSubstring {
    public static void main(String[] args) {
        String texto = "Java es divertido";
        System.out.println(texto.substring(5)); // Salida: es divertido
        System.out.println(texto.substring(5, 7)); // Salida: es
    }
}
```

---

### **1.7 `indexOf()` y `lastIndexOf()`**

- **`indexOf()`**: Encuentra la posición de la **primera aparición** de un
  carácter o texto.
- **`lastIndexOf()`**: Encuentra la posición de la **última aparición**.

#### Ejemplo:

```java
public class MetodoIndexOf {
    public static void main(String[] args) {
        String texto = "Java es divertido";
        System.out.println(texto.indexOf('a')); // Salida: 1 (primera 'a')
        System.out.println(texto.lastIndexOf('a')); // Salida: 3 (última 'a')
    }
}
```

---

## **2. Concatenación de Cadenas**

Concatenar significa **unir cadenas**. En Java, hay varias formas de hacerlo:

---

### **2.1 Operador `+`**

Es la forma más simple de concatenar cadenas.

#### Ejemplo:

```java
public class ConcatenarOperador {
    public static void main(String[] args) {
        String saludo = "Hola" + " Mundo";
        System.out.println(saludo); // Salida: Hola Mundo
    }
}
```

---

### **2.2 Método `concat()`**

Concatena otra cadena al final de la cadena actual.

#### Ejemplo:

```java
public class ConcatenarMetodo {
    public static void main(String[] args) {
        String saludo = "Hola".concat(" Mundo");
        System.out.println(saludo); // Salida: Hola Mundo
    }
}
```

---

### **2.3 Clase `StringBuilder`**

`StringBuilder` es una clase diseñada para concatenar cadenas de forma
**eficiente**. Es mutable, lo que significa que puedes modificar su contenido
sin crear nuevos objetos.

#### Ejemplo:

```java
public class ConcatenarStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hola");
        sb.append(" Mundo");
        System.out.println(sb.toString()); // Salida: Hola Mundo
    }
}
```

---

### **2.4 Clase `StringBuffer`**

`StringBuffer` es similar a `StringBuilder`, pero es **thread-safe**, lo que
significa que es seguro para usar en entornos con múltiples hilos.

#### Ejemplo:

```java
public class ConcatenarStringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hola");
        sb.append(" Mundo");
        System.out.println(sb.toString()); // Salida: Hola Mundo
    }
}
```

---

### **2.5 Método `String.join()`**

Une múltiples cadenas con un separador específico.

#### Ejemplo:

```java
public class ConcatenarJoin {
    public static void main(String[] args) {
        String resultado = String.join(", ", "Java", "Python", "C++");
        System.out.println(resultado); // Salida: Java, Python, C++
    }
}
```

---

## **Resumen**

### Métodos de Cadenas:

- **`length()`**: Devuelve el número de caracteres.
- **`replace()` y `replaceAll()`**: Reemplazan caracteres o patrones.
- **`toUpperCase()` y `toLowerCase()`**: Cambian a mayúsculas/minúsculas.
- **`trim()`**: Elimina espacios al inicio y al final.
- **`substring()`**: Extrae una parte de la cadena.
- **`indexOf()` y `lastIndexOf()`**: Encuentran posiciones de caracteres o
  texto.

### Concatenación de Cadenas:

- **Operador `+`**: Simple y directo.
- **`concat()`**: Similar al operador `+`.
- **`StringBuilder` y `StringBuffer`**: Eficientes para muchas concatenaciones.
- **`String.join()`**: Une múltiples cadenas con un separador.
