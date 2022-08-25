import java.util.Scanner;

public class Num162 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ar[] = new int[10];
		int arr[] = new int[10];

		for (int i = 0; i < 2; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 2; i < 10; i++) {
			arr[i] = arr[i - 1] + arr[i - 2];
		}

		for (int i = 0; i < 10; i++) {
			ar[i] = arr[i] % 10;
			if (ar[i] >= 100) {
				ar[i] = arr[i] % 10;
			}
			System.out.printf("%d ", ar[i]);
		}
		sc.close();
	}
}