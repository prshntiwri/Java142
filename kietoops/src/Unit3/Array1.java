package Unit3;

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
//        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int[] arr = new int[sc.nextInt()];
        System.out.println("Enter elements of array: ");
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
