package tryJava.questionD;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class tryJava_1030_3 {

	public static void main(String[] args) {
		/**
		 * 1行目に行数を表す整数 n、続く n 行で m 個の「文字」と「整数」の組が空白区切りで入力されます。
		 * n 個の整数だけをそのまま順に出力してください。
		 */

		Scanner scanner = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		int count = scanner.nextInt();

		for (int i = 0; i < count; i++) {
			list.add(scanner.nextInt());
		}
		for (int i = 0; i < count; i++) {
			// sort関数で昇順に並び替え
			Collections.sort(list);
			// 表示
			System.out.println(list.get(i));
		}
		scanner.close();
	}
}
