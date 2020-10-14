package tryJava;

import java.util.Scanner;

public class TryJava_1013 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scanner = new Scanner(System.in);
		int count = scanner.nextInt();
		String number;

		for (int i = 0; i < count; i++) {

			number = scanner.next();
			System.out.println(number.length());
		}

	}

}
