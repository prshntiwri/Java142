package Unit3.Queue1;
import java.util.*;
public class ArrayDeque1 {
    public static void main(String[] args) {
        ArrayDeque<String> adq= new ArrayDeque<>();
        adq.add("1st");
        adq.addFirst("0");
        adq.addLast("2nd");
        System.out.println(adq);
        System.out.println(adq.offerFirst("-1"));
        System.out.println(adq.offerLast("3"));
        System.out.println(adq);
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());
    }
}
