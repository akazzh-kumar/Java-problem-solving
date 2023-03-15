import java.util.Scanner;
class StringAlphabetCount{
	public static void main(String[] args) {
		//Without using Replaceall Method
		System.out.println("Enter your String:");
		Scanner obj = new Scanner(System.in);
		int count=0;
		String s1= obj.nextLine();
		char[] ch=s1.toCharArray();
		String s2="";
		for(int i=0;i<ch.length;i++){
			if(ch[i]!=' '){
				s2=s2+ch[i];
			}
		}

		for(int i=0;i<s2.length();i++){
			if(s2.charAt(i)>='a'){
				if(s2.charAt(i)<='z')
				{
					count++;
				}
			}
			else if(s2.charAt(i)>='A'){
				if(s1.charAt(i)<='Z')
				count++;
			}
		}
		if(count==s2.length()){
			System.out.println("It contains only alphabet");
		}
		else
			System.out.println("It contains not only alphabet");


		



	}
}