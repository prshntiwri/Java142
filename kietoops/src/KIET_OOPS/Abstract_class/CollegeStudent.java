package KIET_OOPS.Abstract_class;

public class CollegeStudent extends Student {
    public CollegeStudent(String name, int roll_no) {
        super(name, roll_no);
    }

    public void attend_class(){
        System.out.println(name+" Attend class on smart board");
    }
    public void give_exam(){
        System.out.println(roll_no+" Give exam in online Mode");
    }
}
