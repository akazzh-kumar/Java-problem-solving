import java.util.Arrays;
class Anagram{
	public static void main(String[] args) {
		String a ="Akashu";
		String b ="Kaashu";
		a=a.toLowerCase();
		b=b.toLowerCase();
		a=a.replaceAll(" ","");
		b=b.replaceAll(" ","");
		if(a.length()!=b.length()){
			System.out.println("It is not Anagram");
		}
		else 
			{
				char[] String1 = a.toCharArray();
				char[] String2 = b.toCharArray();
				Arrays.sort(String1);
				Arrays.sort(String2);
				if(Arrays.equals(String1,String2)==true){
					System.out.println("Anagram");
				}
					else 
						System.out.println("Not Anagram");
				
			}
	}
}