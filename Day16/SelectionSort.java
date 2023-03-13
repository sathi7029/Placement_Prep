package Day16;

public class SelectionSort {
    static void sort(int a[]){
        int n=a.length;
        for(int i=0;i<n-1;i++){
            int minv=a[i];
            int mini=i;
            for(int j=i+1;j<n;j++){
                if(minv>a[j]){
                    minv=a[j];
                    mini=j;
                }
            }
            int swap=a[i];
            a[i]=a[mini];
            a[mini]=swap;
        }
        for(int val:a){
            System.out.print(val+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={2,8,4,-1,7,10,5,6};
        sort(arr);
    }
}
