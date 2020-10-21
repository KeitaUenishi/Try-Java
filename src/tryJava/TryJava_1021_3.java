package tryJava;

import java.io.IOException;
import java.util.Scanner;

public class TryJava_1021_3 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ

		/*
		 * High and Low
		 * 1枚目を比較し、親の数字が大きければHigh,小さければLowを返す
		 * 1枚目がどちらも同じなら、2枚目を比較する
		 * 2枚目は親の数字が小さければHigh,大きければLowを返す
		 *
		 */

		Scanner scanner = new Scanner(System.in);

		int count = 0;
		int parentNum1 = 0, parentNum2 = 0;
		int childNum1 = 0, childNum2 = 0;

		parentNum1 = scanner.nextInt();
		parentNum2 = scanner.nextInt();
		count = scanner.nextInt();

		int i = 0;

		while (i < count) {

			try {
				childNum1 = scanner.nextInt();
				childNum2 = scanner.nextInt();

				if (parentNum1 > childNum1) {
					System.out.println("High");

				} else if (parentNum1 < childNum1) {
					System.out.println("Low");

				} else {

					if (parentNum2 < childNum2) {
						System.out.println("High");

					} else if (parentNum2 > childNum2) {
						System.out.println("Low");

					}
				}

			} catch (NumberFormatException e) {
				// TODO: handle exception
				System.out.println("数字を入力してください");
				//while文を繰り返す
				continue;
			}
			i++;
		}

		scanner.close();

	}

}
