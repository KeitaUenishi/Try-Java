package tryJava;

import java.util.Scanner;

public class TryJava_1018 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		//文字列を大文字に変換するtoUpperCaseメソッド
		String upper_s = s.toUpperCase();

		//入力された文字列sをint型に変換
		int aToz = s.length();

		if ((1 <= aToz) && (aToz <= 100)) {
			upper_s = upper_s.replaceAll("A", "4");
			upper_s = upper_s.replaceAll("E", "3");
			upper_s = upper_s.replaceAll("G", "6");
			upper_s = upper_s.replaceAll("I", "1");
			upper_s = upper_s.replaceAll("O", "0");
			upper_s = upper_s.replaceAll("S", "5");
			upper_s = upper_s.replaceAll("Z", "2");

			System.out.println(upper_s);
		}

	}
}
