# Seccion 6: Ciclos o Bucles en Java (While, do while, for)

## Índice:

### 1. Ejercicios

- [Ejercicio 1 - Contador numerico con verificación de entrada](#ejercicio-1-contador-numerico-con-verificación-de-entrada-while)
- [Ejercicio 2 - Números pares hasta un valor específico](#ejercicio-2-números-pares-hasta-un-valor-específico-while)
- [Ejercicio 3 - Números imparares descendentes](#ejercicio-3-números-imparares-descendente-do-while)
- [Ejercicio 4 - Suma acomulativa](#ejercicio-4-suma-acomulativa-for)

### 2. Test

- [Preguntas]()
- [Respuestas]()

### 3. Teoria

- [Diagramas de flujo]()

---

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

---

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

---

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

---

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
