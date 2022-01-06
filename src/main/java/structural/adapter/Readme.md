# Adapter pattern

Brief:
- Acts as wrapper between two objects to solve incompatibility issues.

Sample uses:
- Convert legacy system to compatible newer system
- XML to JSON converter
- Mph to Kmph

Key notes:
- Adapter pattern makes use of a constructor which takes abstract/interface type as parameter

Pros/Cons
* SRP - Adapter interface is separate from business logic 
+ O/C principal - Can introduce new adapters without modifying existing code

- Require introduction of new interfaces and classes, increasing overall complexity of code.