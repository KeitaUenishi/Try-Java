package tryJavaNovember;

import java.util.Arrays;

public class TryJava1123_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 二次元配列練習

		// 二次元配列fruitsを3行分宣言し、1次元配列を3つ格納できる
		String[][] fruits = new String[3][];
		String[] fruits01 = { "りんご", "バナナ", "桃" };
		String[] fruits02 = { "ぶどう", "メロン", "みかん" };
		String[] fruits03 = { "キウイ", "パイナップル", "さくらんぼ" };

		// 3つの1次元配列を宣言し、それぞれ2次元配列に格納
		fruits[0] = fruits01;
		fruits[1] = fruits02;
		fruits[2] = fruits03;

		// Arrays.deepToStringメソッドを使うことで配列の要素を確認できる
		System.out.println(Arrays.deepToString(fruits));

		// for構文の中にfor構文を入れて出力
		// 配列名.length とすると、Y方向（縦方向）の要素数を取得できる
		for (int i = 0; i < fruits.length; i++) {
			// 配列名.length とすると、X方向（横方向）の要素数を取得できる
			for (int j = 0; j < fruits[0].length; j++) {

				/*
				 * 上記の繰り返し処理で、
				 * ・変数iが0のとき、変数jは0と1と2となる
				 * ・変数iが1のとき、変数jは0と1と2となる
				 * ・変数iが2のとき、変数jは0と1と2となる
				 */
				System.out.println(fruits[i][j]);
			}
		}
	}

}
