import java.util.*;

public class VectorListTest {

    public static void main(String[] args) {
        Vector<String> list = new Vector<String>();
        list.add("Robert");
        list.add("Downey");
        list.add("Jr.");

        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }

}
