package KIET_OOPS.Inheritance;

public class MyPerson {
    public static void main(String[] args) {
        Person p = new Person("Delhi");
        p.getAddress();

        SchoolStudent st = new SchoolStudent("Delhi", "B.Tech");
        st.getAddress();
        st.getCourse();


    }
}
