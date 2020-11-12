package tryJavaNovember;

import java.util.Scanner;

public class TryJava1111_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		/**
		 *  m 個の文字 c_1, ..., c_m と、 n 個の文字列 S_1, ..., S_n が与えられます。
			各 c_i （1 ≤ i ≤ m） について、各 S_j （1 ≤ j ≤ n） に c_i が出現するかをそれぞれ調べ、
			出現する場合は "YES" を、そうでない場合には "NO" を、そのつど出力してください。
		 */
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		String[] c = new String[m];

		for (int i = 0; i < m; i++) {
			c[i] = scanner.next();
		}

		int n = scanner.nextInt();
		String[] s = new String[n];

		for (int i = 0; i < n; i++) {
			s[i] = scanner.next();
		}

		// m回のループ
		for (int i = 0; i < m; i++) {

			// mループの中で、先にn回ループする
			for (int j = 0; j < n; j++) {
				if (s[j].contains(c[i])) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
			}
		}
		scanner.close();
	}
}
