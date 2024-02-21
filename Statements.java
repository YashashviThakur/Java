public class Statements{
    public static void main (String args[]) {
        int ram = 200;
        int laxman = 100;
        int rank = 1;

        //If else statement

        if (ram>laxman) {
            System.out.println("Ram got more marks then laxman");
        }
        else{
            System.out.println("laxman got more marks then ram");
        }

        //Switch statement
        switch (rank){
            case 1:
            System.out.println("Rank in class is - First");
            break;
            case 2:
            System.out.println("Rank in class is - Second");
        }
    }

}