# Seccion 6: Ciclos o Bucles en Java (While, do while, for)

## Índice:

### 1. Ejercicios

- [Ejercicio 1 - Contador numerico con verificación de entrada](#ejercicio-1-contador-numerico-con-verificación-de-entrada-while)
- [Ejercicio 2 - Números pares hasta un valor específico](#ejercicio-2-números-pares-hasta-un-valor-específico-while)
- [Ejercicio 3 - Números imparares descendentes](#ejercicio-3-números-imparares-descendente-do-while)
- [Ejercicio 4 - Suma acomulativa](#ejercicio-4-suma-acomulativa-for)
- [Ejercicio 5 - Cajero automático](#ejercicio-5-operaciones-bancarias-en-un-cajero-automático)
- [Ejercicio 6 - Calculadora básica](#ejercicio-6-calculadora-básica)
- [Ejercicio 7 - Validación de contraseña](#ejercicio-7-validación-de-contraseñas)
- [Ejercicio 8 - Juego adivina número secreto](#ejercicio-8-juego-adivina-el-número-secreto)

### 2. Test

- [Preguntas]()
- [Respuestas]()

### 3. Teoria

- [Diagramas de flujo]()

<hr style="border: 1px solid #136AC7;" />

## **Ejercicio 1: Contador numerico con verificación de entrada (while)**

**Objetivo del ejercicio:** Escribir un programa en Java que solicite al usuario
ingresar un número entero válido. El programa debe usar ciclos para validar la
entrada y repetir la solicitud si el usuario ingresa un dato incorrecto. Una vez
ingresado un número válido, el programa debe imprimir los números del 1 hasta el
número ingresado usando un ciclo `while`.

### Detalles del Ejercicio:

1. **Solicitud de un número entero:**  
   El programa debe solicitar al usuario un número entero. Si el usuario ingresa
   algo no válido, debe mostrar un mensaje de error y repetir la solicitud.

2. **Ciclo de validación:**  
   Usa un bucle infinito (`while (true)`) para asegurarte de que la solicitud se
   repita hasta que el usuario ingrese un dato válido.

3. **Impresión de números:**  
   Una vez ingresado un número entero, usa un segundo ciclo `while` para
   imprimir los números desde `1` hasta el valor ingresado.

4. **Consideraciones:**
   - Verifica si la entrada es válida usando el método `hasNextInt()` de la
     clase `Scanner`.
   - Limpia el buffer de entrada (`console.nextLine()`) si el usuario ingresa un
     dato no válido.

### **Ejemplo de Ejecución**

#### Caso 1: Entrada válida

```
Please enter an integer number: 5
1
2
3
4
5
```

#### Caso 2: Entrada inválida

```
Please enter an integer number: abc
Invalid number, please try again
Please enter an integer number: 7
1
2
3
4
5
6
7
```

### Notas para el estudiante:

- Este ejercicio es ideal para practicar los ciclos `while` y el manejo de
  entradas en Java.
- Aunque puedes resolver esto con otros ciclos (`for`, `do-while`), **en este
  caso, el enfoque es usar `while` exclusivamente.**
- La verificación de entrada con `hasNextInt()` es importante para evitar
  errores y asegurar un programa robusto.

### Diagrama de flujo

![Diagrama de flujo](./img/ejercicio1.png)

<hr style="border: 1px solid #136AC7;" />

## **Ejercicio 2: Números Pares hasta un Valor Específico (while)**

### Descripción:

Crea un programa en Java que permita al usuario ingresar un número entero
positivo y, como resultado, muestre todos los números pares desde 1 hasta el
número ingresado. Si el usuario ingresa un valor inválido (no entero), el
programa deberá informarle del error y solicitar de nuevo un número válido.

### Requisitos:

1. Usa un **ciclo `while`** para solicitar el número hasta que el usuario
   ingrese un valor válido.
2. Usa otro **ciclo `while`** para iterar desde 1 hasta el número ingresado y
   mostrar los números pares.
3. Valida el dato ingresado con un método como `hasNextInt()` para evitar
   errores.
4. Diseña el programa de forma que sea robusto y no termine hasta que el usuario
   ingrese un número válido.
5. Asegúrate de que la salida sea clara, mostrando los números pares separados
   por comas.

### Entradas esperadas:

- Un número entero positivo ingresado por el usuario.

### Salidas esperadas:

- Si el número es válido: Lista de los números pares hasta el valor ingresado.
- Si el número es inválido: Un mensaje indicando el error y solicitando un nuevo
  valor.

### Ejemplo de interacción con el programa:

```
Please enter a integer number: five
Invalid input, try again
Please enter a integer number: -4
Invalid input, try again
Please enter a integer number: 10
2, 4, 6, 8, 10,
```

### Notas para el estudiante:

- Este ejercicio busca que practiques el uso del **ciclo `while`** y la
  validación de entradas.
- Reflexiona sobre cómo usar condicionales (`if`) para realizar cálculos dentro
  del ciclo.
- Recuerda que la implementación con el ciclo `while` es solo una forma de
  resolverlo. Alternativamente, podrías usar otros ciclos como `for` para
  practicar, pero aquí el enfoque será en `while`.
- **Tip:** La validación de la entrada es clave para evitar errores, y el
  programa no debe finalizar hasta que el usuario proporcione un valor correcto.

<hr style="border: 1px solid #136AC7;" />

## **Ejercicio 3: Números imparares descendentes (do, while)**

### Descripción:

En este ejercicio, tu tarea será escribir un programa que solicite al usuario
ingresar un número entero positivo y, utilizando un ciclo `do-while`, imprima en
orden descendente todos los números impares desde el número ingresado hasta 1.

### Requisitos:

1. **Validación del número ingresado:**

   - El programa debe verificar que el usuario ingrese un número entero. Si no
     lo hace, debe mostrar un mensaje de error y solicitar nuevamente el número.
   - También debe asegurarse de que el número ingresado sea positivo. Si el
     número no cumple esta condición, deberá informar al usuario y volver a
     pedir el número.

2. **Uso del ciclo `do-while`:**

   - Una vez que el programa valida que el número ingresado es un entero
     positivo, debe utilizar un ciclo `do-while` para iterar desde el número
     ingresado hacia abajo.
   - Dentro del ciclo, debes comprobar si cada número es impar y, si lo es,
     imprimirlo en la consola.

3. **Estructura clara y mensajes descriptivos:**
   - Asegúrate de incluir mensajes claros para guiar al usuario durante la
     ejecución del programa.

### Ejemplo de ejecución esperado:

```
Please, enter a positive integer number: -5
The number must be positive. Please try again.
Please, enter a positive integer number: abc
Invalid input, try again.
Please, enter a positive integer number: 8
7, 5, 3, 1,
```

### Recomendaciones:

- **Usa un bucle `while` o `do-while`** para la validación de la entrada del
  usuario. Este enfoque asegura que el programa continúe solicitando un valor
  válido hasta que el usuario ingrese uno correcto.
- **Utiliza condiciones dentro del ciclo `do-while`** para determinar si un
  número es impar antes de imprimirlo.
- **Recuerda limpiar el buffer del `Scanner`** en caso de que el usuario ingrese
  datos no válidos.

**Nota:** Este ejercicio tiene como objetivo que practiques el uso del ciclo
`do-while`. Aunque otros enfoques también son posibles, te animamos a usar este
ciclo para cumplir con el propósito didáctico.

### Diagrama de flujo

![Diagrama de flujo](./img/ejercicio3.png)

<hr style="border: 1px solid #136AC7;" />

## **Ejercicio 4: Suma acomulativa (for)**

### Descripción:

Escribe un programa que:

1. Solicite al usuario ingresar un número entero positivo.
2. Utilice un ciclo `for` para recorrer los números del `1` al número ingresado
   por el usuario.
3. En cada iteración del ciclo:
   - Sume el número actual al total acumulado.
   - Imprima en pantalla la operación que se está realizando (por ejemplo,
     `0 + 1 = 1` en la primera iteración).
4. Al finalizar el ciclo, el programa debe haber calculado la suma de todos los
   números del rango y mostrar la suma total.

#### **Ejemplo de ejecución:**

Si el usuario ingresa el número `5`, el programa debe imprimir lo siguiente:

```
Enter a integer number: 5
0 + 1 = 1
1 + 2 = 3
3 + 3 = 6
6 + 4 = 10
10 + 5 = 15
```

El programa calcula que la suma acumulativa de `1` a `5` es `15`.

<hr style="border: 1px solid #136AC7;" />

## **Ejercicio 5: Operaciones bancarias en un Cajero Automático**

En este desafío, aprenderás a implementar un programa que simule el
funcionamiento básico de un cajero automático (**ATM**) utilizando conceptos
clave de programación como estructuras de control `while`, `switch`, y variables
acumulativas.

### **Objetivos del ejercicio**

1. **Interactuar con el usuario:**
   - Solicitar diferentes operaciones como depósitos, retiros, consulta de saldo
     y cierre de sesión.
2. **Usar estructuras de control de flujo:**
   - Implementar un `while` para permitir múltiples operaciones consecutivas
     hasta que el usuario cierre sesión.
   - Usar un `switch` para decidir qué operación ejecutar según la elección del
     usuario.
3. **Gestionar el saldo:**
   - Actualizar el saldo tras depósitos o retiros, validando que no se pueda
     retirar más del saldo disponible.
4. **Hacer uso de buenas prácticas:**
   - Escribir un código claro y organizado con mensajes amigables para el
     usuario.

### **Instrucciones**

1. **Introducción del programa:**

   - Escribe un mensaje de bienvenida que simule la interfaz de un cajero
     automático moderno.
   - Muestra un menú con 4 opciones:
     1. Depositar dinero.
     2. Retirar dinero.
     3. Ver saldo.
     4. Cerrar sesión.

2. **Implementación de cada funcionalidad:**

   - **Depósito:** Solicita al usuario un monto a depositar y actualiza el
     saldo.
   - **Retiro:** Solicita un monto a retirar, validando que no supere el saldo
     actual.
   - **Consulta de saldo:** Muestra el saldo actualizado.
   - **Cerrar sesión:** Termina el programa con un mensaje de agradecimiento.

3. **Manejo de errores:**
   - Si el usuario selecciona una opción no válida, muestra un mensaje de error
     y vuelve al menú principal.

### **Requisitos del programa**

1. Usa un **bucle `while`** para mantener el programa activo hasta que el
   usuario seleccione la opción de cerrar sesión.
2. Usa un **`switch`** para gestionar las opciones del menú.
3. Implementa validaciones de entrada para evitar errores:
   - Asegúrate de que los montos ingresados sean numéricos y mayores a 0.
   - En el caso de retiros, verifica que el monto solicitado no exceda el saldo
     disponible.
4. Escribe mensajes claros y agradables para mejorar la experiencia del usuario.

### Diagrama de flujo

![Diagrama de flujo](./img/ejercicio5.png)

<hr style="border: 1px solid #136AC7;" />

## **Ejercicio 6: Calculadora Básica**

En este ejercicio, vamos a construir una **calculadora interactiva** utilizando
estructuras de control, bucles y manejo de entrada/salida en Java.

---

### Instrucciones del ejercicio:

1. **Objetivo del programa:**  
   Crear una calculadora básica que permita realizar las operaciones de suma,
   resta, multiplicación y división. El programa continuará ejecutándose hasta
   que se ingrese una opción válida y se muestren los resultados.

2. **Pasos principales a implementar:**

   - Mostrar un menú con las opciones de operaciones disponibles:  
     `1. Addition`, `2. Subtraction`, `3. Multiplication`, `4. Division`.
   - Leer las entradas del usuario (selección de operación, primer número y
     segundo número).
   - Verificar que la entrada del usuario sea válida. Si no lo es, mostrar un
     mensaje y pedir una nueva entrada.
   - Realizar la operación seleccionada y mostrar el resultado en un formato
     legible y profesional (por ejemplo, con 2 decimales).
   - Manejar errores como **división por cero** con mensajes adecuados.

3. **Puntos clave:**
   - Usa un **bucle `while`** para permitir reintentos en caso de una entrada no
     válida.
   - Usa un **switch** para ejecutar la operación seleccionada.
   - Usa el formato `System.out.printf` para mostrar los resultados con
     precisión.

---

### **Tareas**

1. **Ejecutar el programa:**  
   Prueba diferentes casos, como:

   - **Suma:** `5 + 3`.
   - **Resta:** `10 - 7`.
   - **Multiplicación:** `2 * 8`.
   - **División válida:** `16 / 4`.
   - **División inválida:** `7 / 0`.

2. **Analizar el código:**  
   Asegúrate de comprender cómo funciona cada parte del programa, incluyendo:
   - **Validación de entrada (`if` con `scanner.hasNextInt()`).**
   - **Switch-case para operaciones.**
   - **Formato de salida con `System.out.printf`.**

---

### Resultado esperado:

1. El programa debe mostrar un menú y esperar que el usuario seleccione una
   opción.
2. Según la selección, solicitará los números, ejecutará la operación y mostrará
   el resultado con un formato adecuado (dos decimales).
3. Si el usuario ingresa algo no válido, debe mostrar un mensaje de error y
   volver a pedir una entrada válida.

<hr style="border: 1px solid #136AC7;" />

## **Ejercicio 7: Validación de contraseñas**

En este ejercicio, practicarás el uso de estructuras de control, manejo de
cadenas y el ciclo `while` para validar entradas del usuario. El objetivo es
crear un programa que permita al usuario ingresar una contraseña con ciertas
restricciones, verificarlas, y aceptarla solo si cumple con los requisitos.

---

#### **Instrucciones:**

1. **Contexto del programa:**

   - El programa debe solicitar al usuario que ingrese una nueva contraseña.
   - La contraseña debe cumplir con las siguientes condiciones:
     - Tener al menos 6 caracteres.
     - No tener más de 10 caracteres.

2. **Flujo del programa:**

   - Mientras la contraseña ingresada no cumpla con las reglas, el programa debe
     seguir solicitando una nueva entrada.
   - Una vez que el usuario ingrese una contraseña válida, el programa debe
     mostrar un mensaje indicando que la contraseña ha sido aceptada y luego
     finalizar.

3. **Pautas para completar el código:**

   - Usa un ciclo `while` para continuar solicitando la contraseña si no es
     válida.
   - Usa los métodos de la clase `String` para verificar la longitud de la
     contraseña.
   - Asegúrate de imprimir un mensaje de error claro cuando la contraseña no
     cumpla con las condiciones.

4. **Restricciones del programa:**
   - El rango de caracteres permitidos debe ser fácil de ajustar en el programa
     (por ejemplo, usando variables como `MIN_CHAR` y `MAX_CHAR`).

<hr style="border: 1px solid #136AC7;" />

## **Ejercicio 8: Juego adivina el número secreto**

### **Descripción**

En este ejercicio, crearás un programa en Java que desafíe al usuario a adivinar
un **número secreto** generado aleatoriamente por la computadora. El objetivo es
proporcionar una experiencia interactiva y entretenida, utilizando estructuras
de control y validaciones para guiar al usuario durante el juego.

---

### **Requisitos del programa**

1. El programa debe generar un número aleatorio entre **1** y **50** al inicio
   del juego. Este será el número secreto que el usuario debe adivinar.

2. El usuario tendrá **10 intentos** para adivinar el número secreto. Cada vez
   que ingrese un número:

   - Si el número es correcto, el programa debe felicitar al usuario y mostrar
     cuántos intentos le tomó acertar.
   - Si el número es incorrecto, el programa debe dar una pista indicando si el
     número secreto es **mayor** o **menor** al número ingresado.

3. Si el usuario no logra adivinar el número en 10 intentos:

   - El programa debe mostrar un mensaje indicando que el juego ha terminado y
     revelar el número secreto.

4. Si deseas, opcionalmente puedes hacer que el programa sea más interesante
   utilizando colores en los mensajes. Por ejemplo:
   - Verde para mensajes de bienvenida.
   - Azul para mensajes de victoria.
   - Rojo para mensajes de error o "game over".

---

### **Pistas para completar el ejercicio**

- Usa la clase `Random` para generar el número secreto. ¿Recuerdas cómo
  hacerlo?  
  Si no, investiga cómo usar el método `nextInt()` de la clase `Random`.

- Usa un bucle `while` para repetir el juego hasta que el usuario gane o se
  queden sin intentos.

- Usa condicionales `if` para comparar la entrada del usuario con el número
  secreto y dar retroalimentación.

- Para manejar entradas inválidas, puedes usar un bloque `try-catch` con la
  excepción `NumberFormatException`.

---

### **Resultado esperado**

Al ejecutar el programa, debería verse algo como esto en la consola (los
mensajes en color son opcionales):

```
WELCOME TO THE GUESSING GAME! 🎉
---------------------------------
Adivina el número secreto entre 1 y 50.

Intento 1: Ingresa un número: 25
El número secreto es mayor.

Intento 2: Ingresa un número: 40
El número secreto es menor.

Intento 3: Ingresa un número: 35
¡Felicidades! 🎉 Adivinaste el número secreto en 3 intentos.
```

O, si el jugador falla todos los intentos:

```
Intento 10: Ingresa un número: 5
GAME OVER. 😢 Has agotado tus intentos.
El número secreto era 7.
```

---

### **Requisitos adicionales (opcional)**

1. **Hazlo más interesante**:

   - Agrega un mensaje especial si el jugador acierta en su **primer intento**.
     Ejemplo: "¡Impresionante! Adivinaste el número en el primer intento."

2. **Configuración personalizada**:

   - Permite al usuario elegir la cantidad máxima de intentos antes de iniciar
     el juego.

3. **Bucles adicionales**:
   - Después de terminar, pregunta al usuario si desea jugar nuevamente.

---

### Diagrama de flujo

![Diagrama de flujo](./img/ejercicio8.png)
