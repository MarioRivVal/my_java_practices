# Seccion 4: Operadores (Aritméticos, Comparación, Lógicos)

## Ejercicio 1: Verificar si un Número Está Dentro de un Rango

Crea un programa que solicite al usuario ingresar un número entero y determine si el número se encuentra dentro de un rango establecido. El rango está definido por un valor inicial (`0`) y un valor final (`5`).


El programa debe imprimir `true` si el número está dentro del rango y `false` si no lo está.

---

## Ejercicio 2: Verificar Elegibilidad para un Descuento

Crea un programa que determine si un cliente califica para un descuento del 10%. La elegibilidad está basada en dos condiciones:

1. El cliente debe haber comprado al menos 10 productos.
2. El cliente debe ser miembro de la tienda.

El programa debe evaluar ambas condiciones y mostrar si el cliente recibe o no el descuento. 

---

## Ejercicio 3: Verificar Acceso a Préstamos de Libros

Escribe un programa que determine si una persona puede tomar libros prestados de la biblioteca. Para ser elegible, la persona debe cumplir al menos una de estas condiciones:

1. Ser miembro de la biblioteca.
2. Vivir a una distancia máxima de 3000 metros de la biblioteca.


El programa debe evaluar estas condiciones y mostrar si la persona puede o no tomar libros prestados.

---

## Ejercicio 4: Calcular el Total de una Compra con Impuesto

Escribe un programa que calcule el total de una compra incluyendo un impuesto del 20%. El programa debe:

1. Solicitar al usuario los precios de cuatro productos: pasta, arroz, bebida y fruta.
2. Calcular el subtotal sumando los precios de todos los productos.
3. Calcular el impuesto del 20% sobre el subtotal.
4. Mostrar un resumen detallado del ticket de compra, que incluya el subtotal, el monto del impuesto y el total final.

#### Ejemplo de interacción con el programa:
```
How much is pasta?: 2.50
How much is rice?: 3.00
How much is drink?: 1.20
How much is fruit?: 4.00

------ TICKET -------
---------------------
Subtotal: €10.70
Tax 20%: €2.14
Total: €12.84
---------------------
```

El programa debe calcular y mostrar los valores con dos decimales en un formato claro.

---

## Ejercicio 5: Verificar Credenciales de Usuario

Crea un programa que valide las credenciales ingresadas por un usuario. El programa debe:

1. Solicitar al usuario un nombre de usuario y una contraseña.
2. Comparar las credenciales ingresadas con las almacenadas en el sistema:
   - Usuario: `"netneo"`
   - Contraseña: `"369"`
3. Indicar si los datos ingresados son correctos o no.

#### Ejemplo de interacción con el programa:
```
Username: netneo
Password: 369
Data is correct?: true
```

```
Username: user123
Password: 1234
Data is correct?: false
```

El programa debe evaluar la autenticidad de las credenciales e imprimir si son correctas o incorrectas. ¡Inténtalo! 🔒

---

## Ejercicio 6: Cálculo de Área y Perímetro de un Rectángulo

Crea un programa que calcule el **área** y el **perímetro** de un rectángulo. Para ello, el programa debe:

- Pedir al usuario la **base** y la **altura** en centímetros.
- Calcular el **área** usando la base y la altura.
- Calcular el **perímetro** usando la base y la altura.
- Mostrar el área y el perímetro en pantalla de forma clara.

---

# Test: Operadores en Java

---

### **1. ¿Cuál es el operador aritmético para calcular el módulo en Java?**
- A) `/`
- B) `%`
- C) `*`

---

### **2. ¿Qué operador se utiliza para incrementar una variable en 1 unidad?**
- A) `++`
- B) `+= 1`
- C) Ambas son correctas

---

### **3. ¿Cuál es el resultado de `5 / 2` en Java, si ambos números son enteros?**
- A) `2`
- B) `2.5`
- C) Lanza un error

---

### **4. ¿Qué operador se utiliza para comparar si dos valores son iguales?**
- A) `=`
- B) `==`
- C) `===`

---

### **5. ¿Cuál es el operador lógico para "Y" (AND) en Java?**
- A) `&&`
- B) `||`
- C) `&`

---

### **6. ¿Cuál es el operador lógico para "O" (OR) en Java?**
- A) `&&`
- B) `||`
- C) `|`

---

### **7. ¿Cuál de los siguientes operadores asigna un valor a una variable?**
- A) `==`
- B) `=`
- C) `=>`

---

### **8. ¿Qué operador lógico invierte el valor de una expresión booleana?**
- A) `!`
- B) `~`
- C) `not`

---

### **9. ¿Cuál es el resultado de `true && false` en Java?**
- A) `true`
- B) `false`
- C) Lanza un error

---

### **10. ¿Qué operador aritmético se utiliza para multiplicar dos números en Java?**
- A) `*`
- B) `x`
- C) `mul`

---

### **11. ¿Cuál es el resultado de `10 % 3` en Java?**
- A) `1`
- B) `3`
- C) `0`

---

### **12. ¿Qué operador de comparación verifica si un valor es menor o igual que otro?**
- A) `<`
- B) `<=`
- C) `=<`

---

### **13. ¿Qué operador lógico devuelve `true` si al menos una de las expresiones es verdadera?**
- A) `&&`
- B) `||`
- C) `==`

---

### **14. ¿Cuál es el resultado de `10 + 5 * 2` en Java?**
- A) `30`
- B) `20`
- C) `50`

---

### **15. ¿Qué operador se utiliza para dividir dos números en Java?**
- A) `/`
- B) `div`
- C) `÷`

---

### **16. ¿Qué operador asigna a una variable la suma de su valor actual y otro número?**
- A) `+=`
- B) `=+`
- C) `+`

---

### **17. ¿Cuál es el resultado de `true || false` en Java?**
- A) `true`
- B) `false`
- C) Lanza un error

---

### **18. ¿Qué operador lógico verifica si dos expresiones no son iguales?**
- A) `!=`
- B) `!==`
- C) `<>`

---

### **19. ¿Qué operador se utiliza para verificar si un número es mayor que otro?**
- A) `>`
- B) `>=`
- C) `>>`

---

### **20. ¿Qué operador devuelve el resto de una división?**
- A) `%`
- B) `/`
- C) `mod`

---

## **Respuestas del Test**

1: B  (`%` es el operador para calcular el módulo)  
2: C  (Tanto `++` como `+= 1` incrementan una variable en 1)  
3: A  (5 / 2 = 2, ya que en Java la división entre enteros da un resultado entero)  
4: B  (`==` se usa para comparar la igualdad de dos valores)  
5: A  (`&&` es el operador AND en Java)  
6: B  (`||` es el operador OR en Java)  
7: B  (`=` se usa para asignar valores a variables)  
8: A  (`!` invierte el valor de una expresión booleana)  
9: B  (`true && false` es `false` porque AND solo es verdadero si ambas expresiones son verdaderas)  
10: A (`*` es el operador de multiplicación en Java)  
11: A (`10 % 3` da 1 porque 10 dividido por 3 deja un residuo de 1)  
12: B (`<=` verifica si un valor es menor o igual que otro)  
13: B (`||` devuelve true si al menos una de las expresiones es verdadera)  
14: B (En `10 + 5 * 2`, la multiplicación se resuelve primero: 10 + 10 = 20)  
15: A (`/` es el operador de división en Java)  
16: A (`+=` suma y asigna el resultado a la variable)  
17: A (`true || false` es `true` porque OR solo necesita que una de las expresiones sea verdadera)  
18: A (`!=` verifica si dos valores no son iguales)  
19: A (`>` se usa para verificar si un número es mayor que otro)  
20: A (`%` devuelve el resto de una división)  

