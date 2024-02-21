public class RecursionConcept {

    // Addition of Number from 0 to 5
    public static int number(int k)
    {
        if (k>0){
            return k + number(k-1);
        } else {
            return 0;
        }
    }

    // Addition of Number from 5 to 10
    public static int number2(int first, int last)
    {
        if(last>first){
            return last + number2(first, last-1);
        } else {
            return last;
        }
    }
    public static void main(String[] args) {
        int sum = number(5);
        int sum1 = number2(5,10);
        System.out.println("Sum Of Numbers From 0 to 5 Through Recursion Is - "+sum);
        System.out.println("Sum Of Numbers From 5 to 10 Through Recursion Is - "+sum1);
    }
}
