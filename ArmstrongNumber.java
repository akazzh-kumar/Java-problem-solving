import java.util.*;
import java.util.Scanner;
class ArmstrongNumber
{
	public static void main(String[] args)
	{
		Scanner o=new Scanner(System.in);
		int number=o.nextInt();
		int original=number;
		int temp;
		int check=0;
		while(number>0)
		{
		temp=number%10;  			   //370%!0  	0 			37%10   7 		3%10  	1 
		check=check+(temp*temp*temp);  //0+0 		0 			0+343  344 		343+27 	370
		number=number/10;  			   // 370/10 	37  		37/10  3 		3/10    0 condition is false
		}
		if(original==check)
		{
			System.out.println("armstrong number");
		}
		else 
			System.out.println("not armstrong");
	}
}