class LinearSearch{
	public static void main(String[] args) {
		int a[]={10,20,30,40,50};
		int key=50;
		int i=0;
		while(i<a.length){
			if(key==a[i]){
				System.out.println("Element is found:"+i);
				break;
			}
			i++;
		}
		if(i==a.length){
			System.out.println("Element is not found");
		}

	}
}