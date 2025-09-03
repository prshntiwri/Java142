package Unit3;

import java.util.Iterator;
import java.util.LinkedList;

public class LLfunctions {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("First");
        ll.add("Second");
        ll.add("Third");
        ll.add("Fourth");
        Iterator it = ll.descendingIterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
