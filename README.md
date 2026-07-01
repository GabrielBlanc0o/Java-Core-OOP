# Java Core & OOP — Learning Repository


Daily-practice repository built over 3+ months to master Java from the ground up — fundamentals, object-oriented design, data structures, and real-world business logic. Every file written independently, no copy-paste from tutorials.
---

## Repository Structure

### `01-Fundamentals/src`
Core Java syntax: primitive types, control flow, casting, arrays, constructors, and basic class design.

Notable files:
- `imccalc/` — **Fitness Performance Tracker**: multi-class system with separated data (`Atleta`) and business logic (`EntrenamientoService`), applies Single Responsibility Principle.
- `Chapter 6 Classes/garbage collection/ejerciciosPracticaPropia/` — Session manager, transaction history, and Transmilenio ticket simulator.

### `02-Object-Oriented/src`
Core OOP implementations across all four pillars.

**Encapsulation & Inheritance**
- `otros/SimuladorBanco.java` — Interactive CLI banking system with `CuentaBancaria` → `CuentaCorriente` inheritance, overdraft handling, exception management, and user menu loop.
- `Abstraccion/EjercicioPropio3/Main.java` — Abstract banking system with `OperacionBancaria` interface, abstract class, and polymorphic ArrayList of accounts.

**Polymorphism & Abstraction**
- `Polimorfismo/` — Runtime polymorphism, virtual method dispatch, and animal farm simulation.
- `Lab v2 Inheritance & Interfaces/` — Abstract method contracts with concrete implementations.

**Java Collections Framework**
- `Framework Collections/` — Real-world usage of ArrayList, LinkedList, HashSet, HashMap, TreeMap.
  - `Ejemplos en la vida real/ecommerce.java` — E-commerce product management with collections.
  - `Ejemplos en la vida real/administradorTareas.java` — Task manager with list operations.
  - `Ejercicios/Reto 1/CuentasDuplicadas.java` — Duplicate detection with Set.
  - `Ejercicios/Reto 2/HistorialNavegacion.java` — Browser history with LinkedList.
- `HashMap_and_TreeMap/LabHashMapIBM/` — Phone book, task management system with file persistence.
- `HashMap_and_TreeMap/TreeMapExamples/LeaderBoard.java` — Sorted leaderboard with TreeMap.

**Queues & Inner Classes**
- `Queues/ejemploReal.java` — Real-world queue simulation.
- `Inner clases/EjerciciosPropios/SistemaL.java` — Inner class patterns applied to a logistics system.

**File I/O & Directory Management**
- `admon_archivos/` — File reading/writing with streams, byte stream operations, NIO package usage, directory creation and listing.
- `admon_archivos/Ejercicios/RegistroUsuarios.java` — User registration persisted to file.
- `admon_archivos/Ejercicios/InventarioProductos.java` — Product inventory with file-backed storage.

### `03-Advanced-Concepts/src`
- `errorConBasesDeDatos.java` — Database connection interface simulation with exception handling.
- `tryC.java` — Try-with-resources and structured exception handling patterns.

### `leetcode/`
Algorithmic challenges solved in Java using collections (LinkedList, arrays).

---

## Tech Stack

- **Language:** Java (Core + OOP)
- **Version Control:** Git/GitHub with semantic commits
- **IDE:**  VS Code
- **Design Principles:** SOLID, DRY, Single Responsibility, encapsulation-first design

---

## What's Next

Currently transitioning from pure Java to **Spring Boot** backend development — REST APIs, JPA, PostgreSQL, JWT authentication, and cloud deployment.
