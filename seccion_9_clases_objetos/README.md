# Seccion 9: Clases y Objetos

## Índice:

### 1. Ejercicios

- [Ejercicio 1 - Crear una Clase Sencilla](#ejercicio-1-crear-una-clase-sencilla)
- [Ejercicio 2 - Métodos Getters y Setters](#ejercicio-2-métodos-getters-y-setters)
- [Ejercicio 3 - Crear Varias Clases Relacionadas](#ejercicio-3-crear-varias-clases-relacionadas)
- [Ejercicio 4 - Arreglos de Objetos](#ejercicio-4-arreglos-de-objetos)
- [Ejercicio 5 - Herencia y Polimorfismos](#ejercicio-5-herencia-y-polimorfismo)

### 2. Test

- [Preguntas](#test-oop-oriented-object-programing)
- [Respuestas](#test-respuestas)

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

<hr style="border: 1px solid #136AC7;" />

# **Test: OOP (Oriented Object Programing)**

#### **1.** ¿Qué es la Programación Orientada a Objetos (OOP)?

- a) Un paradigma de programación basado en el uso de funciones y
  procedimientos.
- b) Un paradigma de programación basado en objetos que combinan datos y
  métodos.
- c) Un enfoque para diseñar bases de datos relacionales.

#### **2.** ¿Qué es una clase en OOP?

- a) Una instancia de un objeto.
- b) Una estructura que contiene únicamente datos.
- c) Una plantilla o molde para crear objetos.

#### **3.** ¿Qué es un objeto en OOP?

- a) Una variable que almacena datos.
- b) Una instancia de una clase que combina estado y comportamiento.
- c) Una función que realiza una tarea específica.

#### **4.** ¿Qué significa encapsulación en OOP?

- a) Agrupar datos y métodos en una clase mientras se ocultan los detalles
  internos.
- b) Heredar características de otra clase.
- c) Permitir que múltiples clases compartan una misma interfaz.

#### **5.** ¿Cómo se implementa la encapsulación en Java?

- a) Declarando atributos privados y proporcionando getters y setters.
- b) Declarando todos los atributos públicos.
- c) Usando la palabra clave `protected` para todos los métodos.

#### **6.** ¿Qué es un constructor en Java?

- a) Un método que debe ser llamado manualmente para inicializar un objeto.
- b) Un método especial que se llama automáticamente al crear un objeto.
- c) Una función que retorna valores constantes para los atributos.

#### **7.** ¿Qué principio de OOP permite que una clase reutilice el comportamiento de otra clase?

- a) Polimorfismo.
- b) Encapsulación.
- c) Herencia.

#### **8.** ¿Qué palabra clave se utiliza en Java para establecer una relación de herencia entre dos clases?

- a) extends.
- b) inherits.
- c) super.

#### **9.** ¿Qué significa el término polimorfismo en OOP?

- a) La capacidad de un objeto de comportarse como cualquier otra clase.
- b) La capacidad de una clase de tener múltiples constructores.
- c) La capacidad de un método de tomar diferentes formas, según la clase o
  parámetros.

#### **10.** ¿Qué es una interfaz en Java?

- a) Una clase que no puede ser instanciada.
- b) Un conjunto de métodos que una clase debe implementar.
- c) Una clase que proporciona implementación completa de todos sus métodos.

#### **11.** ¿Qué acceso tienen los miembros de una clase marcados con `private`?

- a) Solo son accesibles dentro de la misma clase.
- b) Son accesibles desde todas las clases.
- c) Son accesibles desde las subclases.

#### **12.** ¿Qué es la sobrecarga de métodos (method overloading) en Java?

- a) La implementación de métodos con el mismo nombre pero diferentes
  parámetros.
- b) La implementación de métodos en clases diferentes con el mismo
  comportamiento.
- c) La capacidad de un método de sobrescribir a otro en una subclase.

#### **13.** ¿Qué es la sobrescritura de métodos (method overriding) en OOP?

- a) Cambiar el comportamiento de un método heredado en una subclase.
- b) Declarar métodos con el mismo nombre pero diferentes parámetros.
- c) Crear un método estático en una clase padre.

#### **14.** ¿Cuál es la principal diferencia entre herencia y composición?

- a) La herencia implica reutilizar código, mientras que la composición no.
- b) La herencia utiliza `extends`, mientras que la composición utiliza objetos
  como atributos.
- c) La composición solo puede ser usada en lenguajes funcionales.

#### **15.** ¿Qué ocurre si un constructor no se define en una clase?

- a) La clase no puede ser instanciada.
- b) Java genera un constructor por defecto sin parámetros.
- c) Se lanza una excepción en tiempo de ejecución.

#### **16.** ¿Qué principio de OOP establece que una subclase puede ser tratada como una instancia de su clase base?

- a) Abstracción.
- b) Polimorfismo.
- c) Encapsulación.

#### **17.** ¿Qué es un atributo estático en Java?

- a) Un atributo que pertenece a una instancia de la clase.
- b) Un atributo que pertenece a la clase y es compartido por todas las
  instancias.
- c) Un atributo que solo puede ser accedido desde fuera de la clase.

#### **18.** ¿Cuál es el propósito de un método abstracto en una clase abstracta?

- a) Proporcionar una implementación predeterminada que puede ser sobrescrita.
- b) Declarar un método que no tiene implementación y debe ser definido en
  subclases.
- c) Evitar que la clase sea instanciada directamente.

#### **19.** ¿Cuál es una ventaja clave de la Programación Orientada a Objetos?

- a) Permite escribir código sin necesidad de planificar previamente.
- b) Facilita la reutilización y el mantenimiento del código.
- c) Reduce el uso de clases y objetos en un programa.

#### **20.** ¿Qué es el principio de abstracción en OOP?

- a) Ocultar los detalles de implementación y mostrar solo la funcionalidad
  necesaria.
- b) Permitir que las subclases sobrescriban los métodos de la clase base.
- c) Utilizar atributos estáticos y finales para mantener valores constantes.

<hr style="border: 1px solid #136AC7;" />

# **Test: Respuestas**

**1. b) Un paradigma de programación basado en objetos que combinan datos y
métodos.**  
_Porque la OOP se centra en la creación de objetos que encapsulan datos y
comportamientos._

**2. c) Una plantilla o molde para crear objetos.**  
_Porque una clase define la estructura y comportamiento de los objetos._

**3. b) Una instancia de una clase que combina estado y comportamiento.**  
_Porque un objeto es una entidad concreta basada en una clase._

**4. a) Agrupar datos y métodos en una clase mientras se ocultan los detalles
internos.**  
_Porque la encapsulación se centra en proteger los datos y exponer solo lo
necesario._

**5. a) Declarando atributos privados y proporcionando getters y setters.**  
_Porque este enfoque garantiza el control de acceso a los atributos._

**6. b) Un método especial que se llama automáticamente al crear un objeto.**  
_Porque el constructor inicializa un objeto en el momento de su creación._

**7. c) Herencia.**  
_Porque la herencia permite que una clase reutilice las características de
otra._

**8. a) extends.**  
_Porque en Java, la palabra clave `extends` define una relación de herencia._

**9. c) La capacidad de un método de tomar diferentes formas, según la clase o
parámetros.**  
_Porque el polimorfismo permite que un método funcione de manera diferente en
distintas clases._

**10. b) Un conjunto de métodos que una clase debe implementar.**  
_Porque las interfaces definen un contrato que las clases deben seguir._

**11. a) Solo son accesibles dentro de la misma clase.**  
_Porque `private` limita el acceso únicamente al contexto de la clase._

**12. a) La implementación de métodos con el mismo nombre pero diferentes
parámetros.**  
_Porque la sobrecarga permite definir métodos similares con distintas firmas._

**13. a) Cambiar el comportamiento de un método heredado en una subclase.**  
_Porque la sobrescritura redefine un método de la clase base en una subclase._

**14. b) La herencia utiliza `extends`, mientras que la composición utiliza
objetos como atributos.**  
_Porque la herencia define relaciones jerárquicas, mientras que la composición
combina objetos._

**15. b) Java genera un constructor por defecto sin parámetros.**  
_Porque si no se define un constructor, Java crea uno vacío automáticamente._

**16. b) Polimorfismo.**  
_Porque este principio permite tratar a un objeto como una instancia de su clase
base._

**17. b) Un atributo que pertenece a la clase y es compartido por todas las
instancias.**  
_Porque los atributos estáticos no son exclusivos de una instancia._

**18. b) Declarar un método que no tiene implementación y debe ser definido en
subclases.**  
_Porque un método abstracto define un contrato que las subclases deben cumplir._

**19. b) Facilita la reutilización y el mantenimiento del código.**  
_Porque la OOP organiza el código para que sea modular y fácil de gestionar._

**20. a) Ocultar los detalles de implementación y mostrar solo la funcionalidad
necesaria.**  
_Porque la abstracción se centra en mostrar solo lo relevante para el usuario._
