public class ExceptionFinally {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; 
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero");
        } finally {
            System.out.println("Finally block executed");
        }
        
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[5]);
          } catch (Exception f) {
            System.out.println("\nError: Out Of Bound Of Array");
          } finally {
            System.out.println("Finally block executed");
        }

    }
}

