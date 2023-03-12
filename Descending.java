import java.util.Scanner;
class Descending {
    public static void main(String[] args) {
        int a[] =new int[] {10,2,7,6,5};
        int temp = 0;
        for(int i=0;i<a.length;i++) {
            for(int j=i+1;j<a.length;j++) {
                if(a[i] < a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("Descending order:");
        for(int i=0;i<a.length;i++) {
            System.out.println(a[i]);
        }
    }
}