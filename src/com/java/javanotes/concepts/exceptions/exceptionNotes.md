## :: Exception in Java ::
```
An exception is an event that disrupts the normal flow of a program.
It occurs during runtime (not compile time) and usually happens due to errors like invalid input, file not found, dividing by zero, etc.
```
### Exception Hierarchy : 

```
In Java, all exceptions come from the Throwable class:

Throwable
 ├── Error        (serious problems, cannot handle, e.g. OutOfMemoryError)
 └── Exception    (conditions a program might want to catch)
       ├── RuntimeException (unchecked exceptions)
       └── Checked Exceptions (must be handled or declared)
 
🔹 Types of Exceptions

1. Checked Exceptions (must handle with try-catch or throws)
    These are checked at compile time.
    Example: IOException, SQLException

import java.io.*;

public class FileExample {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("myfile.txt");  // File may not exist
            System.out.println("File opened successfully");
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e);
        }
    }
}

result : File not found: java.io.FileNotFoundException: myfile.txt (No such file or directory)

2. Unchecked Exceptions (RuntimeExceptions)
    These are checked at runtime.
    Example: ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException

public class DivideExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;  // causes ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e);
        }
    }
}

response : Exception caught: java.lang.ArithmeticException: / by zero


>> Errors (not usually handled in code)
    Example: OutOfMemoryError, StackOverflowError
    
```
### Try-Catch-Finally : 

```
public class MultipleCatchExample {
    public static void main(String[] args) {
        try {
            int[] arr = new int[3];
            arr[5] = 10;  // ArrayIndexOutOfBoundsException
            int result = 10 / 0;  // ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Exception: " + e);
        } catch (Exception e) {
            System.out.println("General Exception: " + e);
        }
    }
}

Array Exception: java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 3

Note : If Exception  is written in first catch then that will catch the exception first as generic.

### Finally Block : 

public class FinallyExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e);
        } finally {
            System.out.println("Finally block always executes");
        }
    }
}

Response : 
Result: 5
Finally block always executes
```
### Throwing Custom Exception : 

```
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class CustomExceptionExample {
    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above!");
        } else {
            System.out.println("Valid age: " + age);
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(15);
        } catch (InvalidAgeException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
```

### SUMMARY : 

```dtd
✅ In summary:
Use try-catch to handle exceptions.
Use finally for cleanup code.
Use throw to explicitly throw an exception.
Use throws in method signature to declare checked exceptions.
Create custom exceptions for meaningful error handling.
```