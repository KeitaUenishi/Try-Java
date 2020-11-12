package tryJavaNovember;

import java.util.Scanner;

public class TryJava1111_1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		/**
		 *  正整数 n と、 n 個の整数 a_1, ..., a_n が半角スペース区切りで与えられます。
			与えられた整数の中に 3 の倍数がいくつあるかを数え、出力してください。
		 */
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int count = 0;

		for (int i = 0; i < n; i++) {
			if (scanner.nextInt() % 3 == 0) {
				count++;
			}
		}
		System.out.println(count);
	}
}
