package Unit2;

public class ThreadMethods {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
//        t1.start();
//        System.out.println(t1.getName());
//        t1.setName("KIET Thread");
//        System.out.println(t1.getName());
        t1.setPriority(5);
        System.out.println(t1.getPriority());
    }
}
