package tryJavaNovember;

import java.util.Scanner;

public class tryJava1109_3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}
		int k = scanner.nextInt();
		int i = 0;
		while (i < n) {
			if (a[i] == k) {
				int answer = i + 1;
				System.out.println(answer);
				break;
			}
			i++;
		}
		scanner.close();
	}
}