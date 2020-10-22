package tryJava.questionD;

import java.util.Scanner;

public class tryJava_1022_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scanner = new Scanner(System.in);

		int sum = 0;

		while (scanner.hasNext()) {
			sum += scanner.nextInt();
		}

		System.out.println(sum);

		scanner.close();

	}

}
