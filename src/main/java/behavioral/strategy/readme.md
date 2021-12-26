Strategy pattern notes

- Define a family of algorithms (i.e. strategies), e.g. provide different route methods (walk,drive,bus) to get to point A to B on a map 
- The original class, called 'context' references these strategies
- client passes desired strategy to context

Applicability
- Use strategy pattern when you have a lot of similar classes that differ slightly in way they execute some behaviour
- 

Examples:
- Navigation app with different ways to navigate point A to P
- Selecting from different payment methods  

References:
- https://refactoring.guru/design-patterns/state
- 