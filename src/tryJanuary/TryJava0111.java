package tryJanuary;

import java.util.Scanner;

public class TryJava0111 {

	public static void main(String[] args) {
		//入力された文字から１文字目と２文字目を出力

		Scanner scanner = new Scanner(System.in);
		String string = scanner.next();
		
		System.out.println(string.substring(0, 1) + " " + string.substring(1, 2));
		scanner.close();
	}
}
