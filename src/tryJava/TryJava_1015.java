package tryJava;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryJava_1015 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scanner = new Scanner(System.in);
		int bookSize = 0;
		int shelfWidth = 0;
		int step = 0;

		try {

			bookSize = scanner.nextInt();
			shelfWidth = scanner.nextInt();
			step = scanner.nextInt();

		} catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("数値を入力してください");
			System.out.println(e);
		}

		if (bookSize <= shelfWidth * step) {
			System.out.println("OK");

		} else if (bookSize > shelfWidth * step) {
			System.out.println("NG");
		}
		scanner.close();
	}

}
