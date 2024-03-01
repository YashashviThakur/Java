import java.util.*;

enum days {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class JavaEnumExample {
    public static void main(String[] args) {
        Set<days> set = EnumSet.of(days.TUESDAY, days.WEDNESDAY);

        // Traversing elements
        Iterator<days> itr = set.iterator();
        while (itr.hasNext())
        System.out.println(itr.next());

        Set<days> set1 = EnumSet.allOf(days.class);
        System.out.println("Week Days:" + set1);     // Print full list
        Set<days> set2 = EnumSet.noneOf(days.class);
        System.out.println("Week Days:" + set2);     // Print none
    }

}
