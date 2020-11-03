package tryJavaNovember;

import java.util.Arrays;
import java.util.Scanner;

public class tryJava1103_3 {

	public static void main(String[] args) {

		/**
		 * 1行目で整数 n が与えられ、2行目で n 個の整数が与えられます。
		 * n 個の整数を昇順に出力してください。
		 */

		Scanner scanner = new Scanner(System.in);

		int count = scanner.nextInt();
		int[] list = new int[count];
		scanner.nextLine();

		for (int i = 0; i < count; i++) {
			list[i] = scanner.nextInt();
		}

		Arrays.sort(list);
		for (int n : list) {
			System.out.println(n);
		}
		scanner.close();
	}
}
