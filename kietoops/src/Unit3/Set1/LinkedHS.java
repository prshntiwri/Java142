package Unit3.Set1;

import java.util.LinkedHashSet;

public class LinkedHS {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>(10);
        lhs.add("One");
        lhs.add("two");
        lhs.add("two");
        lhs.add("three");
        System.out.println(lhs);
    }
}
