package tryJavaNovember;

import java.util.Scanner;

public class tryJava1109_4 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int y = scanner.nextInt();

		if (y % 4 == 0 && y % 400 == 0) {
			System.out.println("Yes");
		} else if (y % 100 == 0) {
			System.out.println("No");
		} else {
			System.out.println("No");
		}
		scanner.close();
	}
}