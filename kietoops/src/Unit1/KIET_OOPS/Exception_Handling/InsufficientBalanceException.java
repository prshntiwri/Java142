package Unit1.KIET_OOPS.Exception_Handling;

public class InsufficientBalanceException  extends RuntimeException{
    public InsufficientBalanceException(String message) {
        super(message);
    }
}
