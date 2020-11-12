package tryJavaNovember;

import java.util.Scanner;

public class tryJava1109_1 {

	public static void main(String[] args) {

		/**
		 * 配列 A の要素数 N と整数 K, 配列 A の各要素 A_1, A_2, ..., A_N が与えられるので、
		 * 配列 A に K がいくつ含まれるか数えてください。		 */

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] list = new int[n];
		int count = 0;

		for (int i = 0; i < n; i++) {
			list[i] = sc.nextInt();
			if (list[i] == k) {
				count++;
			}
		}
		System.out.println(count);
		sc.close();
	}
}