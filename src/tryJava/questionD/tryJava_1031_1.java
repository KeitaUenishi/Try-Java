package tryJava.questionD;

import java.util.HashSet;
import java.util.Set;

public class tryJava_1031_1 {

	public static void main(String[] args) {
		/**
		 * 配列（リスト）の要素に重複があればtrueを、重複がなかったらfalseを出力する。
		 * 最後は改行し、余計な文字、空行を含んではいけません。
		 */

		String[] list = { "HND", "NRT", "KIX", "NGO", "NGO" };
		System.out.println(overlapCheck(list));
	}

	public static boolean overlapCheck(String[] list) {
		boolean result = false;
		Set<String> checkHash = new HashSet<String>();
		for (String str : list) {
			if (checkHash.contains(str)) {
				// 重複があればtrueをセットし終了
				result = true;
				break;
			} else {
				// 重複しなければハッシュセットへ追加
				checkHash.add(str);
			}
		}
		return result;
	}

}