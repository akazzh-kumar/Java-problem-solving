import java.util.Arrays;
import java.util.Scanner;
class Anagram{
	public static void main(String[] args) {
		Scanner obj =new Scanner(System.in);
		System.out.println("Enter the 1st String:");
		String a = obj.nextLine();
		System.out.println("Enter the 2nd String");
		String b = obj.nextLine();
		a=a.toLowerCase();
		b=b.toLowerCase();
		a=a.replaceAll(" ","");
		b=b.replaceAll(" ","");
		if(a.length()!=b.length()){
			System.out.println("This is not Equal. So It is not Anagram");
		}
		else 
			{
				char[] String1 = a.toCharArray();
				char[] String2 = b.toCharArray();
				Arrays.sort(String1);
				Arrays.sort(String2);
				if(Arrays.equals(String1,String2)==true){
					System.out.println("It is a Anagram");
				}
					else 
						System.out.println("Not Anagram");
				
			}
	}
}
