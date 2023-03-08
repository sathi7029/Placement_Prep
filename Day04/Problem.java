package Day04;
public class Problem{
    static int element_sum(int a[]){
        int n=a.length;
        int sum=0;
        for(int i=0;i<n;i++){
                sum+=a[i];
        }
        return sum;

    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int sum=element_sum(a);
        System.out.println("sum is:"+sum);
    }
}