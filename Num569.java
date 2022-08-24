import java.util.Scanner;

public class Num569 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int arr[][] = new int[5][4];
		int sum[] = new int[5];
		int count = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4; j++) {
				arr[i][j] = sc.nextInt();
				sum[i] += arr[i][j];
			}

		}
		for (int i = 0; i < 5; i++) {
			if (sum[i] / 4 >= 80) {
				System.out.println("pass");
				count++;
			} else {
				System.out.println("fail");
			}
		}
		sc.close();
		System.out.println("Successful : "+count);

	}

}
