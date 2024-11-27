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
