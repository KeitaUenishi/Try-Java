package tryJavaDecember;

import java.util.Scanner;

public class TryJava1209 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// Bランク問題挑戦 リベンジ

		Scanner scanner = new Scanner(System.in);

		// 置換回数
		int count = scanner.nextInt();
		// 入力される文字列
		String str = scanner.nextLine();
		// 変換する暗号文
		String angou = scanner.next();

		// 逆置換する文字列
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		// 置換した文字
		char tikan1;
		char tikan2;

		String word = "";

		// 文字列の入れ替え
		for (int i = 0; i < angou.length(); i++) {
			for (int j = 0; j < 26; j++) {
				tikan1 = str.charAt(j);
				tikan2 = alphabet.charAt(j);

				if (angou.charAt(i) == tikan1) {
					//					System.out.println(tikan1);
					System.out.println(tikan2);
					word += String.valueOf(tikan2);
				}
			}
		}
	}
}
