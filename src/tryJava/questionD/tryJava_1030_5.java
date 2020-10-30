package tryJava.questionD;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class tryJava_1030_5 {

	/**
	 * 10/30 コンパイルエラー
	 * 回答
	 * @param args
	 */

	public static void main(String[] args) {
		/**
		 * 1行目に行数を表す整数 n、続く n 行の各行で「文字」と「整数」の組が空白区切りで入力されます。
		 * n 個の組を、「整数」の値で昇順に並べ変え、「文字」を出力してください。
		 */

		Scanner scanner = new Scanner(System.in);
        int times = scanner.nextInt();
        scanner.nextLine();  // 1行読み飛ばし

        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        int index[] = new int[times];
        for (int i = 0; i < times; i++) {
            String input[] = scanner.nextLine().split(" ");
            hashMap.put(Integer.parseInt(input[1]), input[0]);
            index[i] = Integer.parseInt(input[1]);
        }

        Arrays.sort(index);

        for (int i: index) {
            System.out.println(hashMap.get(i));
        }

        scanner.close();
    }
}