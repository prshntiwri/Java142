package KIET_OOPS.Inheritance;

public class SchoolStudent extends Person{
    public String course;

    public SchoolStudent(String address, String course) {
        super(address);
        this.course = course;
    }

    public void getCourse(){
        System.out.println("Course "+course);
    }
}
