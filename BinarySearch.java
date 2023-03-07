class BinarySearch{
	public static void main(String[] args) {
		int key=20;
		int a[]={10,20,30,40,50};
		int low=0;
		int high=a.length-1;
		while(low<=high){
			int middle=(low+high)/2;
			if(a[middle]<key){
				low=middle+1;
			}
			else if(a[middle]==key){
				System.out.println("index is found:"+middle+"\nElement is found:"+a[middle]);
				break;
			}
			else
				high=middle-1;
			
		}
		if(low>high){
				System.out.println("Element is not found");
			}
	}
}