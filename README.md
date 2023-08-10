# example-strategy-pattern

## Concept

The idea of this project is to use the Strategy Pattern to solve a problem to dynamically decide what payment to use.

Using Strategy Pattern and leveraging features from Quarkus (Spring has similar features) we separate responsibilities and decouple the core application from each payment type specificities. 

Also, we can easily add new payment types, without having to change the core of the payment code or adding `switch` or `if` clauses, respecting some of the SOLID principles. 

 
## Technologies

- Kotlin
- Quarkus