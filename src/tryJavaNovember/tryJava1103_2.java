package tryJavaNovember;

import java.util.Scanner;

public class tryJava1103_2 {

	public static void main(String[] args) {

		/**
		 * 1行目に行数を表す整数 n、続く n 行で n 個の「文字」と「整数」の組が空白区切りで入力されます。
		 * n 個の整数だけをそのまま順に出力してください。
		 */

		Scanner scanner = new Scanner(System.in);
		int count = scanner.nextInt();
		scanner.nextLine();

		for (int i = 0; i < count; i++) {
			System.out.println(scanner.nextLine().split(" ")[0]);
		}
		scanner.close();
	}
}
