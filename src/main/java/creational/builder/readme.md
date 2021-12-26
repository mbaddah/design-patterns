Builder pattern notes:

- Solves problem of trying to create complex object. E.g. Instead of creating multiple subclasses to cater for different configuration, or a constructor with long list of parameters you instead would create a builder object to construct. 
- Often support chaining
- Optional: Can use a director class to define order of steps. 

References:

- https://refactoring.guru/design-patterns/builder
- 