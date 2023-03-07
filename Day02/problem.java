// print the first character of every word
package Day2;

public class problem {
    public static void main(String[] args) {
        String s="hello world  joy";
        char a[]=s.toCharArray();

        for(int i=0;i<a.length;i++){
          if(a[i]!=' ' &&(i==0 || a[i-1]==' ')){
            System.out.println(a[i]);
          }
        }
    }
}
