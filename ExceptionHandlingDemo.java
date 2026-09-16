// Custom Exception Class
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class ExceptionHandlingDemo {

    // Method that throws a custom checked exception
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Access denied: You must be at least 18 years old.");
        } else {
            System.out.println("Access granted: Age verified.");
        }
    }

    public static void main(String[] args) {
        int[] userAges = {21, 15};

        for (int age : userAges) {
            System.out.println("\nChecking age: " + age);
            
            try {
                // Code that might throw an exception
                validateAge(age);
                
                // Example of Built-in Unchecked Exception (ArithmeticException)
                if (age == 21) {
                    int result = 10 / 0; // Will trigger ArithmeticException
                }

            } catch (InvalidAgeException e) {
                // Catch custom age exception
                System.out.println("Custom Exception Caught: " + e.getMessage());

            } catch (ArithmeticException e) {
                // Catch built-in runtime exception
                System.out.println("Runtime Exception Caught: Cannot divide by zero.");

            } catch (Exception e) {
                // Catch-all for any other unexpected exceptions
                System.out.println("General Exception Caught: " + e.getMessage());

            } finally {
                // Always executes regardless of an exception
                System.out.println("Cleanup: Age check processing completed.");
            }
        }
    }
}