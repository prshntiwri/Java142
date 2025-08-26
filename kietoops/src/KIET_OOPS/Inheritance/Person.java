package KIET_OOPS.Inheritance;

public class Person {
    private String address;

    public Person(String address){
        this.address = address;
    }

    public  void getAddress(){
        System.out.println("Address is "+address);
    }
}
