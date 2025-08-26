package KIET_OOPS;

public class MyMain {
    public static void main(String[] args) {
        Student s1 = new Student(14,"Prathvi");
        Student s2 = new Student(s1);
//        s1.roll_no = 14;
//        s1.name = "Rahul";

        s1.display();
        s2.display();

    }
}
