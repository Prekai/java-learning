# 02 Transitioning from Shellto Intellij

## Keywords in the Program
- `public` is an access modifier that defines who can access a class, method, or variable.
- `void` means that a method does not return any value.
- `static` means that a member belongs to the class itself, not to an object instance.
- `class` is used to declare a class.
  - It is followed by the class name.
  - `{}` contains the class body, which can include methods, variables, and other members.

## Methods
- A method is a collection of one or more statements that perform a specific task.
- `()` contains the parameter list in the method declaration.
- Methods can be predefined or created by the user.
- For example, `main` is the entry point of a Java program.

## Conditional Logic (`if-then`)
- An `if` statement is a control flow statement.
- It checks whether a condition is `true` or `false`.
- Based on the result, code is either executed or skipped.
- Best practice: always use `{}` for the code block, even if it contains only one statement.

## Operators
- `&&` = logical AND
- `||` = logical OR
- `==` = equal to
- `!` = logical NOT
- `!=` = not equal to
- `condition ? value1 : value2` = ternary conditional operator

## Best Practices
- Put conditions inside `()` to improve readability.
- Use `{}` for code blocks to make the code safer and easier to read.
- For boolean values, prefer direct expressions such as:
  - `if (isActive)`
  - instead of `if (isActive == true)`
