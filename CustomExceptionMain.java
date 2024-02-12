public class CustomExceptionMain {
    public static void main (String args[]){
        try{
            throw new CustomExceptionCode("Custom Exception Occured");
        }
        catch (CustomExceptionCode e) { 
            System.out.println("You are Caught");
            System.out.println(e.getMessage());;
        }
    }
}
