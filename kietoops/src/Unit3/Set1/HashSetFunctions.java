package Unit3.Set1;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetFunctions {
    public static void main(String[] args) {
        HashSet<String> set1 = new HashSet<String>();
        HashSet<String> set2 = new HashSet<String>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements in set1: ");
        int m = sc.nextInt();
        System.out.println("Enter no. of elements in set2: ");
        int n = sc.nextInt();
        System.out.println("Enter elements in set1: ");
        for(int i=0;i<m;i++){
            set1.add(sc.next());
        }
        System.out.println("Enter elements in set2: ");
        for(int i=0;i<n;i++){
            set2.add(sc.next());
        }
//        System.out.println(set1);
//        System.out.println(set2);
//        System.out.println(set1.addAll(set2));
//        set1.remove(set2);
//        System.out.println(set1);
//        set1.removeIf(str->str.contains("aa"));
        set1.remove(set2);
        System.out.println(set1);
    }
}
