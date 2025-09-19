package Unit3;

public class Students implements Comparable<Students>{
    int age;
    String name;
    int r_no;

    public Students(String name, int age, int r_no) {
        this.age = age;
        this.name = name;
        this.r_no = r_no;
    }
    public int compareTo(Students st){
        if(age==st.age)return 0;
        else if(age>st.age)return 1;
        else return -1;
    }
}
