package tryJava.questionD;

import java.util.Scanner;

public class tryJava_1026_4 {

	public static void main(String[] args) {
		// 入力された文字列を1文字ずつ改行して表示

		Scanner scanner = new Scanner(System.in);
		String line = scanner.next();

		for (int i = 0; i < line.length(); i++) {
			System.out.println(line.charAt(i));
		}
		scanner.close();
	}
}
