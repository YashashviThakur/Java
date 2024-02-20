
public class TeatArrayCopy {
    public static void main(String[] args) {  
        char[] copyFrom = { 'd', 'e', 'j','a','v','a'};  
        char[] copyTo = new char[4];  
        System.arraycopy(copyFrom, 2, copyTo, 0, 4);  
        System.out.println("The Copied value is - "+String.valueOf(copyTo));  
    }  
}
