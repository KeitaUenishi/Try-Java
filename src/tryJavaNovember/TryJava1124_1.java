package tryJavaNovember;

import java.util.Scanner;

public class TryJava1124_1 {

	public static void main(String[] args) {

		/**
		 * 二次元配列練習
		 */

		Scanner scanner = new Scanner(System.in);
		String[][] board = new String[5][5];
		String result = "D";

		for (int i = 0; i < 5; i++) {
			board[i] = scanner.next().split("");
		}

		for (int i = 0; i < 5; i++) {
			String line = "";
			for (int j = 0; j < board[0].length; j++) {
				line += board[j][i];
				System.out.println(board[j][i]);
			}
			System.out.println(line);
		}
	}

}
