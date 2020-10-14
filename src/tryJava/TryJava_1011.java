package tryJava;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryJava_1011 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scanner = new Scanner(System.in);
		int afterWeek = 0;

		try {
			afterWeek = scanner.nextInt();

		} catch (InputMismatchException e) {
			// TODO: 数値以外が入力されたとき
			System.out.println("正しい数値を入力してください");
			System.out.println(e);
		}

		int afterDay = afterWeek * 7;

		System.out.println(afterDay);

		scanner.close();

	}

}
