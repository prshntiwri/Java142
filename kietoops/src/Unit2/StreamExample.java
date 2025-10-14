package Unit2;
import java.util.*;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        List<StreamProduct> products = new ArrayList<>();
        products.add(new StreamProduct(1, "HP1", 1200000));
        products.add(new StreamProduct(2, "HP2", 1600000));
        products.add(new StreamProduct(3, "HP3", 1500000));
        products.add(new StreamProduct(4, "HP4", 1800000));
        products.add(new StreamProduct(5, "HP5", 1900000));
        products.add(new StreamProduct(6, "HP6", 1100000));
        List<Double> newlist = products.stream().filter(p->p.price>1200000).map(p->p.price).collect(Collectors.toList());
        System.out.println(newlist);
    }
}
