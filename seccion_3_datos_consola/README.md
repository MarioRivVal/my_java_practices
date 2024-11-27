# Seccion 3: Datos por Consola

## Ejercicio 1: Generador de Nombres de Usuario

Crea un programa que:

1. Solicite al usuario su nombre completo (con nombre y apellidos).
2. Genere un nombre de usuario aplicando las siguientes reglas:
   - Toma las tres primeras letras del nombre en minúsculas.
   - Toma las tres primeras letras del primer apellido en mayúsculas.
   - Agrega un número aleatorio de 100 a 999 al final.
3. Muestra el nombre de usuario generado.

---

## Ejercicio 2: Calculadora de Propinas

Crea un programa que:

1. Solicite al usuario el monto de una cuenta en un restaurante.
2. Solicite al usuario el porcentaje de propina que desea dejar.
3. Calcule y muestre:
   - La propina con dos decimales.
   - El total a pagar (monto + propina), usando un bloque de texto.

---

## Ejercicio 3: Calculadora de Interés Simple

Crea un programa que calcule el interés simple basado en los siguientes valores
ingresados por el usuario:

1. Capital principal: El monto inicial invertido o prestado.
2. Tasa de interés: La tasa anual en porcentaje.
3. Tiempo: El tiempo en años.

Mostrar el **interés generado** y el **monto total**, formateados con dos
decimales

---

# Test Sección 3

### **1. ¿Qué clase en Java se utiliza para leer datos desde la consola?**

- A) `InputReader`
- B) `Scanner`
- C) `ConsoleReader`

---

### **2. ¿Qué método de la clase `Scanner` se utiliza para leer un entero?**

- A) `nextInt()`
- B) `readInt()`
- C) `parseInt()`

---

### **3. Si usas el método `nextLine()` de `Scanner`, ¿qué tipo de dato devuelve?**

- A) `int`
- B) `String`
- C) `float`

---

### **4. ¿Qué sucede si intentas leer un número con `nextInt()` y el usuario ingresa texto?**

- A) Se lanza una excepción.
- B) Devuelve 0 como valor predeterminado.
- C) Convierte el texto en un número automáticamente.

---

### **5. ¿Qué método de `Scanner` se utiliza para leer un valor booleano?**

- A) `nextBoolean()`
- B) `nextBool()`
- C) `next()`

---

### **6. ¿Cómo conviertes una cadena a un número entero en Java?**

- A) `Integer.toInt()`
- B) `Integer.parseInt()`
- C) `parse.Integer()`

---

### **7. ¿Qué método de la clase `Random` genera un número entero aleatorio dentro de un rango específico?**

- A) `nextInt(n)`
- B) `randomInt(n)`
- C) `getInt(n)`

---

### **8. ¿Qué método de `Random` genera un número decimal entre 0.0 (inclusive) y 1.0 (exclusivo)?**

- A) `nextDecimal()`
- B) `nextDouble()`
- C) `nextFloat()`

---

### **9. ¿Qué método genera un valor booleano aleatorio?**

- A) `nextBool()`
- B) `nextBoolean()`
- C) `booleanRandom()`

---

### **10. ¿Qué resultado obtienes al ejecutar este código?**

```java
Random random = new Random();
int num = random.nextInt(10);
System.out.println(num);
```

- A) Un número aleatorio entre 0 y 10 (incluyendo 10).
- B) Un número aleatorio entre 1 y 10 (sin incluir 0).
- C) Un número aleatorio entre 0 y 9.

---

### 11. ¿Qué método de `System.out` permite formatear cadenas en Java?

- A) `System.out.printf()`
- B) `System.out.formatString()`
- C) `System.out.stringFormat()`

---

### 12. ¿Qué especificador de formato se usa para números enteros en `printf()`?

- A) `%f`
- B) `%d`
- C) `%s`

---

### 13. ¿Qué especificador de formato se usa para cadenas de texto en `printf()`?

- A) `%f`
- B) `%d`
- C) `%s`

---

### 14. ¿Qué salida genera este código?

```java
String nombre = "Juan";
System.out.printf("Hola, %s", nombre);
```

- A) Hola, Juan
- B) Hola, %s
- C) Hola Juan

---

### 15. ¿Qué salida genera este código?

```java
System.out.printf("%.2f", 123.456);
```

- A) 123.456
- B) 123.45
- C) 123.46

---

### 16. ¿Qué hace el método `String.formatted()`?

- A) Crea una cadena en mayúsculas.
- B) Permite formatear una cadena similar a `printf()`.
- C) Divide una cadena en palabras.

---

### 17. ¿Qué diferencia principal existe entre `String.format()` y `System.out.printf()`?

- A) `String.format()` imprime directamente en consola.
- B) `System.out.printf()` devuelve un `String`.
- C) `String.format()` devuelve una cadena, mientras que `printf()` la imprime.

---

### 18. ¿Qué salida genera este código?

```java
String resultado = "El precio es %.2f".formatted(12.3456);
System.out.println(resultado);
```

- A) El precio es %.2f
- B) El precio es 12.34
- C) El precio es 12.35

---

### 19. ¿Qué método se usa para leer una cadena completa incluyendo espacios con `Scanner`?

- A) `next()`
- B) `readLine()`
- C) `nextLine()`

---

### 20. ¿Qué sucede si olvidas usar `nextLine()` después de `nextInt()` y luego intentas leer una cadena?

- A) La entrada se procesa correctamente.
- B) La entrada salta y no puedes ingresar texto.
- C) Se lanza un error de ejecución.

## Respuestas

1: B  
2: A  
3: B  
4: A  
5: A  
6: B  
7: A  
8: B  
9: B  
10: C  
11: A  
12: B  
13: C  
14: A  
15: C  
16: B  
17: C  
18: C  
19: C  
20: B
