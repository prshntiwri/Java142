package Unit3;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting2 {
    public static void main(String[] args) {
        ArrayList<Students> al = new ArrayList<>();
        al.add(new Students("Prashant", 20, 18));
        al.add(new Students("Deepak", 10, 45));
        al.add(new Students("Devkesh", 40, 89));
        al.add(new Students("Jjdn", 160, 88));
        al.add(new Students("JNjkn", 130, 87));
        al.add(new Students("Kankenfierl", 90, 62));
        Collections.sort(al); // sort according to age
        for(Students s: al){
            System.out.println(s.name + " " + s.age  + " " + s.r_no + " ");
        }
    }
}
