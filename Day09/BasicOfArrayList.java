package Day09;

import java.util.ArrayList;

public class BasicOfArrayList {
    public static void main(String[] args) {
        ArrayList<Integer>al=new ArrayList<>();
        //add
        al.add(10);
        al.add(100);
        al.add(30);
        al.add(40);
        al.add(50);
        System.out.println(al);
        //get
        System.out.println(al.get(1));
        System.out.println();
        //set
        al.set(1,20);
        System.out.println(al);
        System.out.println();
        //remove
        al.remove(4);
        System.out.println(al);

    }
}
