package tryJava.questionD;

import java.util.Scanner;

public class tryJava_1027_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//入力されたnこの文字列をそのまま出力
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		scanner.nextLine();

		for (int i = 0; i < n; i++) {
			System.out.println(scanner.nextLine());
		}

		scanner.close();
	}

}
