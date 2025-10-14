package Unit2.LambdaFunction;

public class ConstuctorReference {
    public static void main(String[] args) {
        Messageable hello = Message::new;
        hello.getMessage("Hi, Prashant Tiwari");
    }
}
