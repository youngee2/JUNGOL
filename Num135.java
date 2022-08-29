import java.util.Scanner;

public class Num135 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int sum = 0;
		int count = 0;
		if (num1 > num2) {
			for (int i = 0; num1 <= num2; num1++) {

				if (i % 3 == 0 || i % 5 == 0) {
					sum += i;
					count++;
				}
			}
		}

			sc.close();
			System.out.println("sum : " + sum);
			System.out.printf("avg : %.1f", (double) sum / count);
		}
	}

