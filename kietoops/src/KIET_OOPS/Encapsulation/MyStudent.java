package KIET_OOPS.Encapsulation;

public class MyStudent {
    public static void main(String[] args) {
        Student st = new Student("A", 141, "Rahul");
        System.out.println(st.name);
        System.out.println(st.roll_no);
        System.out.println(st.getGrade());
    }
}
