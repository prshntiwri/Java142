package KIET_OOPS.Exception_Handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyException {
    public static void main(String[] args) {
        int x,y,z = 0;
        Scanner sc = new Scanner(System.in);
        try {
            x = sc.nextInt();
            y = sc.nextInt();
            z = x / y;
            System.out.println("Exception not occurs");
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch(InputMismatchException e){
            System.out.println(e.getMessage());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Result is "+z);
        }
    }
}
