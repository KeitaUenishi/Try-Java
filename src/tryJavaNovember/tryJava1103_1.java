package tryJavaNovember;

import java.util.Arrays;

public class tryJava1103_1 {

	public static void main(String[] args) {

		/**
		 * 指定した配列を定義し、配列の要素を昇順に並び替えて、全て出力してください。
		 */

		int[] list = { 1, 3, 5, 6, 3, 2, 5, 23, 2 };
		// 配列(固定長)をソートするには、Arrarsクラスのsortメソッドを使用する。
		Arrays.sort(list);

		for (int i : list) {
			System.out.println(i);
		}
	}
}
