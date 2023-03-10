package Day13;

import java.util.Arrays;

public class Anagram {
    static boolean anagram(String st1,String st2){
        char[]a=st1.toCharArray();
        char[]b=st2.toCharArray();
        int n1=a.length;
        int n2=b.length;
        Arrays.sort(a);
        Arrays.sort(b);
        if(n1 != n2)return false;

        for(int i=0;i<n1;i++){
            if(a[i]!=b[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String st1="joy";
        String st2="yoj";
        if(anagram(st1,st2)){
            System.out.println("anagram...");
        }else{
            System.out.println("not anagram...");
        }

    }
}
