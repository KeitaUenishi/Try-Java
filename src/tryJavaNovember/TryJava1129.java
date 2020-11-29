package tryJavaNovember;

import java.util.Scanner;

public class TryJava1129 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int strike = 0;
		int ball = 0;

		int count = scanner.nextInt();

		for (int i = 0; i < count; i++) {
			String call = scanner.next();
			if (call.equals("ball")) {
				ball++;
				if (ball >= 4) {
					System.out.println("fourball!");
				} else {
					System.out.println("ball!");
				}
			} else if (call.equals("strike")) {
				strike++;
				if (strike >= 3) {
					System.out.println("out!");
				} else {
					System.out.println("strike!");
				}
			}
		}
		scanner.close();
	}
}