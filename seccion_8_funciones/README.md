# Seccion 8: Funciones

## Índice:

### 1. Ejercicios

- [Ejercicio 1 - Cálculo de Promedio con Arreglos](#ejercicio-1-cálculo-de-promedio-con-arreglos)
- [Ejercicio 2 - Verificar si una palabra es un Palíndromo](#ejercicio-2-verificar-si-una-palabra-es-un-palíndromo)
- [Ejercicio 3 - Analizador de Cadenas](#ejercicio-3-analizador-de-cadenas)
- [Ejercicio 4 - Calculadora de Notas](#ejercicio-4-calculadora-de-notas)
- [Ejercicio 5 - Contador de Dígitos](#ejercicio-5-contador-de-dígitos)
- [Ejercicio 6 - Análisis de alturas](#ejercicio-6-análisis-de-alturas)


### 2. Test

- [Preguntas](#test-funciones-en-java)
- [Respuestas](#respuestas-del-test)

<hr style="border: 1px solid #136AC7;" />

## **Ejercicio 1: Suma y Promedio de un Array**
**Descripción:**  
Escribe un programa que permita al usuario ingresar una lista de números enteros, los almacene en un array, y utilice funciones, cada una para un proposito diferente.

**Requisitos:**
- Usa una función para calcular la suma.  
- Usa otra función para calcular el promedio.  
- Usa una función para imprimir los resultados.

**Ejemplo de ejecución:**
```text
Ingrese números separados por espacios: 4 8 15 16 23 42
Suma: 108
Promedio: 18.0
```

<hr style="border: 1px solid #136AC7;" />


## **Ejercicio 2: Verificar si una palabra es un Palíndromo**
**Descripción:**  
Escribe un programa que permita al usuario ingresar una palabra y determine si es un palíndromo. Usa funciones para:  
1. Verificar si la palabra es igual al reverso de sí misma.  
2. Imprimir un mensaje indicando si es o no un palíndromo.

**Requisitos:**
- Crea una función que tome una cadena como parámetro y devuelva `true` si es un palíndromo, o `false` de lo contrario.  
- Usa una función para imprimir el resultado.

**Ejemplo de ejecución:**
```text
Ingrese una palabra: radar
La palabra "radar" es un palíndromo.

Ingrese una palabra: hola
La palabra "hola" no es un palíndromo.
```
---

¡Claro! Aquí tienes **tres ejercicios avanzados** sobre funciones en Java que integran condicionales, bucles, ingreso por consola y manipulación de strings o arrays. Estos ejercicios están diseñados para hacerte pensar y profundizar más en el uso de funciones.

<hr style="border: 1px solid #136AC7;" />

## **Ejercicio 3: Analizador de Cadenas**
Escribe un programa que reciba una cadena de texto por consola y realice las siguientes operaciones usando funciones:
1. Contar el número de palabras en la cadena.
2. Encontrar la palabra más larga.
3. Determinar cuántas palabras comienzan con una vocal.

### Requisitos:
- Usa al menos 3 funciones: una para contar palabras, otra para encontrar la palabra más larga, y otra para contar las que inician con vocal.
- Utiliza bucles y manejo de strings.

**Ejemplo de entrada:**
```
Ingresa una frase: "Java es un lenguaje de programación increíble"
```

**Salida esperada:**
```
Total de palabras: 7
La palabra más larga es: programación
Número de palabras que empiezan con vocal: 3
```

<hr style="border: 1px solid #136AC7;" />

## **Ejercicio 4: Calculadora de Notas**
Escribe un programa que permita al usuario ingresar las calificaciones de varios estudiantes y determine:
1. El promedio general de las calificaciones.
2. La nota más alta.
3. El número de estudiantes con una nota mayor o igual a 90.

### Requisitos:
- Usa un array para almacenar las calificaciones.
- Usa al menos 3 funciones:
  - Una para calcular el promedio.
  - Una para encontrar la nota más alta.
  - Una para contar cuántos estudiantes tienen notas ≥ 90.

**Ejemplo de entrada:**
```
Ingresa las notas separadas por espacio: 85 90 78 92 88 95
```

**Salida esperada:**
```
Promedio de notas: 88.0
Nota más alta: 95
Estudiantes con notas mayores o iguales a 90: 3
```

<hr style="border: 1px solid #136AC7;" />

## **Ejercicio 5: Contador de Dígitos**
Crea un programa que reciba varios números enteros separados por un espacio y determine:
1. Cuántos números tienen exactamente 3 dígitos.
2. Cuántos números son pares.
3. El promedio de los números ingresados.

### Requisitos:
- Usa un array para almacenar los números.
- Usa al menos 3 funciones:
  - Una para contar los números con 3 dígitos.
  - Una para contar los números pares.
  - Una para calcular el promedio.

**Ejemplo de entrada:**
```
Ingresa números separados por espacio: 123 4567 89 432 101 22 990
```

**Salida esperada:**
```
Números con 3 dígitos: 3
Números pares: 3
Promedio: 631.71
```

<hr style="border: 1px solid #136AC7;" />

## **Ejercicio 6: Análisis de alturas**

En este ejercicio, trabajarás con datos de alturas para realizar un análisis estadístico sencillo. Tendrás que implementar un programa en Java que cumpla los siguientes requisitos:

1. **Entrada de datos**:
   - El programa debe solicitar al usuario que introduzca las alturas de un grupo de personas, separadas por espacios (por ejemplo: `1.70 1.80 1.65 1.90`).
   - Asegúrate de validar que la entrada no esté vacía y sea válida para convertirla a números.

2. **Cálculo de la media**:
   - Implementa una función que calcule el promedio (media) de las alturas dadas y lo redondee a dos decimales.

3. **Contar personas según la media**:
   - Implementa una función para contar cuántas personas tienen una altura superior a la media.
   - Implementa otra función para contar cuántas personas tienen una altura inferior a la media.

4. **Salida de resultados**:
   - El programa debe mostrar:
     - La altura promedio.
     - El número de personas más altas que la media.
     - El número de personas más bajas que la media.

5. **Consideraciones adicionales**:
   - Si la entrada está vacía o no es válida, muestra un mensaje indicando que no se han introducido datos y termina el programa.
   - Usa funciones para estructurar el código, como conversión de datos, cálculo de la media y conteo de personas.

**Ejemplo de interacción con el programa**:  

Entrada del usuario:  
```
1.50 1.65 1.80 1.52 1.90 1.78 1.67 1.78 1.67 1.86 1.82 1.79
```

Salida esperada:  
```
La media de las alturas es: 1.73  
Personas más altas de la media: 6  
Personas más bajas de la media: 6  
```
<hr style="border: 1px solid #136AC7;" />


# **Test: Funciones en Java**

#### 1. ¿Cuál es el propósito principal de una función en Java?
a) Almacenar datos.  
b) Reutilizar código.  
c) Crear objetos.

#### 2. ¿Qué palabra clave se utiliza para declarar una función en Java?  
a) method  
b) void  
c) return  

#### 3. ¿Qué ocurre si no se especifica un valor de retorno en una función que no es `void`?  
a) Genera un error de compilación.  
b) Devuelve automáticamente `null`.  
c) Devuelve un valor predeterminado.

#### 4. ¿Qué modificador de acceso permite que una función sea accesible desde cualquier lugar?  
a) protected  
b) public  
c) private  

#### 5. ¿Qué significa `static` en una función?  
a) La función pertenece a la clase, no a las instancias.  
b) La función puede acceder a variables privadas.  
c) La función solo puede llamarse desde un constructor.

#### 6. ¿Cómo defines una función con un argumento opcional en Java?  
a) Declarando una sobrecarga del método con valores predeterminados.  
b) Usando la palabra clave `optional`.  
c) Java no soporta argumentos opcionales directamente.

#### 7. ¿Qué devuelve una función `void` en Java?  
a) `null`.  
b) Nada.  
c) Una cadena vacía.

#### 8. ¿Qué operador se usa para llamar una función de una clase?  
a) `->`  
b) `.`  
c) `::`

#### 9. ¿Qué es una función sobrecargada?  
a) Una función que tiene múltiples versiones con diferentes nombres.  
b) Una función que tiene el mismo nombre, pero diferente lista de parámetros.  
c) Una función que devuelve valores diferentes según su tipo.

#### 10. ¿Cómo se llama al conjunto de parámetros de una función?  
a) Argumentos.  
b) Prototipo.  
c) Firma.

#### 11. ¿Es posible que dos funciones tengan el mismo nombre pero diferente lista de parámetros en Java?  
a) No, esto genera un error de compilación.  
b) Sí, se llama sobrecarga de métodos.  
c) Solo en interfaces.

#### 12. ¿Qué significa que una función sea recursiva?  
a) Que llama a otras funciones dentro de su cuerpo.  
b) Que se llama a sí misma.  
c) Que devuelve un objeto complejo.

#### 13. ¿Qué tipo de retorno necesita un `getter` en una clase Java?  
a) Siempre `void`.  
b) Cualquier tipo que coincida con el atributo correspondiente.  
c) Siempre `boolean`.

#### 14. ¿Cuál de las siguientes firmas es válida en Java?  
a) `public void myFunction(int a, String b)`  
b) `void static myFunction()`  
c) `return void myFunction()`

#### 15. ¿Qué pasa si intentas usar una función estática para acceder a una variable de instancia?  
a) Es posible si la variable es pública.  
b) No es posible, genera un error de compilación.  
c) Es posible con una referencia explícita al objeto.

#### 16. ¿Qué significa el modificador `final` en una función?  
a) La función no puede ser llamada desde otra clase.  
b) La función no puede ser sobrescrita por una subclase.  
c) La función no puede tener parámetros.

#### 17. ¿Cómo se llama una función que devuelve un valor en Java?  
a) Procedimiento.  
b) Método vacío.  
c) Función con retorno.

#### 18. ¿Qué sucede si no defines un constructor en una clase?  
a) No se puede crear un objeto de esa clase.  
b) Java crea automáticamente un constructor por defecto.  
c) La clase no compilará.

#### 19. ¿Cuál es la salida del siguiente código?  
```java
public static int sum(int a, int b) {
    return a + b;
}
System.out.println(sum(2, 3));
```
a) 5  
b) 23  
c) Error de compilación.

#### 20. ¿Cuál es el propósito de la palabra clave `return` en una función?  
a) Terminar la ejecución de la función y devolver un valor.  
b) Declarar el tipo de datos que regresa la función.  
c) Definir un constructor.

<hr style="border: 1px solid #136AC7;" />

# **Respuestas del test**

1. **b)** Reutilizar código.  
   Las funciones permiten encapsular lógica para evitar duplicación.

2. **a)** method.  
   Aunque las funciones en Java se llaman "métodos", técnicamente el término correcto en Java es `method`.

3. **a)** Genera un error de compilación.  
   Una función no `void` debe retornar un valor explícito.

4. **b)** public.  
   El modificador `public` permite que la función sea accesible desde cualquier lugar.

5. **a)** La función pertenece a la clase, no a las instancias.  
   Las funciones `static` pertenecen a la clase y no requieren objetos para ser llamadas.

6. **a)** Declarando una sobrecarga del método con valores predeterminados.  
   Java no tiene argumentos opcionales como tal, pero puedes simularlos con sobrecarga de métodos.

7. **b)** Nada.  
   Una función `void` no devuelve ningún valor.

8. **b)** `.`  
   El operador punto (`.`) se utiliza para invocar métodos de clases o instancias.

9. **b)** Una función que tiene el mismo nombre, pero diferente lista de parámetros.  
   Esto se llama sobrecarga de métodos.

10. **c)** Firma.  
   La firma de una función incluye el nombre y la lista de parámetros.

11. **b)** Sí, se llama sobrecarga de métodos.  
   La sobrecarga permite múltiples métodos con el mismo nombre pero distinta lista de argumentos.

12. **b)** Que se llama a sí misma.  
   Una función recursiva se invoca a sí misma como parte de su ejecución.

13. **b)** Cualquier tipo que coincida con el atributo correspondiente.  
   Un `getter` devuelve el tipo del atributo que está recuperando.

14. **a)** `public void myFunction(int a, String b)`  
   Esta es una declaración válida de método.

15. **b)** No es posible, genera un error de compilación.  
   Una función estática no puede acceder directamente a variables de instancia.

16. **b)** La función no puede ser sobrescrita por una subclase.  
   El modificador `final` evita que una función sea sobrescrita.

17. **c)** Función con retorno.  
   Una función que devuelve un valor se conoce como una función con retorno.

18. **b)** Java crea automáticamente un constructor por defecto.  
   Si no defines un constructor, Java genera uno implícito sin parámetros.

19. **a)** 5.  
   La función suma correctamente 2 y 3, devolviendo 5.

20. **a)** Terminar la ejecución de la función y devolver un valor.  
   La palabra clave `return` finaliza la ejecución de la función devolviendo el valor indicado.









