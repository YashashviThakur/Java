import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class JavaRegexFinderExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Please Enter Text"); 
            Pattern pattern = Pattern.compile(sc.nextLine(),Pattern.CASE_INSENSITIVE);
            System.out.println("Enter The Text Again (To Check it's same or not) :");
            Matcher matcher = pattern.matcher(sc.nextLine());
            boolean found = false;
            while(matcher.find()){
                System.out.println("The text got matched '"+matcher.group()+"' starting at index "+matcher.start()+" and ending at index "+matcher.end());
                found=true;
            }
            if(!found){
                System.out.println("No match found..");
            }
        }
    }
}
