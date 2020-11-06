package tryJavaNovember;

import java.util.Scanner;

public class tryJava1102_2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		if (n >= 5) {
			System.out.println("high");
		} else {
			System.out.println("low");
		}
		scanner.close();
	}
}
