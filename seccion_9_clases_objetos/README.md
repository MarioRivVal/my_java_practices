# Seccion 9: Clases y Objetos

## Índice:

### 1. Ejercicios

- [Ejercicio 1 - Crear una Clase Sencilla](#ejercicio-1-crear-una-clase-sencilla)
- [Ejercicio 2 - Métodos Getters y Setters](#ejercicio-2-métodos-getters-y-setters)
- [Ejercicio 3 - Crear Varias Clases Relacionadas](#ejercicio-3-crear-varias-clases-relacionadas)
- [Ejercicio 4 - Arreglos de Objetos](#ejercicio-4-arreglos-de-objetos)
- [Ejercicio 5 - Herencia y Polimorfismos](#ejercicio-5-herencia-y-polimorfismo)
- [Ejercicio 6 - Sistema de Gestión de Inventarios](#ejercicio-6-sistema-de-gestión-de-inventarios)
- [Ejercicio 7 - Sistema de Biblioteca](#ejercicio-7-sistema-de-biblioteca)
- [Ejercicio 8 - Sistema de Empleados y Nóminas](#ejercicio-8-sistema-de-empleados-y-nóminas)

### 2. Test

- [Preguntas](#test-funciones-en-java)
- [Respuestas](#respuestas-del-test)

<hr style="border: 1px solid #136AC7;" />

### **Ejercicio 1: Crear una Clase Sencilla**

**Objetivo:** Crear una clase con atributos y métodos básicos.

1. Crea una clase llamada `Persona`.
2. Agrega dos atributos privados:
   - `nombre` (tipo `String`).
   - `edad` (tipo `int`).
3. Crea un constructor que reciba `nombre` y `edad` para inicializar los
   atributos.
4. Crea un método llamado `mostrarInformacion()` que imprima en consola el
   nombre y la edad.
5. En el método `main`:
   - Crea una instancia de la clase `Persona`.
   - Llama al método `mostrarInformacion()` para mostrar los datos.

---

### **Ejercicio 2: Métodos Getters y Setters**

**Objetivo:** Implementar encapsulamiento con getters y setters.

1. Modifica la clase `Persona` para que:
   - Los atributos `nombre` y `edad` sigan siendo privados.
   - Agregues métodos públicos `getNombre()`, `setNombre(String nombre)`,
     `getEdad()` y `setEdad(int edad)`.
2. En el método `main`:
   - Crea una instancia de la clase `Persona`.
   - Usa los setters para asignar valores.
   - Usa los getters para imprimir el nombre y la edad.

---

### **Ejercicio 3: Crear Varias Clases Relacionadas**

**Objetivo:** Implementar una relación entre clases.

1. Crea una clase llamada `Coche` con los siguientes atributos:
   - `marca` (tipo `String`).
   - `modelo` (tipo `String`).
   - `motor` (tipo `Motor`).
2. Crea otra clase llamada `Motor` con el atributo:
   - `potencia` (tipo `int`).
3. En la clase `Coche`:
   - Agrega un constructor que reciba `marca`, `modelo`, y un objeto `Motor`.
   - Crea un método `mostrarDetalles()` que imprima los datos del coche,
     incluyendo la potencia del motor.
4. En el método `main`:
   - Crea una instancia de `Motor` y úsala para crear una instancia de `Coche`.
   - Llama al método `mostrarDetalles()`.

---

### **Ejercicio 4: Arreglos de Objetos**

**Objetivo:** Trabajar con colecciones de objetos.

1. Modifica la clase `Coche` para incluir un atributo adicional:
   - `precio` (tipo `double`).
2. En el método `main`:
   - Crea un arreglo de 5 objetos `Coche`.
   - Llena el arreglo con coches de diferentes marcas, modelos y precios.
3. Escribe un método estático en la clase principal que reciba el arreglo de
   coches y:
   - Calcule el promedio de los precios.
   - Devuelva el coche más caro.

---

### **Ejercicio 5: Herencia y Polimorfismo**

**Objetivo:** Implementar herencia y polimorfismo.

1. Crea una clase base llamada `Animal` con:
   - Un atributo `nombre` (tipo `String`).
   - Un método `hacerSonido()` que imprima `"Sonido genérico"`.
2. Crea dos clases que extiendan `Animal`:
   - `Perro`: Sobrescribe `hacerSonido()` para imprimir `"Guau guau"`.
   - `Gato`: Sobrescribe `hacerSonido()` para imprimir `"Miau miau"`.
3. En el método `main`:
   - Crea un arreglo de 3 objetos `Animal` (pueden ser `Perro`, `Gato` o ambos).
   - Recorre el arreglo y llama al método `hacerSonido()` de cada objeto.
   - Usa el polimorfismo para que el método adecuado se invoque automáticamente.

¡Por supuesto! Voy a simplificar los ejercicios para que no requieran el uso de
estructuras como `ArrayList` o `HashMap`. Usaremos arreglos simples y conceptos
básicos que ya has aprendido.

---

## **Ejercicio 6: Sistema de Gestión de Inventarios**

### **Descripción:**

Diseña un sistema que gestione un inventario de productos. Cada producto tiene
un identificador único, un nombre, una categoría y una cantidad en stock.

1. **Clases a Crear:**

   - `Product`: Contendrá los atributos básicos del producto.
   - `Inventory`: Contendrá un arreglo de productos con un tamaño fijo y métodos
     para:
     - Añadir un producto al inventario.
     - Actualizar la cantidad de un producto dado su ID.
     - Mostrar todos los productos de una categoría específica.

2. **Requerimientos:**
   - Usa un **arreglo fijo** para almacenar los productos (ejemplo:
     `Product[] products = new Product[10];`).
   - Asegúrate de no añadir productos si el arreglo está lleno.

---

### **Ejemplo de Salida:**

```text
Producto añadido: Laptop (Categoría: Electrónica, Stock: 50)
Producto añadido: Camiseta (Categoría: Ropa, Stock: 30)
Stock de producto con ID 1 actualizado a 60.
Productos en categoría 'Ropa':
- Camiseta (ID: 2, Stock: 30)
```

---

## **Ejercicio 7: Sistema de Biblioteca**

### **Descripción:**

Crea un sistema de gestión de préstamos en una biblioteca. Los libros tienen un
título, un autor, un identificador único, y un estado (`disponible` o
`prestado`). Los usuarios tienen un nombre y un número de identificación.

1. **Clases a Crear:**

   - `Book`: Representa un libro con sus atributos básicos y su estado.
   - `User`: Representa a un usuario con su nombre y un ID.
   - `Library`: Contiene un arreglo de libros y métodos para:
     - Añadir libros al sistema.
     - Permitir a un usuario tomar prestado un libro.
     - Mostrar todos los libros disponibles.

2. **Requerimientos:**
   - Usa un **arreglo fijo** para los libros.
   - Implementa validaciones, como evitar prestar un libro que ya está en
     préstamo.

---

### **Ejemplo de Salida:**

```text
Libro añadido: El Hobbit (Autor: J.R.R. Tolkien, ID: 1)
Usuario registrado: Juan Pérez (ID: 101)
Juan Pérez tomó prestado 'El Hobbit'.
Error: 'El Hobbit' ya está prestado.
```

---

## **Ejercicio 8: Sistema de Empleados y Nóminas**

### **Descripción:**

Crea un sistema para calcular la nómina de empleados. Hay dos tipos de
empleados:

- Empleados por salario fijo.
- Empleados por hora (con una tarifa por hora y un número de horas trabajadas).

1. **Clases a Crear:**

   - `Employee` (clase base): Contiene atributos comunes como `nombre` e `ID`, y
     un método `calculateSalary` que será redefinido por las subclases.
   - `FixedSalaryEmployee`: Extiende de `Employee` y calcula el salario fijo.
   - `HourlyEmployee`: Extiende de `Employee` y calcula el salario basado en
     horas trabajadas.
   - `PayrollSystem`: Contiene un arreglo fijo de empleados y un método para
     mostrar sus salarios.

2. **Requerimientos:**
   - Usa un **arreglo fijo** para almacenar los empleados.
   - Permite calcular el salario de todos los empleados en el arreglo.

---

### **Ejemplo de Salida:**

```text
Empleado: María López, Salario: $3000.0
Empleado: Pedro Gómez, Salario: $1200.0 (Trabajó 40 horas a $30/hora)
Total a pagar: $4200.0
```
