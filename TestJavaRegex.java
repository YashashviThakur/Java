import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestJavaRegex {
    public static void main(String[] args) {
    Pattern pattern = Pattern.compile("Yashashvi", Pattern.CASE_INSENSITIVE);
    Matcher matcher = pattern.matcher("yashashvi");
    boolean matchFound = matcher.find();
    if(matchFound) {
      System.out.println("Name Match Found..");
    } else {
      System.out.println("Name Match Not Found..");
    }
  }
}
