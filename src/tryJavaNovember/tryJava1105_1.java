package tryJavaNovember;

import java.util.Scanner;

public class tryJava1105_1 {

	public static void main(String[] args) {

		/**
		 *3つの文字列が3行で入力されるので、入力された文字列をそのまま1行ずつ出力してください。
		 */

		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			System.out.println(sc.next());

		}
		sc.close();
	}
}