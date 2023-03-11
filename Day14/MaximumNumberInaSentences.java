package Day14;

public class MaximumNumberInaWord {
    static void getMaxNum(String [] str){
        int max=0;
        for(int i=0;i<str.length;i++){
            max=Math.max(max,(str[i].split(" ")).length);
        }
        
        System.out.println(max);
    }
    public static void main(String[] args) {
        String [] st={"this is a jolly day", "joy is a handsome intelligent boy"};
        getMaxNum(st);
        
    }
}
