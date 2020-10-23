package tryJava;

import java.util.Scanner;

public class TryJava_1014 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scanner = new Scanner(System.in);
		int point = scanner.nextInt();

		if (80 <= point && point <= 100) {
			System.out.println("pass");

		} else if (0 <= point && point < 80) {
			System.out.println("fail");

		} else {
			System.out.println("0～100の数値を入力してください");
		}
		scanner.close();

	}

}
