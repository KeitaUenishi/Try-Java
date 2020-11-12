package tryJavaNovember;

import java.util.Scanner;

public class TryJava1111_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		/**
		 *  正整数 n と n 個の整数 a_1, ..., a_n が改行区切りで与えられるので、各 a_i (1 ≤ i ≤ n) が 7 であるか判定し、
		 *  a_1, ..., a_n の中に 7 がひとつでも含まれていた場合には "YES" を、
		 *  そうでない場合（7 がひとつも含まれていなかった場合）には "NO" を出力してください。
		 */
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int count = 0;

		for (int i = 0; i < n; i++) {
			if (scanner.nextInt() == 7) {
				count++;
			}
		}
		if (count >= 1) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		scanner.close();
	}
}
