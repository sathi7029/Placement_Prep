package Day08;
import java.util.ArrayList;
public class RemoveEven{
    public static void removeEven(ArrayList<Integer>a){
        for(int i=a.size()-1;i>=0;i--){
            if(a.get(i)%2==0){
                a.remove(i);
            }
        }
        
    }
    public static void main(String[] args) {
        ArrayList<Integer>al=new ArrayList<>();
        al.add(5);
        al.add(10);
        al.add(4);
        al.add(15);
        al.add(8);
        al.add(21);
        al.add(3);
        al.add(2);
        System.out.println(al);
        System.out.println();
        removeEven(al);
        System.out.println(al);
    }
}
