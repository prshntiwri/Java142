package Unit3.MAP;

import java.util.HashMap;
import java.util.Scanner;

public class HashMap1 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        for (int i=0; i<n; i++){
            System.out.print("Enter key: ");
            String str = sc.next();
            System.out.print("Enter value: ");
            int value =  sc.nextInt();
            map.put(str, value);
        }
        System.out.println("Key and Values in HashMap is: ");
        for(String k: map.keySet()){
            System.out.println(k + " : " + map.get(k));
        }
    }
}
