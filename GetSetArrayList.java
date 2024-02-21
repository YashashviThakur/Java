import java.util.*;

public class GetSetArrayList {
    public static void main(String args[]) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("First");
        list.add("Second");
        list.add("Third");
        list.add("Second");

        for (String rank1 : list) {
            System.out.println(rank1);
        }

        System.out.println("\nWrong rank in list : " + list.get(3));
        list.set(3, "Fourth");
        System.out.println("\nCorrect list of rank is : ");
        for (String rank2 : list) {
            System.out.println(rank2);
        }

        Collections.sort(list);
        System.out.println("\nAfter sorting the list alphabatically :");
        for (String rank3 : list) {
            System.out.println(rank3);
        }

        System.out.println("\nTraversing list through forEachRemaining() method:");
        Iterator<String> itr = list.iterator();
        itr.forEachRemaining(a -> // Here, we are using lambda expression
        {
            System.out.println(a);
        });
    }
}
