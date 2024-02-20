import java.util.*;

public class StackListTest {
    public static void main (String args[]){
        Stack<String> list = new Stack<String>();
        list.push("Do You Know");
        list.push("Programming..?");
        list.push("Ethics..?");
        list.pop(); //Last In First Out

        Iterator<String> itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
