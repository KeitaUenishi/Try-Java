package tryJava.questionD;

import java.util.Scanner;

public class tryJava_1028_2 {

	public static void main(String[] args) {
		// 入力される start と end の間の全ての整数を順に表示

		Scanner scanner = new Scanner(System.in);

		int start = scanner.nextInt();
		int end = scanner.nextInt();

		while (start <= end) {
			System.out.println(start);
			start++;
		}
		scanner.close();
	}
}
