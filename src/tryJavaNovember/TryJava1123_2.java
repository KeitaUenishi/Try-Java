package tryJavaNovember;

import java.util.Arrays;

public class TryJava1123_2 {

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
	}

}
