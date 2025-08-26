package KIET_OOPS;

public class Student {
    int roll_no; ///instance variables
    String name;

    public Student(int roll_no, String name) {
        this.roll_no = roll_no;
        this.name = name;
    }
    Student(){
        System.out.println("I am default constructor.");
    }

    Student(Student s){
        roll_no = s.roll_no;
        name=s.name;
    }

    void display(){
        System.out.println("Roll No."+roll_no);
        System.out.println("Name is "+name);


    }
}
