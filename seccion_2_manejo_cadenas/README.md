# Seccion 2: Manejo de Cadenas

---

## Ejercicio 1: Formateador de Nombres

**Descripción**: Crea un programa que reciba un nombre completo con el formato
"nombre apellidos" y lo devuelva en el formato "Apellidos, Nombre".

- **Ejemplo de Entrada**: `"Carlos López Martínez"`
- **Salida Esperada**: `"López Martínez, Carlos"`

---

## Ejercicio 2: Generador de Alias

**Descripción**: Crea un programa que tome el nombre y apellido de una persona y
genere un alias siguiendo estas reglas:

- La primera letra del nombre, en minúscula.
- El apellido completo, en mayúsculas.
- Todos los caracteres sin espacios.

- **Ejemplo de Entrada**:
  - **Nombre**: `Miguel`
  - **Apellido**: `Ramírez`
- **Salida Esperada**: `"mRAMÍREZ"`

---

## Ejercicio 3: Extractor de Dominio de Correo

**Descripción**: Crea un programa que reciba una dirección de email y extraiga
el dominio, sin incluir la extensión (.com, .es, etc.).

- **Ejemplo de Entrada**: `"usuario@empresa.com"`
- **Salida Esperada**: `"empresa"`

---

## Ejercicio 4: Formateador de Texto

**Descripción**: Escribe un programa que reciba un párrafo y lo formatee
aplicando los siguientes cambios:

- Elimina los espacios al inicio y al final.
- Reemplaza todos los dobles espacios entre palabras con un solo espacio.
- Convierte todas las letras a minúsculas.
- La primera letra de la primera palabra debe estar en mayúscula.

- **Ejemplo de Entrada**: `" Java es GENIAL y muy útil "`
- **Salida Esperada**: `"Java es genial y muy útil"`

## Ejercicio 5: Generador de Email

**Descripción**: Crea un programa que genere un email único a partir de los
datos personales de un usuario.

### Datos de Entrada

- **Nombre completo**: El nombre completo del usuario (nombre y apellidos),
  separados por espacios y con la primera letra en mayúscula para cada palabra.
- **Empresa**: Nombre de la empresa donde trabaja, separado por espacios si es
  necesario.
- **Dominio**: El dominio para el correo electrónico (por ejemplo: `com`, `es`,
  etc.).

### Ejemplo de Entrada

- **Nombre completo**: `Ana García López`
- **Empresa**: `Open AI`
- **Dominio**: `com`

### Salida Esperada

```plaintext
Correo generado: anagarcialopez@openai.com
```

---

---

# Test Sección 2

### **1. ¿Qué método devuelve el número de caracteres de una cadena?**

- A) `size()`
- B) `length()`
- C) `chars()`

---

### **2. ¿Qué método se utiliza para eliminar espacios al inicio y al final de una cadena?**

- A) `trim()`
- B) `stripSpaces()`
- C) `removeSpaces()`

---

### **3. ¿Qué método convierte todos los caracteres de una cadena a mayúsculas?**

- A) `toUpperCase()`
- B) `capitalize()`
- C) `makeUpperCase()`

---

### **4. ¿Qué método convierte todos los caracteres de una cadena a minúsculas?**

- A) `toLowerCase()`
- B) `toSmall()`
- C) `lower()`

---

### **5. ¿Qué método reemplaza todas las apariciones de un carácter específico por otro?**

- A) `replaceAll()`
- B) `replace()`
- C) `substitute()`

---

### **6. ¿Cuál es la diferencia entre `replace()` y `replaceAll()`?**

- A) `replace()` usa expresiones regulares y `replaceAll()` no.
- B) `replaceAll()` usa expresiones regulares y `replace()` no.
- C) Ambas hacen lo mismo, pero con diferentes nombres.

---

### **7. ¿Qué método se usa para extraer una parte de una cadena?**

- A) `slice()`
- B) `substring()`
- C) `split()`

---

### **8. ¿Qué método encuentra la posición de la primera aparición de un carácter o texto?**

- A) `indexOf()`
- B) `findIndex()`
- C) `positionOf()`

---

### **9. ¿Qué método encuentra la posición de la última aparición de un carácter o texto?**

- A) `lastIndexOf()`
- B) `finalIndexOf()`
- C) `lastPosition()`

---

### **10. ¿Qué salida genera este código?**

```java
String texto = "Java es divertido";
System.out.println(texto.indexOf("es"));
```

- A) 5
- B) 6
- C) 4

---

### 11. ¿Qué salida genera este código?

```java
String texto = "Java es divertido";
System.out.println(texto.substring(5, 7));
```

- A) es
- B) div
- C) av

---

### 12. ¿Qué método permite unir múltiples cadenas con un separador?

- A) `StringBuilder.join()`
- B) `String.join()`
- C) `concat()`

---

### 13. ¿Qué clase se utiliza para concatenar cadenas de manera eficiente?

- A) `StringBuffer`
- B) `StringBuilder`
- C) Ambas

---

### 14. ¿Qué método se utiliza para concatenar cadenas utilizando un operador?

- A) `+`
- B) `concat()`
- C) `join()`

---

### 15. ¿Cuál es una ventaja de usar `StringBuilder` en lugar de `+`?

- A) Es más rápido para concatenaciones múltiples.
- B) Es más fácil de leer.
- C) Es más compatible con versiones anteriores.

---

### 16. ¿Qué salida genera este código?

```java
StringBuilder sb = new StringBuilder("Hola");
sb.append(" Mundo");
System.out.println(sb.toString());
```

- A) Hola
- B) Hola Mundo
- C) HolaMundo

---

### 17. ¿Qué clase es thread-safe para concatenar cadenas?

- A) `String`
- B) `StringBuilder`
- C) `StringBuffer`

---

### 18. ¿Qué salida genera este código?

```java
String texto = "Java, Python, C++";
String[] lenguajes = texto.split(", ");
System.out.println(lenguajes[1]);
```

- A) Java
- B) Python
- C) C++

### 19. ¿Qué hace el método `replaceAll("\\s+", " ")`?

- A) Reemplaza todos los espacios múltiples por un solo espacio.
- B) Reemplaza todas las letras por espacios.
- C) Reemplaza solo el primer espacio por un guion.

---

### 20. ¿Qué método de `StringBuilder` permite reiniciar el contenido a una cadena vacía?

- A) `clear()`
- B) `delete()`
- C) `setLength(0)` s

---

---

# Respuestas

1: B  
2: A  
3: A  
4: A  
5: B  
6: B  
7: B  
8: A  
9: A  
10: A  
11: A  
12: B  
13: C  
14: A  
15: A  
16: B  
17: C  
18: B  
19: A  
20: C
