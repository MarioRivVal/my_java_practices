# Seccion 10: Temas Avanzados

<a name="top"></a>

## Índice:

### 1. Ejercicios

- #### 1.1. Clases abstractas

  - [Ejercicio 1 - Clases Abstractas Nivel 1 (Animales y sonidos )](#ejercicio-1-clases-abstractas-nivel1-animales-y-sonidos-)
  - [Ejercicio 2 - Clases Abstractas Nivel 2 (Vehículos y Mantenimiento)](#ejercicio-2-clases-abstractas-nivel2-vehículos-y-mantenimiento)
  - [Ejercicio 3 - Clases Abstractas Nivel 3 (Figuras Geométricas)](#ejercicio-3-clases-abstractas-nivel3-figuras-geométricas)

- #### 1.2 Interfaces y multiple implementación

  - [Ejercicio 4 - Interfaces Nivel 1 (Dispositivos Conectables)](#ejercicio-4-interfaces-nivel1-dispositivos-conectables)
  - [Ejercicio 5 - Interfaces Nivel 2 (Elementos Interactivos)](#ejercicio-5-interfaces-nivel2-elementos-interactivos)

- #### 1.3 Listas, funciones Lambda y Metodos de referencia

  - [Ejercicio 6 - Listas Nivel 1 (Lista de Nombres)](#ejercicio-6-listas-nivel1-lista-de-nombres)
  - [Ejercicio 7 - Listas Nivel 2 (Productos y Precios)](#ejercicio-7-listas-nivel2-productos-y-precios)
  - [Ejercicio 8 - Listas Nivel 3 (Biblioteca)](#ejercicio-8-listas-nivel3-biblioteca)

- #### 1.4 Excepciones y excepciones personalizadas
  - [Ejercicio 9 - Excepciones Nivel 1 (Calculadora Simple)](#ejercicio-9-excepciones-nivel1-calculadora-simple)
  - [Ejercicio 10 - Excepciones Nivel 2 (Validador de Números)](#ejercicio-10-excepciones-nivel2-validador-de-números)
  - [Ejercicio 11 - Excepciones Nivel 3 (Validador de Datos de Usuario)](#ejercicio-11-excepciones-nivel3-validador-de-datos-de-usuario)

### 2. Test

- [Preguntas](#test-clases-abstractas-interfaces-excepciones)
- [Respuestas](#test-respuestas)

<hr style="border: 1px solid #136AC7;" />

## **Ejercicio 1: Clases Abstractas Nivel.1 (Animales y sonidos )**

**Objetivo:**

- Comprender la declaración y uso básico de clases y métodos abstractos.
- Practicar la herencia simple en Java.
- Implementar un comportamiento común en subclases.

**Instrucciones:**

1.  **Crea una clase abstracta llamada `Eje_2_animals.Animal`:**

    - Declara un método abstracto llamado `emitirSonido()` que no devuelva
      ningún valor (`void`). Este método representará el sonido que hace un
      animal.

2.  **Crea dos clases concretas que hereden de `Eje_2_animals.Animal`:**

    - Crea una clase llamada `Perro`.
    - Crea una clase llamada `Gato`.
    - Cada clase debe implementar el método `emitirSonido()` de la siguiente
      manera:
      - En la clase `Perro`, el método `emitirSonido()` debe imprimir en la
        consola "¡Guau!".
      - En la clase `Gato`, el método `emitirSonido()` debe imprimir en la
        consola "¡Miau!".

3.  **Crea una clase llamada `EjemploAnimales` con un método `main()`:**
    - Dentro del método `main()`, crea un objeto de tipo `Perro` y otro de tipo
      `Gato`.
    - Llama al método `emitirSonido()` de cada objeto para que hagan su
      respectivo sonido.

**Consejos:**

- Recuerda usar la palabra clave `abstract` para la clase y el método abstracto.
- Usa la palabra clave `extends` para la herencia.
- Usa la anotación @Override para implementar el metodo abstracto.

<hr style="border: 1px solid #136AC7;" />

## **Ejercicio 2: Clases Abstractas Nivel.2 (Vehículos y Mantenimiento)**

**Objetivo:**

- Profundizar en la comprensión de clases y métodos abstractos.
- Practicar la herencia y la implementación de múltiples métodos abstractos.
- Introducir el concepto de atributos en clases abstractas.

**Instrucciones:**

1.  **Crea una clase abstracta llamada `Vehiculo`:**

    - Añade un atributo protegido de tipo `String` llamado `marca`.
    - Crea un constructor para la clase `Vehiculo` que reciba la marca como
      parámetro y la asigne al atributo correspondiente.
    - Declara un método abstracto llamado `obtenerTipo()` que devuelva un
      `String` (por ejemplo, "Coche", "Moto", etc.).
    - Declara un metodo abstracto llamado `realizarMantenimiento()` que no
      devuelva nada (void).
    - Crea un método concreto llamado `mostrarMarca()` que imprima en la consola
      "Marca: " seguido de la marca del vehículo.

2.  **Crea dos clases concretas que hereden de `Vehiculo`:**

    - Crea una clase llamada `Coche`.
      - En el constructor, deberás llamar al constructor de la clase padre
        `Vehiculo` para asignar la marca.
      - Implementa el método `obtenerTipo()` para que devuelva "Coche".
      - Implementa el metodo `realizarMantenimiento()` para que imprima en la
        consola "Realizando mantenimiento de coche".
    - Crea una clase llamada `Moto`.
      - En el constructor, deberás llamar al constructor de la clase padre
        `Vehiculo` para asignar la marca.
      - Implementa el método `obtenerTipo()` para que devuelva "Moto".
      - Implementa el metodo `realizarMantenimiento()` para que imprima en la
        consola "Realizando mantenimiento de moto".

3.  **Crea una clase llamada `EjemploVehiculos` con un método `main()`:**
    - Dentro del método `main()`, crea un objeto de tipo `Coche` y otro de tipo
      `Moto`.
    - Llama al método `obtenerTipo()` de cada objeto e imprime el resultado en
      la consola.
    - Llama al metodo `mostrarMarca()` de cada objeto para que muestre su marca.
    - Llama al metodo `realizarMantenimiento()` para que muestre el mensaje de
      mantenimiento.

**Consejos:**

- Recuerda usar la palabra clave `super` para llamar al constructor de la clase
  padre.
- Recuerda utilizar la anotación `@Override` para implementar los metodos
  abstractos.

<hr style="border: 1px solid #136AC7;" />

## **Ejercicio 3: Clases Abstractas Nivel.3 (Figuras Geométricas)**

**Objetivo:**

- Comprender el concepto de clases abstractas y métodos abstractos en Java.
- Aprender a heredar de una clase abstracta e implementar métodos abstractos.
- Practicar la creación de clases y objetos en Java.

**Instrucciones:**

1.  **Crea una clase abstracta llamada `Figura`**:

    - Esta clase debe tener dos atributos protegidos de tipo `double`: `x` e
      `y`, que representarán las coordenadas de la figura.
    - Crea un constructor para la clase `Figura` que reciba los valores de `x` e
      `y` y los asigne a los atributos correspondientes.
    - Declara un método abstracto llamado `calcularArea()` que devuelva un valor
      de tipo `double`. Este método calculará el área de la figura.
    - Crea un método concreto llamado `mover()` que reciba dos valores de tipo
      `double` (`dx` y `dy`) y los sume a los atributos `x` e `y`,
      respectivamente. Este método simulará el movimiento de la figura.

2.  **Crea una clase llamada `Circulo` que herede de `Figura`**:

    - Añade un atributo privado de tipo `double` llamado `radio`.
    - Crea un constructor para la clase `Circulo` que reciba los valores de `x`,
      `y` y `radio`, y llame al constructor de la clase padre (`Figura`) para
      inicializar los atributos `x` e `y`.
    - Implementa el método `calcularArea()` para que devuelva el área del
      círculo (π \* radio \* radio).

3.  **Crea una clase llamada `Rectangulo` que herede de `Figura`**:

    - Añade dos atributos privados de tipo `double` llamados `ancho` y `alto`.
    - Crea un constructor para la clase `Rectangulo` que reciba los valores de
      `x`, `y`, `ancho` y `alto`, y llame al constructor de la clase padre
      (`Figura`).
    - Implementa el método `calcularArea()` para que devuelva el área del
      rectángulo (ancho \* alto).

4.  **Crea una clase llamada `EjemploAbstracto` con un método `main()`**:
    - Dentro del método `main()`, crea un objeto de tipo `Circulo` y otro de
      tipo `Rectangulo`.
    - Llama al método `calcularArea()` de cada objeto e imprime el resultado en
      la consola.
    - Llama al metodo `mover()` de cada objeto y comprueba que se han movido.

**Consejos:**

- Recuerda utilizar la palabra clave `abstract` para declarar la clase y el
  método abstracto.
- Utiliza la palabra clave `extends` para indicar que una clase hereda de otra.
- Utiliza la anotación `@Override` para indicar que estás implementando un
  método abstracto de la clase padre.
- Puedes usar `Math.PI` para obtener el valor de pi.

[⬆️ Vuelve al índice](#top)

<hr style="border: 1px solid #136AC7;" />

## **Ejercicio 4: Interfaces Nivel.1 (Dispositivos Conectables)**

**Objetivo:**

- Practicar la creación e implementación de interfaces.
- Entender cómo las interfaces definen un contrato de comportamiento.

**Instrucciones:**

1.  **Crea una interfaz llamada `Conectable`:**

    - Declara un método `conectar()` que no devuelva nada (`void`).
    - Declara un método `desconectar()` que tampoco devuelva nada (`void`).

2.  **Crea dos clases que implementen la interfaz `Conectable`:**

    - Crea una clase llamada `Impresora`.
      - En el método `conectar()`, imprime en la consola "Impresora conectada".
      - En el método `desconectar()`, imprime en la consola "Impresora
        desconectada".
    - Crea una clase llamada `Router`.
      - En el método `conectar()`, imprime en la consola "Router conectado".
      - En el método `desconectar()`, imprime en la consola "Router
        desconectado".

3.  **Crea una clase llamada `EjemploConectable` con un método `main()`:**
    - Dentro del método `main()`, crea un objeto de tipo `Impresora` y otro de
      tipo `Router`.
    - Llama a los métodos `conectar()` y `desconectar()` en cada objeto.

## **Ejercicio 5: Interfaces Nivel.2 (Elementos Interactivos)**

**Objetivo:**

- Practicar la implementación de múltiples interfaces en una misma clase.
- Entender cómo las interfaces permiten modelar comportamientos complejos.

**Instrucciones:**

1.  **Crea una interfaz llamada `Clickeable`:**

    - Declara un método `hacerClic()` que no devuelva nada (`void`).

2.  **Crea una interfaz llamada `Arrastrable`:**

    - Declara un método `arrastrar()` que no devuelva nada (`void`).

3.  **Crea una clase llamada `Boton` que implemente ambas interfaces:**

    - En el método `hacerClic()`, imprime en la consola "Botón clicado".
    - En el método `arrastrar()`, imprime en la consola "Botón arrastrado".

4.  **Crea una clase llamada `ControlDeslizable` que implemente la interfaz
    `Arrastrable`:**

    - En el método `arrastrar()`, imprime en la consola "Control deslizable
      arrastrado".

5.  **Crea una clase llamada `EjemploInteractivos` con un método `main()`:**
    - Dentro del método `main()`, crea un objeto de tipo `Boton` y otro de tipo
      `ControlDeslizable`.
    - Llama al método `hacerClic()` en el objeto `Boton`.
    - Llama al método `arrastrar()` en ambos objetos.

[⬆️ Vuelve al índice](#top)

<hr style="border: 1px solid #136AC7;" />

## **Ejercicio 6: Listas Nivel.1 (Lista de Nombres)**

**Objetivo:**

- Crear y manipular una `List` simple.
- Utilizar `Arrays.asList` para inicializar una lista.
- Imprimir los elementos de la lista usando `forEach` y una referencia a método.

**Instrucciones:**

1.  Crea una `List` de `String` llamada `nombres` e inicialízala con los
    siguientes nombres: "Ana", "Carlos", "Sofía", "Pedro", "Laura". Utiliza
    `Arrays.asList()` para inicializar la lista.
2.  Utiliza el método `forEach` de la lista junto con una referencia a método
    para imprimir cada nombre en la consola.

<hr style="border: 1px solid #136AC7;" />

## **Ejercicio 7: Listas Nivel.2 (Productos y Precios)**

**Objetivo:**

- Crear una `List` de objetos personalizados.
- Utilizar lambdas con `forEach` para realizar operaciones sobre los elementos
  de la lista.
- Practicar la creación de clases simples para almacenar datos.

**Instrucciones:**

1.  Crea una clase llamada `Producto` con dos atributos: `nombre` (String) y
    `precio` (double). Añade un constructor para inicializar los atributos y
    métodos `getNombre()` y `getPrecio()`.
2.  Crea una `List` de objetos `Producto` llamada `productos` e inicialízala con
    al menos 5 productos diferentes. Puedes usar `Arrays.asList()` o añadir los
    productos uno por uno.
3.  Utiliza el método `forEach` de la lista junto con una expresión lambda para
    imprimir en la consola el nombre y el precio de cada producto, formateando
    el precio con dos decimales.
4.  Utiliza el método `forEach` de la lista junto con una expresión lambda para
    calcular el precio total de todos los productos y mostrarlo en la consola.

<hr style="border: 1px solid #136AC7;" />

## **Ejercicio 8: Listas Nivel.3 (Biblioteca)**

**Objetivo:**

- Practicar la creación y manipulación de una `List` de objetos personalizados.
- Utilizar métodos comunes de `List` como `add()`, `remove()`, `get()`,
  `contains()`, `sort()`, etc.
- Implementar una lógica de búsqueda y filtrado de libros.
- Practicar el uso de interfaces funcionales (lambdas) para ordenar y filtrar.

**Instrucciones:**

1.  **Crea una clase llamada `Libro` con los siguientes atributos:**
    - `titulo` (String)
    - `autor` (String)
    - `anioPublicacion` (int)
    - `genero` (String)
2.  **Crea una clase llamada `Biblioteca` con un atributo:**
    - `libros` (List<Libro>)
3.  **Implementa los siguientes métodos en la clase `Biblioteca`:**
    - `agregarLibro(Libro libro)`: Añade un libro a la library.
    - `eliminarLibro(Libro libro)`: Elimina un libro de la library.
    - `buscarLibroPorTitulo(String titulo)`: Busca y devuelve un libro por su
      título.
    - `buscarLibrosPorAutor(String autor)`: Busca y devuelve una lista de libros
      por autor.
    - `buscarLibrosPorGenero(String genero)`: Busca y devuelve una lista de
      libros por género.
    - `ordenarLibrosPorAnio()`: Ordena los libros por año de publicación (usando
      `Collections.sort()` y una lambda).
    - `mostrarLibros()`: Imprime en la consola la información de todos los
      libros en la library.
4.  **En el método `main()` de una clase `Main`, realiza las siguientes
    operaciones:**
    - Crea una instancia de `Biblioteca`.
    - Añade al menos 10 libros a la library.
    - Realiza búsquedas por título, autor y género, e imprime los resultados.
    - Ordena los libros por año de publicación y muestra la lista ordenada.
    - Elimina un libro de la library y muestra la lista actualizada.

**Consejos:**

- Utiliza `ArrayList` como implementación de `List` para la library.
- Implementa los métodos `equals()` y `hashCode()` en la clase `Libro` para que
  la eliminación y búsqueda de libros funcionen correctamente.
- Para ordenar la lista usa el metodo sort de Collections.
- Utiliza lambdas para ordenar y filtrar la lista de libros.

[⬆️ Vuelve al índice](#top)

<hr style="border: 1px solid #136AC7;" />

## **Ejercicio 9: Excepciones Nivel.1 (Calculadora Simple)**

**Objetivo:**

- Practicar el manejo de excepciones básicas.
- Manejar la excepción `ArithmeticException` para evitar divisiones por cero.

**Instrucciones:**

1.  Crea una clase llamada `Calculadora` con un método
    `dividir(int numerador, int denominador)` que devuelva el resultado de la
    división.
2.  En el método `main()` de una clase `Main`, pide al usuario que introduzca
    dos números enteros.
3.  Llama al método `dividir()` con los números introducidos por el usuario.
4.  Utiliza un bloque `try-catch` para manejar la excepción
    `ArithmeticException` que se produce si el denominador es cero.
5.  Si ocurre la excepción, muestra un mensaje de error apropiado.

<hr style="border: 1px solid #136AC7;" />

## **Ejercicio 10: Excepciones Nivel.2 (Validador de Números)**

**Objetivo:**

- Practicar el manejo de excepciones relacionadas con la entrada de datos.
- Manejar la excepción `NumberFormatException`.
- Utilizar un bucle `while` para repetir la entrada de datos hasta que sea
  válida.

**Instrucciones:**

1.  Crea una clase llamada `ValidadorNumeros` con un método
    `validarNumero(String input)` que intente convertir una cadena de texto en
    un número entero.
2.  En el método `main()` de una clase `Main`, pide al usuario que introduzca
    una cadena de texto que represente un número entero.
3.  Llama al método `validarNumero()` con la cadena de texto introducida por el
    usuario.
4.  Utiliza un bloque `try-catch` para manejar la excepción
    `NumberFormatException` que se produce si la cadena de texto no se puede
    convertir en un número entero.
5.  Si ocurre la excepción, muestra un mensaje de error apropiado y pide al
    usuario que introduzca una nueva cadena de texto.
6.  Utiliza un bucle `while` para repetir la entrada de datos hasta que el
    usuario introduzca una cadena de texto válida.
7.  Una vez que se introduzca una cadena de texto válida, muestra el número
    entero correspondiente en la consola.

<hr style="border: 1px solid #136AC7;" />

## **Ejercicio 11: Excepciones Nivel.3 (Validador de Datos de Usuario)**

**Objetivo:**

- Practicar la creación y lanzamiento de excepciones personalizadas.
- Validar datos de usuario y lanzar excepciones personalizadas si los datos son
  inválidos.
- Manejar múltiples tipos de excepciones.

**Instrucciones:**

1.  Crea una clase llamada `Usuario` con los atributos `nombre` (String), `edad`
    (int) y `email` (String).
2.  Crea una clase llamada `ValidadorUsuario` con un método
    `validarUsuario(Usuario usuario)` que valide los datos del usuario.
3.  Implementa las siguientes validaciones:
    - El nombre no puede estar vacío.
    - La edad debe ser mayor o igual a 18.
    - El email debe contener el carácter "@".
4.  Crea tres excepciones personalizadas llamadas `NombreInvalidoException`,
    `EdadInvalidaException` y `EmailInvalidoException`.
5.  En el método `validarUsuario()`, lanza las excepciones personalizadas
    correspondientes si alguna validación falla.
6.  En el método `main()` de una clase `Main`, pide al usuario que introduzca
    los datos de un usuario.
7.  Crea un objeto `Usuario` con los datos introducidos por el usuario.
8.  Llama al método `validarUsuario()` con el objeto `Usuario`.
9.  Utiliza un bloque `try-catch` para manejar las excepciones personalizadas y
    mostrar mensajes de error apropiados.
10. Si no ocurre ninguna excepción, muestra un mensaje de éxito.

[⬆️ Vuelve al índice](#top)

<hr style="border: 1px solid #136AC7;" />

# **Test: Clases Abstractas, Interfaces, Excepciones**

1.  ¿Qué es la Programación Orientada a Objetos (OOP)?

    - a) Un paradigma de programación basado en el uso de funciones y
      procedimientos.
    - b) Un paradigma de programación basado en objetos que combinan datos y
      métodos.
    - c) Un enfoque para diseñar bases de datos relacionales.

2.  ¿Cuál de los siguientes no es un principio fundamental de la OOP?

    - a) Herencia.
    - b) Polimorfismo.
    - c) Procedimientos.

3.  ¿Qué es una clase en OOP?

    - a) Una instancia de un objeto.
    - b) Una plantilla para crear objetos.
    - c) Una función que no pertenece a un objeto.

4.  ¿Qué es un objeto en OOP?

    - a) Una plantilla para crear clases.
    - b) Una instancia de una clase.
    - c) Un tipo de dato primitivo.

5.  ¿Qué es la encapsulación en OOP?

    - a) La capacidad de una clase para heredar atributos y métodos de otra
      clase.
    - b) El ocultamiento de los detalles internos de un objeto y la exposición
      de una interfaz pública.
    - c) La capacidad de un objeto para tomar muchas formas.

6.  ¿Cuál es la diferencia principal entre una clase abstracta y una interfaz?

    - a) Una clase abstracta puede tener métodos concretos, mientras que una
      interfaz solo puede tener métodos abstractos.
    - b) Una interfaz puede tener atributos, mientras que una clase abstracta
      no.
    - c) No hay diferencia, son intercambiables.

7.  ¿Qué palabra clave se utiliza para definir una clase abstracta en Java?

    - a) `interface`
    - b) `abstract`
    - c) `static`

8.  ¿Qué palabra clave se utiliza para implementar una interfaz en Java?

    - a) `extends`
    - b) `implements`
    - c) `inherits`

9.  ¿Puede una clase implementar múltiples interfaces?

    - a) Sí.
    - b) No.
    - c) Solo si las interfaces no tienen métodos en común.

10. ¿Puede una clase abstracta tener constructores?

    - a) Sí.
    - b) No.
    - c) Solo si la clase abstracta no tiene métodos abstractos.

11. ¿Qué es una excepción en Java?

    - a) Un tipo de dato primitivo.
    - b) Un evento que interrumpe el flujo normal de un programa.
    - c) Un método que no pertenece a una clase.

12. ¿Cuál es la diferencia entre una excepción comprobada (checked) y una no
    comprobada (unchecked)?

    - a) Las excepciones comprobadas deben ser manejadas explícitamente,
      mientras que las no comprobadas no.
    - b) Las excepciones no comprobadas son más graves que las comprobadas.
    - c) No hay diferencia, son intercambiables.

13. ¿Qué bloque se utiliza para manejar excepciones en Java?

    - a) `if-else`
    - b) `try-catch`
    - c) `for-loop`

14. ¿Qué palabra clave se utiliza para lanzar una excepción explícitamente?

    - a) `throws`
    - b) `throw`
    - c) `exception`

15. ¿Qué bloque se ejecuta siempre, independientemente de si ocurre una
    excepción o no?

    - a) `catch`
    - b) `finally`
    - c) `else`

16. ¿Qué es un método de referencia en Java?

    - a) Una forma de llamar a un método estático.
    - b) Una forma concisa de referenciar un método existente.
    - c) Un método que no pertenece a una clase.

17. ¿Qué operador se utiliza para crear un método de referencia?

    - a) `->`
    - b) `::`
    - c) `.`

18. ¿Qué es una función lambda en Java?

    - a) Un método que no pertenece a una clase.
    - b) Una función anónima que se puede pasar como argumento a un método.
    - c) Una clase que implementa una interfaz funcional.

19. ¿Qué interfaz se utiliza para representar una función lambda que no toma
    argumentos y no devuelve ningún valor?

    - a) `Function`
    - b) `Consumer`
    - c) `Runnable`

20. ¿Qué interfaz se utiliza para representar una función lambda que toma un
    argumento y devuelve un valor?

    - a) `Supplier`
    - b) `Predicate`
    - c) `Function`

21. Dado el siguiente código, ¿qué se imprimirá en la consola?

```java
try {
    int resultado = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("División por cero");
}
```

- a) 10
- b) División por cero
- c) No se imprimirá nada, el programa se bloqueará.

22. ¿Cuál de las siguientes afirmaciones es verdadera sobre las interfaces en
    Java?

    - a) Pueden tener atributos de instancia.
    - b) Pueden tener métodos concretos.
    - c) Pueden ser implementadas por múltiples clases.

23. ¿Qué palabra clave se utiliza para heredar de una clase en Java?

    - a) implements
    - b) extends
    - c) inherits

24. ¿Cuál es el propósito del bloque `finally` en un bloque `try-catch`?

    - a) Manejar excepciones específicas.
    - b) Ejecutar código que siempre debe ejecutarse, independientemente de si
      ocurre una excepción o no.
    - c) Definir el tipo de excepción que se puede lanzar.

25. ¿Cuál de las siguientes es una ventaja de usar métodos de referencia en
    lugar de funciones lambda?

    - a) Los métodos de referencia son más flexibles.
    - b) Los métodos de referencia son más concisos cuando la lambda simplemente
      llama a un método existente.
    - c) No hay diferencia, son intercambiables.

26. ¿Cuál de las siguientes excepciones es una excepción no comprobada
    (unchecked)?

    - a) IOException
    - b) SQLException
    - c) NullPointerException

27. ¿Qué es el polimorfismo en OOP?

    - a) La capacidad de una clase para heredar atributos y métodos de otra
      clase.
    - b) La capacidad de un objeto para tomar muchas formas.
    - c) El ocultamiento de los detalles internos de un objeto.

28. ¿Cuál de las siguientes afirmaciones es verdadera sobre las clases
    abstractas en Java?

    - a) No pueden tener métodos abstractos.
    - b) No pueden ser instanciadas.
    - c) No pueden tener constructores.

29. ¿Qué interfaz funcional se utiliza para representar una función lambda que
    toma dos argumentos y devuelve un valor?

    - a) `BiFunction`
    - b) `Consumer`
    - c) `Supplier`

30. ¿Cuál es el resultado de intentar compilar y ejecutar el siguiente código?

```java
interface MyInterface {
    void myMethod();
}

class MyClass implements MyInterface {
    // ...
}
```

- a) El código no compilará porque `MyClass` no implementa `myMethod()`.
- b) El código compilará y ejecutará correctamente.
- c) El código compilará pero lanzará una excepción en tiempo de ejecución.

[⬆️ Vuelve al índice](#top)

<hr style="border: 1px solid #136AC7;" />

# **Test: Respuestas**

1.  **b) Un paradigma de programación basado en objetos que combinan datos y
    métodos.**

    - _La OOP se centra en la creación de objetos que encapsulan datos y
      comportamientos._

2.  **c) Procedimientos.**

    - _Los principios fundamentales de la OOP son la herencia, el polimorfismo y
      la encapsulación._

3.  **b) Una plantilla para crear objetos.**

    - _Una clase define la estructura y el comportamiento de los objetos._

4.  **b) Una instancia de una clase.**

    - _Un objeto es una representación concreta de una clase._

5.  **b) El ocultamiento de los detalles internos de un objeto y la exposición
    de una interfaz pública.**

    - _La encapsulación protege los datos y el comportamiento de un objeto del
      acceso no autorizado._

6.  **a) Una clase abstracta puede tener métodos concretos, mientras que una
    interfaz solo puede tener métodos abstractos.**

    - _Las clases abstractas pueden proporcionar implementaciones
      predeterminadas, mientras que las interfaces definen contratos._

7.  **b) `abstract`**

    - _La palabra clave `abstract` se utiliza para declarar una clase
      abstracta._

8.  **b) `implements`**

    - _La palabra clave `implements` se utiliza para indicar que una clase
      implementa una interfaz._

9.  **a) Sí.**

    - _Una clase puede implementar múltiples interfaces, lo que permite la
      herencia múltiple de tipos._

10. **a) Sí.**

    - _Las clases abstractas pueden tener constructores, que se utilizan para
      inicializar los atributos de la clase._

11. **b) Un evento que interrumpe el flujo normal de un programa.**

    - _Las excepciones representan errores o condiciones excepcionales que
      ocurren durante la ejecución._

12. **a) Las excepciones comprobadas deben ser manejadas explícitamente,
    mientras que las no comprobadas no.**

    - _El compilador de Java obliga a manejar las excepciones comprobadas._

13. **b) `try-catch`**

    - _El bloque `try-catch` se utiliza para capturar y manejar excepciones._

14. **b) `throw`**

    - _La palabra clave `throw` se utiliza para lanzar una excepción
      manualmente._

15. **b) `finally`**

    - _El bloque `finally` se ejecuta siempre, independientemente de si ocurre
      una excepción o no._

16. **b) Una forma concisa de referenciar un método existente.**

    - _Los métodos de referencia proporcionan una sintaxis abreviada para llamar
      a métodos._

17. **b) `::`**

    - _El operador `::` se utiliza para crear métodos de referencia._

18. **b) Una función anónima que se puede pasar como argumento a un método.**

    - _Las funciones lambda son expresiones que representan funciones anónimas._

19. **c) `Runnable`**

    - _La interfaz `Runnable` se utiliza para representar tareas que se pueden
      ejecutar en hilos._

20. **c) `Function`**

    - _La interfaz `Function` se utiliza para representar funciones que toman un
      argumento y devuelven un valor._

21. **b) División por cero.**

    - _La división por cero lanza una excepción `ArithmeticException`, que se
      captura en el bloque `catch`._

22. **c) Pueden ser implementadas por múltiples clases.**

    - _Las interfaces permiten la herencia múltiple de tipos._

23. **b) extends.**

    - _La palabra clave `extends` se utiliza para heredar de una clase o
      interfaz._

24. **b) Ejecutar código que siempre debe ejecutarse, independientemente de si
    ocurre una excepción o no.**

    - _El bloque `finally` se utiliza para liberar recursos o realizar tareas de
      limpieza._

25. **b) Los métodos de referencia son más concisos cuando la lambda simplemente
    llama a un método existente.**

    - _Los métodos de referencia proporcionan una sintaxis abreviada para llamar
      a métodos existentes._

26. **c) NullPointerException.**

    - _Las excepciones no comprobadas extienden `RuntimeException`._

27. **b) La capacidad de un objeto para tomar muchas formas.**

    - _El polimorfismo permite que los objetos se comporten de manera diferente
      según su tipo._

28. **b) No pueden ser instanciadas.**

    - _Las clases abstractas no se pueden instanciar directamente._

29. **a) `BiFunction`**

    - _La interfaz `BiFunction` se utiliza para representar funciones que toman
      dos argumentos y devuelven un valor._

30. **a) El código no compilará porque `MyClass` no implementa `myMethod()`.**
    - _Una clase que implementa una interfaz debe proporcionar implementaciones
      para todos los métodos de la interfaz._
