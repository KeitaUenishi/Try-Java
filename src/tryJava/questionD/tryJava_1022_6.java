package tryJava.questionD;

import java.util.Scanner;

public class tryJava_1022_6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scanner = new Scanner(System.in);

		int start = scanner.nextInt();
		int end = scanner.nextInt();
		scanner.nextLine();
		String line = scanner.nextLine();

		//Whileでなく、substringでも可
		//System.out.println(string.substring(start - 1, end));

		while (start <= end) {
			System.out.print(line.charAt(start - 1));
			start++;
		}

		scanner.close();

	}

}
