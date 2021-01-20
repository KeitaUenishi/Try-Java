package tryJavaDecember;

import java.util.Scanner;

public class TryJava1204 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scanner = new Scanner(System.in);
		int count = 0;

		try {
			count = scanner.nextInt();
		} catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println(e);
		}

		int board[][] = new int[count][count];

		for (int i = 0; i < count; i++) {
			for (int j = 0; j < count; j++) {
				board[i][j] = scanner.nextInt();
			}
		}

	}

}
