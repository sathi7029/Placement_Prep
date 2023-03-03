//find the max element 

class Problem{

static int get_max(int a[]){

	int n=a.length;
	int max=a[0];
	for(int i=0;i<n;i++)	
	{
		if(a[i]>max)
		{
			max=a[i];
		}
	}
	return max;
}

public static void main(String s[]){

	int a[]={100,30,500,80,69,83};
	int largest_ele=get_max(a);
	System.out.println(largest_ele);

}

}