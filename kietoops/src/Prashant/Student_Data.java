package Prashant;

class Student_Data {
    public static void main(String[] args) {

        Student[] students = new Student[5];


        Student student1 = new Student(45,"Prashant",92.2f);
        Student student2 = new Student(13,"Prathvi",94.2f);
//        student1.rno = 14;
//        student1.name = "Rahul";
//        student1.marks = 92.3f;

        System.out.println(student1.name);
        System.out.println(student2.name);
        System.out.println(student1.marks);
//        System.out.println(Arrays.toString(students));

    }
}

//class Prashant.Student{
//    int rno;
//    String name;
//    float marks;
//
//    Prashant.Student(int roll, String naam, float mark){
//        rno = roll;
//         name = naam;
//         marks = mark;
//    }
//}
