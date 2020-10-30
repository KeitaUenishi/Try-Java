package tryJava.questionD;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class tryJava_1030_4 {

	/**
	 * 10/30 コンパイルエラー
	 * 再挑戦
	 * @param args
	 */

	public static void main(String[] args) {
		/**
		 * 1行目に行数を表す整数 n、続く n 行の各行で「文字」と「整数」の組が空白区切りで入力されます。
		 * n 個の組を、「整数」の値で昇順に並べ変え、「文字」を出力してください。
		 */

		Scanner scanner = new Scanner(System.in);
		Map<String, Integer> map = new HashMap<String, Integer>();

		for (int i = 0; i < scanner.nextInt(); i++) {
			// Mapにデータを格納
			map.put(scanner.next(), Integer.parseInt(scanner.next()));
		}
		List<Entry<String, Integer>> listEntries = new ArrayList<Entry<String, Integer>>(map.entrySet());

		// 比較関数Comparatorを使用してMap.Entryの値を比較する(昇順)
		Collections.sort(listEntries, new Comparator<Entry<String, Integer>>() {
			public int compare(Entry<String, Integer> obj1, Entry<String, Integer> obj2) {
				return obj1.getValue().compareTo(obj2.getValue());
			}
		});

		// ループで要素順に値を取得する
		for (Entry<String, Integer> entry : listEntries) {
			System.out.println(entry.getValue());
		}

		scanner.close();
	}
}
