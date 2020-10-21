package tryJava;

import java.io.IOException;
import java.util.Scanner;

public class TryJava_1021_2 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ

		//Scanner使用してみた例

		Scanner scanner = new Scanner(System.in);

		int count = 0;
		int sum = 0, num1 = 0, num2 = 0;

		while (true) {

			try {
				count = scanner.nextInt();

			} catch (NumberFormatException e) {
				// TODO: handle exception
				System.out.println("数字を入力してください");
				//while文を繰り返す
				continue;
			}
			break;
		}

		for (int i = 0; i < count; i++) {
			num1 = scanner.nextInt();
			num2 = scanner.nextInt();

			if (num1 == num2) {
				//入力された数値が同じ場合、掛ける
				sum = sum + num1 * num2;
			} else {
				sum = sum + num1 + num2;
			}
		}

		System.out.println(sum);
		scanner.close();

	}

}
