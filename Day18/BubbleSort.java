package Day18;

public class BubbleSort {
    static void sort(int a[]){
        int n=a.length;
        for(int i=0;i<n-1;i++){
            for(int j=j=0;j<n-1-i;j++){
                if(a[j]>a[j+1]){
                int swap=a[j];
                a[j]=a[j+1];
                a[j+1]=swap;

                }
            }
        }
        for(int val:a){
            System.out.print(val+" ");
        }
    }
    public static void main(String[] args) {
        int a[]={50,40,30,20,10};
        sort(a);
    }
}
