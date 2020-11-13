package tryJavaNovember;

import java.util.Scanner;

public class TryJava1113_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		/**
		 *  5行5列の五目並べの盤面が与えられます。
			盤面の各マスには、"O"か"X"か"."が書かれています。
			"O"と"X"は、それぞれプレイヤーの記号を表します。
			同じ記号が縦に連続で5つ並んでいれば、その記号のプレイヤーが勝者となります。
			勝者の記号を1行で表示してください。
			勝者がいない場合は、引き分けとして、"D"を表示してください。
		 */

		Scanner scanner = new Scanner(System.in);
		String[][] board = new String[5][5];
		String result = "D";

		for (int i = 0; i < 5; i++) {
			board[i] = scanner.next().split("");
		}

		for (int i = 0; i < 5; i++) {
			String line = "";
			for (int j = 0; j < 5; j++) {
				line += board[j][i];
			}

			if (line.equals("OOOOO")) {
				result = "O";
			} else if (line.equals("XXXXX")) {
				result = "X";
			}
		}

		System.out.println(result);
		scanner.close();
	}
}