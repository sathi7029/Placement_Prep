package Day11;

public class ReverseStringUsingArray {
    public static void reverseString(String s){
        char ch[]=s.toCharArray();
        //String rev="";
        int n=ch.length;
        for(int i=n;i>0;i--){
            System.out.print(ch[i-1]);
        }
    }
    public static void main(String[] args) {
        String st="yoj";
        reverseString(st);
    }
}
