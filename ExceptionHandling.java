public class ExceptionHandling {
    public static void main(String[ ] args) {
        try {
            int result = 10 / 0; 
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero");
        }

        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[5]);
          } catch (Exception f) {
            System.out.println("Error: Out Of Bound Of Array");
          }
      }
}
