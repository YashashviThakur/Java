public class Loops {
    public static void main (String args[]){
        
        //Using while loop
        System.out.println("Using while loop:");
        int i = 1;
        while (i <= 4) {
            System.out.println("Rank - " + i);
            i++;
        }

        // Using do while loop
        System.out.println("\nUsing do-while loop:");
        int j = 1;
        do {
            System.out.println("Rank - " + j);
            j++;
        } while (j <= 3);

        // Using for loop
        System.out.println("\nUsing for loop:");
        for(int k=1;k<3;k++){
            System.out.println("Rank - "+k);
        }
    }
}
