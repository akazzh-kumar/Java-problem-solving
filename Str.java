import java.util.Scanner;
class Str{
	//input:a3b4c2
	//output:aaabbbbcc
	public static void main(String[] args) {
		Scanner obj =new Scanner(System.in);
		System.out.println("Enter your String:");
		String str=obj.nextLine();
		for(int i=1;i<str.length();i=i+2){ //3 2 3
			for(int j=0;j<str.charAt(i)-'0';j++){
					System.out.print(str.charAt(i-1));
				}
			}

		}
	}