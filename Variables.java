public class Variables {
public static void main (String args[]){
int roll_no = 1;
String name = "Yashashvi Thakur";
float avgmarks = 96.5f;
double marks = 97.88; 
char firstletter = 'Y';
int english = 97;
int hindi = 95;
int maths = 98;
boolean passed = true;

System.out.println( "Roll No. - " +roll_no);
System.out.println("First Character Of Your Name - " +firstletter);
System.out.println("Full Name - " +name);
System.out.println("Average Marks Obtained (Out of all thre PCM) - " +avgmarks);
System.out.println("Percentage Obtained (Out Of 100) - " +marks);
System.out.println("Total Marks in english, hindi and maths is (Out of 300) - " +(english+hindi+maths));
System.out.println("Passed in the examination (True/False) - " +passed);

}
}