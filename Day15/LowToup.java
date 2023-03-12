package Day15;

public class LowToup {
    static void lowtoup(String str){
        char st[]=str.toCharArray();
        for(int i=0;i<st.length;i++){
            char ch=st[i];
            if(ch >='a' && ch<='z'){
                char chans=(char)(ch+'A'-'a');
                st[i]=chans;
            }
        }
        for(char val:st){
            System.out.print(val);
        }

    }
    public static void main(String[] args) {
        String str="saTHi";
        lowtoup(str);
    }
}
