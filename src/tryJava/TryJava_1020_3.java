package tryJava;

import java.util.Scanner;

public class TryJava_1020_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scanner = new Scanner(System.in);

		int[] num = new int[10];

		for (int i = 0; i < 9; i++) {
			num[i] = scanner.nextInt();
		}

		int sum = java.util.Arrays.stream(num).sum();

		System.out.println(sum);

		scanner.close();

	}

}
