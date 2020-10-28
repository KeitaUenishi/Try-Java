package tryJava.questionD;

import java.util.Scanner;

public class tryJava_1028_1 {

	public static void main(String[] args) {
		// 入力されるアルファベット小文字を大文字にして出力

		Scanner scanner = new Scanner(System.in);
		System.out.println(scanner.next().toUpperCase());

		scanner.close();
	}
}
