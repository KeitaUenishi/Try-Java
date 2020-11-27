package tryJavaNovember;

import java.util.Scanner;

public class TryJava1127_1 {

	public static void main(String[] args) {

		/**
		 * 11/27 解けず 後日再挑戦
		 *
		 * 5行5列の五目並べの盤面が与えられます。
		 * 盤面の各マスには、"O"か"X"か"."が書かれています。
		 * "O"と"X"は、それぞれプレイヤーの記号を表します。
		 * 同じ記号が縦か横か斜めに連続で5つ並んでいれば、その記号のプレイヤーが勝者となります。
		 * 勝者の記号を1行で表示してください。
		 * 勝者がいない場合は、引き分けとして、"D"を表示してください。
		 */

		Scanner scanner = new Scanner(System.in);
		String[][] board = new String[5][5];
		String result = "D";

		for (int i = 0; i < 5; i++) {
			board[i] = scanner.next().split("");
			//横の判定
			String diaSide = judgement(diagSide(board));
			if (!diaSide.equals("D")) {
				result = diaSide;
			}
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

		// 縦の判定
		String diaVer = judgement(diagVer(board));
		if (!diaVer.equals("D")) {
			result = diaVer;
		}

		System.out.println(result);
		scanner.close();
	}

	// ／方向の対角線の並びをStringで返すメソッド
	static String diagRightUp(String[][] board) {
		String line = "";

		for (int i = 0; i < 5; i++) {
			line += board[i][-(i - 4)];
			//System.out.println(board[i][-1 * (i - 4)]);
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

	// 縦方向の並びをStringで返すメソッド
	static String diagVer(String[][] board) {
		String line = "";
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < board[0].length; j++) {
				line += board[j][i];
			}
		}
		return line;
	}

	// 横方向の並びをStringで返すメソッド
	static String diagSide(String[][] board) {
		String line = "";
		line += board;
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
