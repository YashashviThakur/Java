import java.util.Scanner;

public class ExceptionUsingScanner {
    public static void main(String[] args) {

        try {
            int number = readNumber();
            System.out.println("Please Enter a Number : " + number);
        } catch (java.util.InputMismatchException e) {
            System.out.println("Error: Please Input Valid Integer");
        } finally {
            System.out.println("Finally Block Executed");
        }
    }

    public static int readNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scan.nextInt();
        scan.close();
        return number;
    }
 }

