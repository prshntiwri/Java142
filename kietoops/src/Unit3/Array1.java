package Unit3;

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
    }
}
