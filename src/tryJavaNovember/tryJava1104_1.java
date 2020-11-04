package tryJavaNovember;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class tryJava1104_1 {

	public static void main(String[] args) {

		/**
		 * 1行目に行数を表す整数 n、続く n 行の各行で「文字」と「整数」の組が空白区切りで入力されます。
		 * n 個の組について、「文字」の値が同じ組同士の数値を足しわせてまとめ、
		 * まとめた数値の降順で、文字とまとめた数値の組を出力してください。
		 */

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		// Character型のキー、Integer型のvalueを持つHashMapクラスをインスタンス化
		Map<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < n; i++) {
			char c = sc.next().charAt(0);
			int v = sc.nextInt();
			// キーがあるか確認する(containtsKey)
			if (map.containsKey(c))
				//既にキーが存在していた場合、上書きしvの値を加算
				map.put(c, map.get(c) + v);
			else
				// mapにcとvのペアを格納
				map.put(c, v);
		}

		// Integer型のArrayList llにmapの値(value)を代入
		List<Integer> ll = new ArrayList<>(map.values());
		// 降順にソートする
		Collections.sort(ll);
		Collections.reverse(ll);

		// 拡張for文 llの要素の数だけ繰り返し処理を行う
		for (int i : ll)
			// keySetを利用してMapの要素回数分ループする
			for (Character c2 : map.keySet())
				// map.get キーの値に対応する値を取得
				if (map.get(c2) == i)
					System.out.println(c2 + " " + i);
	}
}