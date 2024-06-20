## Creational Patterns

Creational design patterns are a category of design patterns in object-oriented programming that deal with object creation mechanisms. These patterns aim to solve the problem of creating objects in a manner that is suitable for the situation at hand. By using creational patterns, we can ensure that our system is flexible, reusable, and easier to manage.

## 1. Singleton Pattern

Purpose: Ensure a class has only one instance and provide a global point of access to it.

Use Case: Useful when exactly one object is needed to coordinate actions across the system.

Example: Logger class, configuration settings manager, database connection pool.

## 2. Factory Pattern

Purpose: Define an interface for creating an object, but let subclasses alter the type of objects that will be created.

Use Case: Useful when a class cannot anticipate the type of objects it needs to create beforehand.

Example: Document creation in a word processor (text, spreadsheets, presentations), shapes in a drawing application.

## 3. Abstarct Factory Pattern

Purpose: Provide an interface for creating families of related or dependent objects without specifying their concrete classes.

Use Case: Useful when the system needs to be independent of how its objects are created and when the system is configured with one of multiple families of products.

Example: GUI toolkits (different look and feel for different operating systems), theme-based application UI components.

## 4. Prototype Pattern

Purpose: Specify the kinds of objects to create using a prototypical instance, and create new objects by copying this prototype.

Use Case: Useful when the cost of creating a new instance of a class is expensive or complicated.

Example: Cloning objects in a game, creating new instances of a complex object that is resource-intensive to create from scratch.

## 5. Builder Pattern

Purpose: Separate the construction of a complex object from its representation so that the same construction process can create different representations.

Use Case: Useful when the construction process is complex and involves many steps.

Example: Building a complex document (HTML, PDF), constructing a multi-step order in an e-commerce system.