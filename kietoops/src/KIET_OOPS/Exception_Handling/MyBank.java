package KIET_OOPS.Exception_Handling;

public class MyBank {
    public static void main(String[] args) {
        Bank obj = new Bank();
        try {
            obj.withdraw(1000000);
        }
        catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}
