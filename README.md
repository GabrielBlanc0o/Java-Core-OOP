# Java Mastery Journey 
Diseñado y mantenido con disciplina por Gabriel Blanco.

Bienvenido a mi espacio de documentación y práctica intensiva de **Java Core y Arquitectura Orientada a Objetos**. Este repositorio no es solo un bloc de notas de código, sino el reflejo de mi evolución técnica desde los fundamentos lógicos hasta el diseño de software desacoplado y eficiente.

---

##  Estado Actual y Enfoque

Actualmente, el repositorio está estructurado bajo principios de diseño limpio, separando los conceptos fundamentales de las implementaciones avanzadas de POO y el manejo de estructuras dinámicas de datos.

###  Objetivos del Camino
- [x] Dominar la lógica de control, manipulación de matrices bidimensionales y ordenamiento.
- [x] Consolidar los pilares de POO (Encapsulamiento, Herencia, Polimorfismo y Abstracción).
- [x] Implementación de patrones de diseño de comportamiento (como *Iterator* usando clases internas).
- [ ] Integración avanzada con Frameworks de persistencia (**Hibernate**) y arquitectura empresarial (**Spring Boot**).

---

##  Estructura del Proyecto

El repositorio está organizado en módulos progresivos para garantizar un aprendizaje incremental:

```text
├── 01-Fundamentals/         # Sintaxis básica, tipos de datos, control de flujo y lectura de excepciones.
│   └── src/
│       ├── Chapter 3/       # Tipos primitivos, inicialización dinámica y casting.
│       └── Chapter 6/       # Primeros pasos con clases, constructores parametrizados y manejo de memoria.
│
├── 02-Object-Oriented/      # El núcleo del repositorio. Aplicación real de los pilares de POO.
│   └── src/
│       ├── POO_ibm/         # Ejercicios prácticos con enfoque corporativo.
│       │   ├── Abstraccion/ # Modelado de sistemas bancarios y pasarelas de pago (PayPal, Stripe).
│       │   ├── Polimorfismo/# Polimorfismo en tiempo de ejecución, sobrecarga de métodos y sobrescritura.
│       │   ├── Inner clases/# Clases internas/estáticas y diseño del patrón Iterator desde cero.
│       │   └── Framework Collections/ # Manipulación avanzada de ArrayList, LinkedList, Sets y Maps.
│       └── imccalc/         # Lógica aplicada al tracking de rendimiento físico.
│
└── 03-Advanced-Concepts/    # Manejo robusto de excepciones y simulación de conexiones a Bases de Datos.
        
