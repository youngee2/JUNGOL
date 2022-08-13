import java.util.Scanner;

public class Num549 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		int sum = 0;
		sc.close();
		for (int i = 1; i < n; i++) {
			if (sum >= n) {
				break;
			} else if (i % 2 != 0) {
				count++;
				sum += i;
			}
		}
		System.out.println(count + " " + sum);
	}
}