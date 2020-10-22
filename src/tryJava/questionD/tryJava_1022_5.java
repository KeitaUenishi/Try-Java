package tryJava.questionD;

import java.util.Scanner;

public class tryJava_1022_5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

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
