package KIET_OOPS.Interface;

public interface Printable {
    void print();
    private void my(){
        System.out.println("This is my private method");
    }

    public static  void mystatic(){
        System.out.println("This is my static method");
    }
}
