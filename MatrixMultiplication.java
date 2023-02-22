import java.util.Scanner;
class MatrixMultiplication{
	public static void main(String[] args) {
		int a[][] =new int[2][2];
		int b[][] = new int[2][2];
		Scanner obj =new Scanner(System.in);
		for(int i=0;i<=2;i++) {
			for(int j=0;j<=2;j++) {
				a[i] = obj.nextInt();
				a[j] = obj.nextInt();
			}
		}
		for(int i=0;i<=2;i++) {
			for(int j=0;j<=2;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

	}
}