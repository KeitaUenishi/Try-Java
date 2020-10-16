package tryJava;

import java.util.Scanner;

public class TryJava_1016 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scanner = new Scanner(System.in);
		int count = scanner.nextInt();

		for (int i = 0; i < count; i++) {

			int answer = isPerfectNumber(scanner.nextInt());

			if (answer == 1) {
				System.out.println("perfect");
			} else if (answer == 2) {
				System.out.println("nearly");
			} else {
				System.out.println("neither");
			}

		}

		scanner.close();
	}

	static int isPerfectNumber(int num) {
		int sum = 0;

		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0) {
				sum += i;
			}
		}

		if (num == sum) {
			return 1;
		} else if (num == sum - 1) {
			return 2;
		} else if (num == sum + 1) {
			return 2;
		} else {
			return 3;
		}
	}

}
