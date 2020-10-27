package tryJava.questionD;

import java.util.Scanner;

public class tryJava_1027_1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scanner = new Scanner(System.in);

		int list[] = { 4, 0, 5, -1, 3, 10, 6, -8 };
		int count = 0;

		for (int i = 0; i < list.length; i++) {
			if (list[i] >= 5) {
				count += list[i];
			}
		}
		System.out.println(count);

		scanner.close();
	}

}
