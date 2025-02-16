import java.util.Arrays;
import java.util.Scanner;

class QuickSort {

	void quickSort (int arr[], int low, int high) {
		if (low < high) {
			int pivot = partition(arr, low, high);

			quickSort (arr, low, pivot - 1);
			quickSort (arr, pivot + 1, high);

		}

	}

	int partition (int arr[], int low, int high) {

		int pivot = arr[high];

		int i = low - 1;

		for (int j = low; j < high; j++) {
			if (arr[j] < pivot) {
				i++;

				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;

			}

		}
		int temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;

		return i+1;

	}


	public static void main(String[] args) {
		
		QuickSort obj = new QuickSort();
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the Size: ");
		int n = scan.nextInt();
		int[] arr = new int[n];

		System.out.println("Enter the values: ");
		for (int i = 0; i < n; i++) {
			 arr[i] = scan.nextInt();

		}

		System.out.println("Your order:");

		System.out.println(Arrays.toString(arr));

		obj.quickSort(arr, 0, arr.length-1);

		System.out.println("Sorted order: ");

		System.out.println(Arrays.toString(arr));


	}
}