class Strontio{
	public static void main(String[] args) {
		int a=1386;
		int b=a*2;
		int c=b;
		int check=0,temp=0;

		while(b>0){
			temp=b%10;
			check=(check*10)+temp;
			b=b/10;
		}

		if(c==check){
			System.out.println("Strontio Number");
		}
		else 
			System.out.println("Not Strontio");

		


	}
}