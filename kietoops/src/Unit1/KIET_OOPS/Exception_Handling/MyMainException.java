package Unit1.KIET_OOPS.Exception_Handling;

public class MyMainException {
    public static void main(String[] args) {
        UserDefinedException obj = new UserDefinedException();
        try {
            obj.validation(19);
        }
        catch (InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }
}
