package tryJava;

import java.util.Scanner;

public class TryJava_1012 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scanner = new Scanner(System.in);
		int person = scanner.nextInt();
		int vertical = scanner.nextInt();
		int horizontal = scanner.nextInt();

		int sweetsBox = vertical * horizontal;

		int remainder = sweetsBox % person;

		System.out.println(remainder);

		scanner.close();
	}
}
