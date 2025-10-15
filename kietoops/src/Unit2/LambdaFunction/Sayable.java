package Unit2.LambdaFunction;
public interface Sayable {
    void say();
    //static method
    static void sum(int x, int y) {
        System.out.println(x+y);
    }

    default void sayMore(){
        System.out.println("Hi User, I am from default method");
    }
}
