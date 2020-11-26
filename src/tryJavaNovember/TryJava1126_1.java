package tryJavaNovember;

import java.util.Scanner;

public class TryJava1126_1 {

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

		// ／の判定
		String diagR = judgement(diagRightUp(board));
		if (!diagR.equals("D")) {
			result = diagR;
		}

		// ／の判定
		String diagL = judgement(diagLeftUp(board));
		if (!diagL.equals("D")) {
			result = diagL;
		}

		System.out.println(result);
		scanner.close();
	}

	// ／方向の対角線の並びをStringで返すメソッド
	static String diagRightUp(String[][] board) {
		String line = "";

		for (int i = 0; i < 5; i++) {
			line += board[i][-(i - 4)];
			System.out.println(board[i][-1 * (i - 4)]);
		}
		return line;
	}

	// ＼方向の対角線の並びをStringで返すメソッド
	static String diagLeftUp(String[][] board) {
		String line = "";

		for (int i = 0; i < 5; i++) {
			line += board[i][i];
		}
		return line;
	}

	// 引数に与えられた並びの勝者を"O", "X", "D" で返すメソッド
	static String judgement(String line) {
		if (line.equals("OOOOO")) {
			return "O";
		} else if (line.equals("XXXXX")) {
			return "X";
		}
		return "D";
	}
}
