package tryJava;

import java.util.Scanner;

public class TryJava_1020_4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scanner = new Scanner(System.in);

		int count = scanner.nextInt();
		int sum = 0;

		for (int i = 0; i < count; i++) {

			int num = scanner.nextInt();

			if (num >= 5) {
				sum = num + sum;
			}

		}
		System.out.println(sum);
		scanner.close();

	}

}
