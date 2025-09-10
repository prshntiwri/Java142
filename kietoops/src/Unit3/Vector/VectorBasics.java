package Unit3.Vector;

import java.util.Stack;
import java.util.Vector;

public class VectorBasics {
    public static void main(String[] args) {
        Vector<String> v = new  Vector<String>(3, 5);
//        To make stack

        v.add("First");
        v.add("Second");
        v.add("Third");
        v.add("Fourth");
        System.out.println(v.capacity()); // capacity will increment as intialcapacity + capacityincrement
        System.out.println(v.size());
    }
}
