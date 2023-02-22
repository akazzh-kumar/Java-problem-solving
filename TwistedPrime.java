import java.util.Scanner;

class TwistedPrime {
	static boolean isPrime(int n) {
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	static int revNum(int num) {
		int rev=0;
		while(num>0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		return rev;
	}
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int no = ip.nextInt();
		if(isPrime(no) && isPrime(revNum(no))) 
			System.out.println("TwistedPrime");
		else 
			System.out.println("Not A TwistedPrime");

	}
}