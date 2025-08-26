package KIET_OOPS;

public class MyMainA {
//    static {
//        System.out.println("I am in Static"); //it is executed before main
//    }
    public static void main(String[] args) {
//        A a1 = new A();
//        A a2 = new A();
//
//        a1.bread = a1.bread -1;
//        System.out.println(a2.bread);

        B obj = new B();
        obj.display();
        A.display();
    }
}
