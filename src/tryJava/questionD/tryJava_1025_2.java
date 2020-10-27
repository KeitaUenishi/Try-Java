package tryJava.questionD;

import java.util.Scanner;

public class tryJava_1025_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scanner = new Scanner(System.in);

		int start = scanner.nextInt() - 1;
		int end = scanner.nextInt();
		scanner.nextLine();

		String line = scanner.nextLine();

		line = line.substring(0, start) + line.substring(start, end).toUpperCase() + line.substring(end);

		System.out.println(line);

		scanner.close();

	}

}
