package tryJava;

import java.util.Scanner;

public class TryJava_1017 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scanner = new Scanner(System.in);

		int student = scanner.nextInt();
		int boderLine = scanner.nextInt();

		for (int i = 1; i <= student; i++) {
			int score = scanner.nextInt();
			int numOfAbsentees = scanner.nextInt();

			if (passOrFail(boderLine, score, numOfAbsentees) == 1) {
				System.out.println(i);
			} else {

			}

		}
		scanner.close();
	}

	public static int passOrFail(int boderLine, int score, int numOfAbsentees) {
		int totalScore = score - numOfAbsentees * 5;

		if (totalScore <= 0) {
			totalScore = 0;
		}

		if (boderLine <= totalScore) {
			return 1;
		} else {
			return 0;
		}
	}

}
