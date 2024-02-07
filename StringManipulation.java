
public class StringManipulation {
   public static void main(String[] args) {
    StringBuffer s = new StringBuffer("Yashashvi Thakur");

    char c = s.charAt(3);
    System.out.println("Character at third Position in the String is - "+c);
    s.append(" Jr.");
    System.out.println("Appending the string - "+s);
    s.delete(0,9);
    System.out.println("After Deleting starting characters in String - "+s);
   } 
}
