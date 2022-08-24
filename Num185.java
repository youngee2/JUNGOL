import java.util.Scanner;

public class Num185 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String n = sc.next();

		if (s.contains(n)) {
			System.out.println(s.indexOf(n));
		} else {
			System.out.println("No");
		}
		sc.close();
	}
}
