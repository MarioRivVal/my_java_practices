# Seccion 7: Arreglos y Matrices

## Índice:

### 1. Ejercicios

- [Ejercicio 1 - Cálculo de Promedio con Arreglos](#ejercicio-1-cálculo-de-promedio-con-arreglos)
- [Ejercicio 2 - Suma de Diagonal de una Matriz ](#ejercicio-2-suma-de-diagonal-de-una-matriz)
- [Ejercicio 3 - Número Máximo y Mínimo ](#ejercicio-3--número-máximo-y-mínimo)
- [Ejercicio 4 - Contar Palabras y Longitudes de Cadenas](#ejercicio-4-contar-palabras-y-longitudes-de-cadenas)
- [Ejercicio 5 - Tablas de Frecuencia de Números](#ejercicio-5-tablas-de-frecuencia-de-números)

### 2. Test

- [Preguntas](#test-sobre-arrays)
- [Respuestas](#respuestas-del-test)

<hr style="border: 1px solid #136AC7;" />

## **Ejercicio 1: Cálculo de Promedio con Arreglos**

### **Descripción**

Crea un programa en Java que solicite al usuario una cantidad de calificaciones,
las almacene en un arreglo, y calcule el promedio redondeado de esas
calificaciones.

---

### **Requisitos**

1. El programa debe preguntar al usuario cuántas calificaciones desea ingresar.
2. Usar un arreglo para guardar todas las calificaciones.
3. Sumar las calificaciones y calcular el promedio redondeado.
4. Mostrar el promedio en la consola.

---

### **Ejemplo de Ejecución**

```plaintext
How many ratings will be calculated?: 3
ratings[0] = 80
ratings[1] = 90
ratings[2] = 85
The average of the 3 ratings is 85
```

---

**Nota:** Usa bucles para recorrer el arreglo y calcular la suma. Asegúrate de
redondear el promedio antes de mostrarlo.

<hr style="border: 1px solid #136AC7;" />

## Ejercicio 2: Suma de Diagonal de una Matriz

### **Descripción**

En este ejercicio trabajarás con matrices bidimensionales para practicar su
recorrido y manipulación. El programa mostrará los valores almacenados en la
matriz y sumará los elementos que se encuentren en la diagonal principal (donde
el número de fila y columna son iguales).

---

### **Requisitos**

1. Define una matriz `int` de 3x3 con valores predefinidos.
2. Usa bucles anidados para recorrer la matriz y mostrar cada elemento con su
   posición (índice de fila y columna).
3. Suma únicamente los elementos donde el índice de fila es igual al índice de
   columna (diagonal principal).
4. Muestra el resultado final de la suma.

---

### **Ejemplo de Ejecución**

```plaintext
myArray[0][0] = 10
myArray[0][1] = 20
myArray[0][2] = 30
myArray[1][0] = 40
myArray[1][1] = 50
myArray[1][2] = 60
myArray[2][0] = 70
myArray[2][1] = 80
myArray[2][2] = 90

The total for the cells with same index number is: 150
```

---

**Nota:** Usa dos bucles `for` para recorrer la matriz. Asegúrate de verificar
la condición para los elementos de la diagonal antes de sumarlos.

<hr style="border: 1px solid #136AC7;" />

 ## **Ejercicio 3 : Número Máximo y Mínimo**  

### **Instrucciones:**

1. **Descripción del problema:**  
   Imagina que necesitas procesar un conjunto de números ingresados por el usuario y determinar cuál es el número más grande y cuál es el más pequeño de todos ellos.  
   Sin embargo, en lugar de pedir los números uno por uno, el usuario introducirá todos los números en una sola línea, separados por un espacio. Tu tarea será tomar esta entrada, procesarla y determinar los valores máximo y mínimo.

2. **Requisitos del programa:**  
   - Solicita al usuario que ingrese una serie de números en una sola línea, separados por espacios.  
   - Convierte esta entrada en un array de enteros (`int[]`).  
   - Usa un bucle para recorrer el array y determinar el número máximo y el número mínimo.  
   - Imprime en consola el resultado, indicando cuál es el valor máximo y cuál es el mínimo.  

3. **Restricciones:**  
   - No puedes usar clases avanzadas. El enfoque debe basarse en bucles y manipulación manual de datos.  
   - Asegúrate de que el programa maneje correctamente entradas de diferentes tamaños (por ejemplo: 3 números, 10 números, etc.).  

4. **Ejemplo de entrada y salida esperada:**  

   **Entrada:**  
   ```
   Enter your numbers separated by space: 10 25 8 32 4 18
   ```

   **Salida:**  
   ```
   maxNumber = 32  
   minNumber = 4
   ```

<hr style="border: 1px solid #136AC7;" />

## **Ejercicio 4: Contar Palabras y Longitudes de Cadenas**

**Descripción:**  
Crea un programa en Java que permita al usuario ingresar un párrafo completo de texto (una o varias líneas) y luego analice y manipule las palabras contenidas en él.

---

#### **Instrucciones:**

1. **Entrada del usuario:**  
   El usuario ingresará un párrafo de texto. Por ejemplo:  
   ```
   Java is an amazing programming language. It is versatile and powerful!
   ```

2. **Requisitos del programa:**  
   - Divide el párrafo en palabras usando espacios y signos de puntuación como delimitadores (puedes usar expresiones regulares con el método `split()`).
   - Cuenta cuántas palabras hay en total.
   - Encuentra y muestra la palabra más larga y su longitud.  
   - Calcula el número de palabras que tienen más de 5 caracteres.
   - Imprime cada palabra en una nueva línea junto con su longitud.

3. **Salida esperada:**  
   Para el ejemplo anterior, el programa podría mostrar:  

   ```
   Total words: 9
   Longest word: programming (11 characters)
   Words with more than 5 characters: 3

   Word details:
   Java (4)  
   is (2)  
   an (2)  
   amazing (7)  
   programming (11)  
   language (8)  
   It (2)  
   is (2)  
   versatile (9)  
   ```

---

#### **Objetivo de aprendizaje:**  
- Procesamiento avanzado de cadenas (`String.split()` y expresiones regulares).  
- Uso de bucles para recorrer y analizar arreglos.  
- Comparaciones y uso de condicionales para encontrar valores máximos o específicos.  

<hr style="border: 1px solid #136AC7;" />


## **Ejercicio 5: Tablas de Frecuencia de Números**

**Descripción:**  
Crea un programa que permita al usuario ingresar una lista de números enteros en una sola línea, separados por espacios, y luego determinar cuál número aparece más veces en el array y cuántas veces aparece.

---

#### **Instrucciones:**

1. **Entrada del usuario:**  
   El usuario ingresará una lista de números enteros separados por espacios. Por ejemplo:  
   ```
   4 5 6 4 2 6 4 8 9 5 5 2 6 4
   ```

2. **Requisitos del programa:**  
   - Convierte la entrada del usuario en un array de enteros.
   - Iterar sobre el array para contar frecuencias
   - Encontrar el número con la mayor frecuencia
   - Imprimir el resultado.
     

3. **Salida esperada:**  
   Para la entrada dada, el programa podría mostrar:  
   ```
   The most frequent number is: 4
   It appears 4 times.
   ```

---

#### **Objetivo de aprendizaje:**  
- Uso de arrays para almacenar y analizar datos ingresados por el usuario.  
- Implementación de lógica para contar ocurrencias de elementos en un arreglo.  
- Uso de estructuras condicionales para analizar datos en base a criterios específicos.  
- Uso de bucles para organizar y mostrar resultados en un formato claro.  


<hr style="border: 1px solid #136AC7;" />


# **Test sobre Arrays**

1. **¿Cómo se declara un array en Java?**

   a) `int[] myArray;`  
   b) `array int myArray;`  
   c) `int myArray[];`

2. **¿Cómo se accede al primer elemento de un array llamado `arr`?**

   a) `arr[0];`  
   b) `arr[1];`  
   c) `arr[first];`

3. **¿Qué sucede si intentas acceder a un índice fuera del rango del array?**

   a) Se lanza una `ArrayIndexOutOfBoundsException`.  
   b) El programa devuelve `null`.  
   c) El programa se detiene sin error.

4. **¿Cuál es la longitud de este array? `int[] nums = {1, 2, 3, 4, 5};`**

   a) `4`  
   b) `5`  
   c) `6`

5. **¿Qué palabra clave se utiliza para crear un array en Java?**

   a) `array`  
   b) `new`  
   c) `create`

6. **¿Cómo puedes recorrer todos los elementos de un array en Java?**

   a) Usando un bucle `for` o un bucle `while`.  
   b) Usando un `if` para cada elemento.  
   c) Llamando al método `iterate()` del array.

7. **¿Qué tipo de dato puede contener un array en Java?**

   a) Solo tipos primitivos.  
   b) Solo tipos de objetos.  
   c) Cualquier tipo de dato válido.

8. **¿Cómo inicializas un array de enteros con tamaño 10 y todos los valores en 0?**

   a) `int[] arr = new int[10];`  
   b) `int[] arr = {0};`  
   c) `int[] arr = new int();`

9. **¿Qué devuelve `arr.length` para un array llamado `arr`?**

   a) El último índice del array.  
   b) El número total de elementos del array.  
   c) La capacidad máxima del array.

10. **¿Qué representa el índice de un array en Java?**

    a) La posición del elemento en el array.  
    b) El valor del elemento en el array.  
    c) El tamaño del array.

11. ¿Cómo conviertes un array de `String` a un solo `String` con separadores entre los **elementos?**

    a) Usando un bucle para concatenar los valores.  
    b) Usando `Arrays.toString(arr);` y manipulando el resultado.  
    c) Ambas son correctas.

12. **¿Qué ocurre si creas un array sin especificar su tamaño o elementos iniciales?**

    a) Lanza un error de compilación.  
    b) El array tiene un tamaño predeterminado de 10.  
    c) No puedes crear un array sin especificar tamaño o valores.

13. **¿Cuál es una forma válida de iterar un array con un bucle `for-each`?**

    a) `for (int i = arr.length; i > 0; i--) { ... }`  
    b) `for (int num : arr) { ... }`  
    c) `for (i in arr) { ... }`

14. **¿Cómo copias un array en otro array en Java?**

    a) Usando el método `clone()`.  
    b) Usando `System.arraycopy()`.  
    c) Ambas opciones son válidas.

15. **¿Qué sucede si intentas asignar un valor de tipo `double` a un array de tipo `int`?**

    a) Lanza un error de compilación.  
    b) El valor se convierte automáticamente a `int`.  
    c) Se lanza una `ClassCastException`.

16. **¿Cómo puedes inicializar un array bidimensional de 3 filas y 4 columnas?**

    a) `int[][] arr = new int[3][4];`  
    b) `int[3][4] arr = new int;`  
    c) `int arr[][] = new int[3, 4];`

17. ¿Cuál es el valor predeterminado de los elementos de un array de tipo `boolean` en J**ava?**

    a) `true`  
    b) `false`  
    c) No tiene valor predeterminado.

18. **¿Qué hace el método `Arrays.sort(arr)` en un array de enteros?**

    a) Ordena los elementos en orden ascendente.  
    b) Ordena los elementos en orden descendente.  
    c) No hace nada si el array ya está ordenado.

19. **¿Cuál es la forma correcta de inicializar un array con valores iniciales?**

    a) `int[] arr = {1, 2, 3};`  
    b) `int[] arr = new int{1, 2, 3};`  
    c) `int[] arr = int[3] {1, 2, 3};`

20. **¿Qué sucede si asignas un array a otro array (`arr2 = arr1`)?**

    a) Se crea una copia completa del array.  
    b) Ambos arrays apuntan al mismo espacio en memoria.  
    c) El contenido del array `arr1` se invierte.

<hr style="border: 1px solid #136AC7;" />

## **Respuestas del Test**

1. **a) `int[] myArray;`**  
   _Porque esta es la forma correcta de declarar un array en Java._  

2. **a) `arr[0];`**  
   _Porque los índices de los arrays comienzan en 0 en Java._  

3. **a) Se lanza una `ArrayIndexOutOfBoundsException`.**  
   _Porque acceder a índices fuera de rango provoca esta excepción en Java._  

4. **b) `5`**  
   _Porque hay 5 elementos en el array: {1, 2, 3, 4, 5}._  

5. **b) `new`**  
   _Porque en Java, `new` se utiliza para crear nuevas instancias, incluidos arrays._  

6. **a) Usando un bucle `for` o un bucle `while`.**  
   _Porque estas estructuras son adecuadas para recorrer todos los elementos de un array._  

7. **c) Cualquier tipo de dato válido.**  
   _Porque un array puede contener tanto tipos primitivos como objetos._  

8. **a) `int[] arr = new int[10];`**  
   _Porque al inicializar un array con `new`, sus elementos se establecen en 0 de forma predeterminada._  

9. **b) El número total de elementos del array.**  
   _Porque el atributo `length` de un array devuelve el total de elementos._  

10. **a) La posición del elemento en el array.**  
    _Porque el índice representa la ubicación relativa de un elemento en el array._  

11. **c) Ambas son correctas.**  
    _Porque se puede concatenar manualmente o usar métodos como `Arrays.toString()`._  

12. **a) Lanza un error de compilación.**  
    _Porque en Java, no puedes declarar un array sin especificar tamaño o elementos._  

13. **b) `for (int num : arr) { ... }`**  
    _Porque el bucle `for-each` tiene esta sintaxis en Java._  

14. **c) Ambas opciones son válidas.**  
    _Porque `clone()` y `System.arraycopy()` son métodos válidos para copiar arrays._  

15. **a) Lanza un error de compilación.**  
    _Porque Java no convierte automáticamente tipos incompatibles como `double` a `int`._  

16. **a) `int[][] arr = new int[3][4];`**  
    _Porque esta es la forma correcta de inicializar un array bidimensional._  

17. **b) `false`**  
    _Porque el valor predeterminado para booleanos en Java es `false`._  

18. **a) Ordena los elementos en orden ascendente.**  
    _Porque el método `Arrays.sort()` organiza elementos en orden ascendente por defecto._  

19. **a) `int[] arr = {1, 2, 3};`**  
    _Porque es la forma correcta de inicializar un array con valores específicos._  

20. **b) Ambos arrays apuntan al mismo espacio en memoria.**  
    _Porque en Java, los arrays son referencias, y la asignación no crea una copia._  

