# Abstraction vs Encapsulation

## Abstraction
Abstraction means **hiding implementation details and showing only the essential features of an object**.
It focuses on **what an object does**, not how it does it.

When you use abstraction:
* You define behavior.
* You don’t expose internal logic.
* The user of the class doesn’t need to know how something works internally.

In Java, abstraction is achieved using:
* Abstract classes
* Interfaces

Abstraction is about **design and behavior**.


## Encapsulation

Encapsulation means **wrapping data (variables) and methods together in a class and restricting direct access to some of the data**.
It focuses on **protecting the internal state of an object**.

When you use encapsulation:
* You make variables private.
* You control access using public methods (getters/setters).
* You prevent invalid or unsafe changes to the object’s data.

Encapsulation is about **data protection and control**.


## Key Difference 
* **Abstraction** hides *how something works*.
* **Encapsulation** hides *the data itself*.

Or even simpler:
* Abstraction → “What can this object do?”
* Encapsulation → “How is this object’s data protected?”

