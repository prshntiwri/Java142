package Unit3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Iterator1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> products = new ArrayList <>();
        System.out.println("Enter the numbers of products: ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            products.add(sc.next());
        }
        Collections.sort(products);
//        Iterator

//        TO add in collection
        products.add(1, "Apple");
        products.addLast("Banana");
        products.addFirst("Orange");
        System.out.println(products.get(1));

        Iterator it = products.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
