package tryJavaNovember;

import java.util.Scanner;

public class TryJava1112_4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		/**
		 *  1行5列の五目並べの盤面が与えられます。
			盤面の各マスには、"O"か"X"か"."が書かれています。
			"O"と"X"は、それぞれプレイヤーの記号を表します。
			同じ記号が横に連続で5つ並んでいれば、その記号のプレイヤーが勝者となります。
			勝者の記号を1行で表示してください。
			勝者がいない場合は、引き分けとして、"D"を表示してください。
		 */

		Scanner scanner = new Scanner(System.in);

		String s = scanner.nextLine();
		if (s.equals("OOOOO")) {
			System.out.println("O");
		} else if (s.equals("XXXXX")) {
			System.out.println("X");
		} else {
			System.out.println("D");
		}
		scanner.close();
	}
}