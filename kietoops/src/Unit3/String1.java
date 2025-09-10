package Unit3;

import java.util.Scanner;

public class String1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(str.substring(0, 4));
        System.out.println(str.length());
        System.out.println(str.toUpperCase());
        String str1 = sc.next();
        String str2 = sc.next();
        if(str1.compareTo(str2) > 0) {
            System.out.println(str1.compareTo(str2));
        } else{
            System.out.println(str1.compareTo(str2));
        }
    }
}
