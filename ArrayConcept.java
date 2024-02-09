
public class ArrayConcept {

    public static void main (String args[]){

        //Single Dimension Array
        String[] subjects = {"Java", "DSA", ".Net"};
        System.out.println("First Element of Single Dimenesion Array - "+subjects[0]);
        System.out.println("Legnth of Single Dimenesion Array - "+subjects.length);
        subjects[0] = "Core Java";
        System.out.println("After Changing, First element Of Single Dimenesion Array - "+subjects[0]);
        for (int i=0; i<subjects.length;i++){
            System.out.println( i+ " Elements Of Single Dimenesion Array is - "+subjects[i]);
        }

        // Multiple Dimension Arrays
        int[][] marks = {{15,18,16},{16,14,17}};
        System.out.println("\nPrinting First Array of Multiple Arrays - "+marks[0][0]+","+marks[0][1]+","+marks[0][2]);
        System.out.println("Printing Second Array of Multiple Arrays - "+marks[1][0]+","+marks[1][1]+","+marks[1][2]);
        System.out.println("Printing 2nd element of 1st Mutiple Array - "+marks[0][1]);
        System.out.println("Printing 2nd element of 2nd Multiple Array - "+marks[1][1]);
    }
}
