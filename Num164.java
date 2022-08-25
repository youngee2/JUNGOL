import java.util.Scanner;

public class Num164 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[][] = new int[4][3];
		int sum[] = new int[4];

		for (int i = 0; i < 4; i++) {
			System.out.print(i + 1 + "class? ");
			for (int j = 0; j < 3; j++) {
				arr[i][j] = sc.nextInt();
				sum[i] += arr[i][j];
			}
		}
		for (int i = 0; i < sum.length; i++) {
			System.out.println(i + 1 + "class : " + sum[i]);
		}
		sc.close();
	}
}