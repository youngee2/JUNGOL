import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Num187 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n;

		List<Character> list = new ArrayList<Character>();
		for (int i = 0; i < s.length(); i++) {
			list.add(s.charAt(i));
		}

		while (true) {
			n = sc.nextInt();
			if (n > list.size()) {
				list.remove(list.size() - 1);
			} else {
				list.remove(n - 1);
			}
			for (int i = 0; i < list.size(); i++) {
				System.out.print(list.get(i));
			}
			System.out.println();
			if (list.size() == 1) {
				break;
			}
		}
		sc.close();
	}
}