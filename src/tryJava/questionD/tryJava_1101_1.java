package tryJava.questionD;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class tryJava_1101_1 {

	public static void main(String[] args) {
		/**
		 * 指定された配列（リスト）の定義の中で、同じ要素の数をカウントして、その数を出力してください。
		 */

		List<String> list = Arrays.asList("HND", "NRT", "KIX", "NGO", "NGO", "NGO", "NGO", "NGO");
		TreeSet<String> set = new TreeSet<>(list);

		for (String s : set) {
			int count = 0;
			for (String c : list) {
				if (s.equals(c))
					count++;
			}
			if (count > 1)
				System.out.println(count);
		}
	}
}