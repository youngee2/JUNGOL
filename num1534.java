import java.util.Scanner;

public class num1534 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int b = sc.nextInt();
		switch (b) {
		case 2:
			String binaryString = Integer.toBinaryString(n);
			System.out.println(binaryString);
			break;

		case 8:
			System.out.printf("%o", n);
			break;

		case 16:
			System.out.printf("%x".toUpperCase(), n);
			break;
		}
		sc.close();
	}
}
