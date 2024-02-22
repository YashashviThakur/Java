import java.util.*;

public class ArrayToArrayList {
    public static void main(String[] args) {
        String[] array = {"First","Second","Third"};
        System.out.println("Arrays : "+Arrays.toString(array));

        //Converting to arraylist
        ArrayList<String> list = new ArrayList<String>();
        for(String rank:array){
            list.add(rank);
        }
        System.out.println("The Array List is : "+list);

    }
}
