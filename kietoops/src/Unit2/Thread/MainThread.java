package Unit2.Thread;

public class MainThread {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        t1.setPriority(Thread.MIN_PRIORITY); //1
        t1.start(); // to run the code in run
        Thread2 t2 = new Thread2();
        t2.setPriority(Thread.MAX_PRIORITY); // 10
        t2.setPriority(Thread.NORM_PRIORITY); // 5
    }
}