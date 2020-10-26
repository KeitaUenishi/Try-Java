package tryJava.questionD;

import java.util.Scanner;

public class tryJava_1026_5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scanner = new Scanner(System.in);
		char word = scanner.next().charAt(0);
		String line = scanner.next();
		int count = 0;

		for (int i = 0; i < line.length(); i++) {
			if (line.charAt(i) == word) {
				count++;
			}
		}
		System.out.println(count);
		scanner.close();
	}

}
