# Section 03 - Mastering Java Expressions, Statements, Code Blocks, and Methods

## Keyword Types
Java uses keywords as part of its language rules.

- `Reserved keywords` always have a special meaning in Java and cannot be used as names for variables, methods, or classes.
- `Contextual keywords` act like keywords only in specific language features or situations.

## Code Hierarchy
Java code is built from smaller parts that work together.

- An `expression` is a piece of code that produces a value.
- A `statement` is a complete instruction that tells the program to do something.
- A `code block` is a group of zero, one, or more statements enclosed in `{}` and treated as a single unit.

## Readability
Readable code is easier to understand, debug, and maintain.

Best practices for readability:
- Use vertical and horizontal spacing to separate parts of the code clearly.
- Break long code into multiple lines when it improves clarity.
- Use indentation to show the structure of code blocks.
- Write code in a way that is easy for humans to read, even though the compiler usually ignores extra whitespace.

## If-Else Statement
The `if-else` structure is used for conditional logic.

- The program checks conditions from top to bottom.
- The first condition that evaluates to `true` will have its code block executed.
- If an `if` condition is `false`, the program continues to the next `else if` condition.
- The `else` block runs only when none of the previous conditions are `true`.
- If there is no `else` block and no condition is `true`, all code blocks are skipped.

## Methods
A method is a block of code inside a class that performs a specific task when it is called.

- Methods help organise code into reusable parts.
- A method cannot be declared inside another method in Java.
- A single class can contain multiple methods.
- A method is called by using its name in the code.
  - If the method has parameters, you must pass matching values, variables, or expressions.
  - The type, number, and order of arguments must match the method definition.

### Parameters and Arguments
These two terms are related, but they are not the same.

- A `parameter` is a variable declared in the method header.
- An `argument` is the actual value or expression passed to the method when it is called.

### Method Overloading
Java allows multiple methods to have the same name as long as their parameter lists are different.

- This is called `method overloading`.
- The difference can be in the number, type, or order of parameters.
- Default value cannot be set for Method Overloading, but similar behaviour is achiavable with additional methods.

### Return Types
A method can either return a value or return nothing.

- The return type is written before the method name.
- A method with a return type must end with a `return` statement that gives back a result of the correct type.
- A method with the return type `void` does not return a value.
- A method that returns a value can be used in expressions, assigned to variables, or passed into other methods.
