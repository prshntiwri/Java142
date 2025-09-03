package Unit3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MatrixAdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr= new int[2][3];
        int[][] brr = new int[2][3];
        System.out.print("Input in first array: ");
        for(int i=0;i<arr.length; i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.print("Input in second array: ");
        for(int i=0;i<brr.length; i++){
            for(int j=0;j<brr[i].length;j++){
                brr[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<brr[i].length;j++){
                arr[i][j] = arr[i][j] + brr[i][j];
            }
        }
        System.out.println("Matrix Addition is : ");
        for(int i=0;i<arr.length; i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
        }
    }
}
