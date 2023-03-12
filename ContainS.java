import java.util.Scanner;
class ContainS{
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the first string:");
		String str1=obj.nextLine();
		System.out.println("Enter the second string:");
		String str2=obj.nextLine();
		str1=str1.replaceAll(" ","");
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		if(str1.equals(str2)){
			System.out.println("The two Strings are equal");
		}
		else
			System.out.println("The Strings are not equal");



	}
}