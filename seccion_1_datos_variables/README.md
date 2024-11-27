# Sección 1: Datos y Variables 🎉💻

## Ejercicio 1: Declaración de Variables y Operaciones Básicas

1. Declara tres variables para almacenar tu **edad**, **altura** en metros (con
   decimales) y la **inicial de tu nombre**. Usa tipos de datos primitivos
   adecuados para cada variable.
2. Declara otra variable `var` llamada `esEstudiante` que almacene un valor
   booleano indicando si eres estudiante.
3. Imprime todas las variables en una sola línea usando el operador `+` para
   concatenarlas. La salida debe verse como:

   ```
   Mi edad es 40, mi altura es 1.8m, mi inicial es M y soy estudiante? true
   ```

## Ejercicio 2: Concatenación de Cadenas y Uso de Strings

1. Declara dos variables `nombre` y `apellido` y asígnales tu nombre y apellido.
2. Usa la variable `var` para crear una variable `nombreCompleto` que contenga
   la concatenación de `nombre` y `apellido` con un espacio en medio.
3. Imprime `nombreCompleto` en la consola, junto con un mensaje que diga "Nombre
   completo: ".
4. Finalmente, imprime la longitud de `nombreCompleto` usando el método
   `.length()`.

   Ejemplo de salida:

   ```
   Nombre completo: Juan Perez
   Longitud del nombre completo: 10
   ```

   ## Ejercicio 3: Operaciones Matemáticas Básicas

5. Declara dos variables `var` llamadas `num1` y `num2` y asígnales dos valores
   enteros de tu elección.
6. Crea otras variables usando `var` para almacenar el resultado de sumar,
   restar, multiplicar y dividir `num1` y `num2`.
7. Imprime los resultados de cada operación en una nueva línea.

   Ejemplo de salida:

   ```
   Suma: 10
   Resta: 4
   Multiplicación: 20
   División: 2
   ```

## Ejercicio 4: Convertir Variables a Texto

1. Declara una variable `var` llamada `precio` y asígnale un valor decimal (como
   19.99).
2. Declara otra variable `int` llamada `cantidad` y asígnale un valor entero
   (como 3).
3. Calcula el **total** multiplicando `precio` por `cantidad`.
4. Usa el operador `+` para concatenar e imprimir una frase en la consola que
   diga: "El total es: [total]".

   Ejemplo de salida:

   ```
   El total es: 59.97
   ```

## Ejercicio 5: Uso de Variables y Constantes

1. Declara una constante `final` llamada `TASA_IVA` con un valor decimal que
   represente el porcentaje del IVA (por ejemplo, 0.16 para un IVA del 16%).
2. Declara una variable `var` llamada `precioBase` y asígnale un valor decimal
   que represente el precio base de un producto.
3. Calcula el **precioTotal** sumando el `precioBase` más el IVA correspondiente
   (multiplicando `precioBase` por `TASA_IVA`).
4. Imprime el valor de `precioBase`, `TASA_IVA`, y `precioTotal` en la consola
   con un mensaje descriptivo.

   Ejemplo de salida:

   ```plaintext
   Precio base: 100.0
   Tasa de IVA: 0.16
   Precio total con IVA: 116.0
   ```

---

## 🧾Test de Java Básico: Variables, `var`, `final`, y Concatenación de Cadenas

---

### 1. ¿Qué palabra clave permite declarar una constante en Java?

- A) const
- B) final
- C) static

---

### 2. ¿Cuál de los siguientes es un tipo de datos primitivo en Java?

- A) String
- B) int
- C) Array

---

### 3. ¿Qué tipo de valor almacena una variable declarada como `boolean`?

- A) Números enteros
- B) Verdadero o falso
- C) Cadenas de texto

---

### 4. ¿Cuál es la forma correcta de declarar una variable `final`?

- A) `int edad = 30;`
- B) `var edad = 30;`
- C) `final int edad = 30;`

---

### 5. ¿Cuál es el resultado de concatenar `"Hola" + " Mundo"` en Java?

- A) `"Hola Mundo"`
- B) `HolaMundo`
- C) `Hola + Mundo`

---

### 6. ¿Qué tipo de dato es adecuado para almacenar una altura en metros con decimales?

- A) `double`
- B) `char`
- C) `boolean`

---

### 7. ¿Cuál de las siguientes declaraciones es incorrecta?

- A) `var nombre = "Carlos";`
- B) `var altura = 1.75;`
- C) `final var edad = 25;`

---

### 8. ¿Qué valor tiene una variable `final` después de ser asignada?

- A) Puede cambiar
- B) Es constante y no puede cambiar
- C) Depende de si se usa `var`

---

### 9. ¿Cuál de estas variables usa inferencia de tipo?

- A) `int edad = 20;`
- B) `var edad = 20;`
- C) `final int edad = 20;`

---

### 10. ¿Cuál es el tipo de datos adecuado para almacenar un único carácter?

- A) `char`
- B) `String`
- C) `int`

---

### 11. ¿Cuál es el resultado de la operación `"Java " + "es " + "genial"`?

- A) `"Java es genial"`
- B) `Java + es + genial`
- C) `"Java es" + genial`

---

### 12. ¿Cuál es la salida de `System.out.println("Resultado: " + 5 + 3);`?

- A) `Resultado: 8`
- B) `Resultado: 53`
- C) `Resultado: 5 + 3`

---

### 13. ¿Cuál de las siguientes opciones permite al compilador inferir el tipo de la variable?

- A) `int`
- B) `final`
- C) `var`

---

### 14. ¿Cuál es la forma correcta de declarar una constante para el valor de PI?

- A) `final double PI = 3.14159;`
- B) `const double PI = 3.14159;`
- C) `var PI = 3.14159;`

---

### 15. ¿Cuál es la salida de `System.out.println("Suma: " + (2 + 3));`?

- A) `Suma: 5`
- B) `Suma: 23`
- C) `Suma: 2 + 3`

---

### 16. ¿Qué palabra clave convierte una variable en constante en Java?

- A) `static`
- B) `final`
- C) `const`

---

### 17. ¿Cuál de estas variables no puede ser modificada después de asignar su valor inicial?

- A) `var edad = 20;`
- B) `final int edad = 20;`
- C) `int edad = 20;`

---

### 18. ¿Qué operador se usa para concatenar cadenas en Java?

- A) `&`
- B) `+`
- C) `concat`

---

### 19. ¿Cuál de las siguientes variables es válida en Java?

- A) `int 1numero = 10;`
- B) `int numero = 10;`
- C) `int numero-total = 10;`

---

### 20. ¿Qué significa la declaración `final double DESCUENTO = 0.10;`?

- A) DESCUENTO puede cambiar su valor en cualquier momento
- B) DESCUENTO es una variable que puede ser modificada
- C) DESCUENTO es una constante cuyo valor no cambia

---

---

## Respuestas

1: B  
2: B  
3: B  
4: C  
5: A  
6: A  
7: C  
8: B  
9: B  
10: A  
11: A  
12: B  
13: C  
14: A  
15: A  
16: B  
17: B  
18: B  
19: B  
20: C
