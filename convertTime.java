import java.util.Scanner;
class convertTime{
	public static void main(String[] args) {
		System.out.println("Enter the Days:");
		Scanner obj =new Scanner(System.in);
		int days = obj.nextInt();
		int n=365;
		int year = days/n;

		int week = (days-(n*3))/7;
		int day =(days-(n*3))-(week*7);
		System.out.println("The number of Year is:"+year);
		System.out.println("The number of Week is:"+week);
		System.out.println("The number of days is:"+day);
				
						

	}
}