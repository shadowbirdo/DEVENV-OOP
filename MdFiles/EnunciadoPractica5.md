# Relaciones entre clases

**UD 4:** Programación orientada a objetos y el lenguaje de modelado unificado (UML)
**Bloque III:** Elaboración de diagramas con UML

## Entregable

*   Proyecto Java completo en un repositorio GitHub (URL).
*   Memoria breve (1–2 páginas) explicando:
    *   Clases creadas y propósito.
    *   Respuesta a las preguntas de la actividad 7 (Nota: ver punto 8).
    *   Cómo se usan las clases.
    *   Ejemplo de ejecución.
*   ==**Fecha de entrega: Miércoles 19 a las 21:00 horas.**==

---

## Actividades

1.  A partir de la clases `Persona`, `Biblioteca`, `Sala` y `Libro`, completa sus atributos con los siguientes requisitos:
    *   `Biblioteca`: lista de salas, lista de libros, lista de personas.
    *   `Sala`: aforo máximo, número actual de personas, tipo de sala.

2.  Implementa las siguientes relaciones:

| Relación        | Clases implicadas        | Tipo                                                       |
| :-------------- | :----------------------- | :--------------------------------------------------------- |
| **Composición** | `Biblioteca` → `Sala`    | La biblioteca crea y gestiona sus salas internamente.      |
| **Agregación**  | `Biblioteca` → `Libro`   | La biblioteca mantiene una colección de libros existentes. |
| **Asociación**  | `Sala` → `Persona`       | Cada sala tiene una persona responsable.                   |
| **Dependencia** | `Biblioteca` → `Persona` | Al registrar una visita o préstamo.                        |

3.  A partir de `Libro`, define:
    *   `LibroFisico` → con atributos como `numPaginas`, `ubicacion`.
    *   `LibroDigital` → con atributos como `formato`, `tamañoMB`.

4.  A partir de `Persona`, define:
    *   `Usuario` → con atributos como `numSocio`, `listaLibrosPrestados`.
    *   `Empleado` → con atributos como `puesto`, `sueldo`.

5.  A partir de `Sala`, define:
    *   `SalaLectura` → con atributos como `listaLibros`.
    *   `SalaEstudio` → con atributos como `numMesas`.
    *   `SalaInformatica` → con atributos como `numEquipos`.

6.  Funcionalidades a implementar en la clase `Biblioteca` con las nuevas relaciones:
    *   `registrarVisita(Persona p)` → Muestra un mensaje con el nombre de la persona que entra.
    *   `addSala(Sala s)` → Crea o añade salas propias.
    *   `addLibro(Libro l)` → Añade un libro existente a la colección.
    *   `asignarResponsable(Sala s, Persona p)` → Asocia una persona responsable a una sala.
    *   `mostrarInformacion()` → Actualiza esta información para que se muestre información de los nuevos atributos, recorriendo las colecciones e imprimiendo su información.

7.  Actualiza el Main y añade lo siguiente:
    *   Crea una `Biblioteca` llamada “Central”.
    *   Crea distintos tipos de `Libro` (`LibroFisico`, `LibroDigital`).
    *   Crea varias `Sala` de diferentes tipos y las añada a la biblioteca.
    *   Crea distintas `Persona` (`Usuario`, `Empleado`) y las asocie a salas o a préstamos.
    *   Muestre por pantalla toda la información.

8.  **Preguntas de análisis:**
    *   a. ¿Qué tipo de relación hay entre `Biblioteca` y `Sala`? ¿Por qué?
    *   b. ¿Qué pasaría con las salas si se destruye la biblioteca?
    *   c. ¿En qué se diferencia la agregación de la composición en tu código?
    *   d. ¿Por qué tiene sentido que `LibroDigital` y `LibroFisico` hereden de `Libro`?
    *   e. ¿Qué ventaja ofrece la herencia al definir distintos tipos de personas?
    *   f. ¿Dónde usarías `@Override` en tu implementación?