package Unit3;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(12);
        arr.add(13);
        arr.add(34);
        arr.add(54);
        System.out.println(arr);
        for(int i:arr){
            System.out.print(i);
        }
    }
}
