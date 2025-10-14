package Unit2.LambdaFunction;

public class LambdaDemo1{
    public static void main(String[] args) {
        NumericTest isEven = (n)->(n%2)==0;
        System.out.println(isEven.test(14));
    }
}
