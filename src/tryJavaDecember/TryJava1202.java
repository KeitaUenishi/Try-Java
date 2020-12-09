package tryJavaDecember;

import java.util.Arrays;
import java.util.Scanner;

public class TryJava1202 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scanner = new Scanner(System.in);

		// 並木道に並ぶ木の本数を表す整数 N
		int n = scanner.nextInt();
		// 区間の電球の平均個数が上回らなければならない数を表す整数 M
		int m = scanner.nextInt();

		// それぞれの木にいくつ電球が装飾されているかを表す整数
		// A_i (1 ≦ i ≦ N) が半角スペース区切りで与えられます。
		int[][] section = new int[n][];
		for (int i = 0; i < n; i++) {
			//			section[i] = Integer.parseInt(scanner.next());
		}
		System.out.println(Arrays.deepToString(section));

		// 電球の数を調べたい区間の数を表す整数 Q が与えられます。
		//int q = scanner.nextInt();

	}

}
