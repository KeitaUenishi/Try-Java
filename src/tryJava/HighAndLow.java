package tryJava;

import java.util.Scanner;

public class HighAndLow {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		System.out.println("＊＊＊＊＊＊＊＊＊");
		System.out.println("＊ High & Low ＊");
		System.out.println("＊＊＊＊＊＊＊＊＊");
		System.out.println();

		while (true) {//条件式がtrueなので常に条件を満たす

			int leftcard = (int) (Math.random() * 9) + 1;//ランダムに1～9までを生成
			int rightcard = (int) (Math.random() * 9) + 1;

			System.out.println("　　　　[問題表示]　　　　");

			System.out.println("＊＊＊＊　　＊＊＊＊");
			System.out.println("＊　　　＊　　＊＊＊＊");
			System.out.println("＊　" + leftcard + "　＊　　＊＊＊＊");
			System.out.println("＊　　　＊　　＊＊＊＊");
			System.out.println("＊＊＊＊　　＊＊＊＊");

			//Scannerをシステムに適応させるための準備
			Scanner sc = new Scanner(System.in);
			System.out.print("High　or　Low　?(h/l)>");
			String select = sc.nextLine();

			if (select.equals("h")) {
				System.out.println("Highを選択しました。");
			} else {
				System.out.println("Lowを選択しました。");
			}
			System.out.println();
			System.out.println();

			System.out.println("　　　　[結果表示]　　　　");

			System.out.println("＊＊＊＊　　＊＊＊＊");
			System.out.println("＊　　　＊　　＊　　　＊");
			System.out.println("＊　" + leftcard + "　＊　　＊　" + rightcard + "　＊");
			System.out.println("＊　　　＊　　＊　　　＊");
			System.out.println("＊＊＊＊　　＊＊＊＊");

			String result;//表示結果の変数result

			if (leftcard < rightcard) {
				result = "h";
			} else if (leftcard > rightcard) {
				result = "l";
			} else {
				result = select;
			}

			if (select.equals(result)) {//equalsメソッドにより文字列同士を比較
				System.out.println("　→You Win!");

				System.out.println();
				System.out.println();
			} else {
				System.out.println("　You Lose...");
				break;//ループの終了
			}
			System.out.println();

		}
		System.out.println();
		System.out.println("　　　　ゲーム終了　　　　");

	}
}
