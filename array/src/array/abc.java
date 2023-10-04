package array;
class abc {
	static void min(int arr[]) {
		int min=arr[0],c=0;
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]<min)
				min=arr[i];
		}
		System.out.println("the minimum value is:");
		System.out.println(min);
	}
	public static void main(String args[]) {
		int a[]= {10,20,13,8,30};
		 min(a);
	}
}