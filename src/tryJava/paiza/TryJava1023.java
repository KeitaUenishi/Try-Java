package tryJava.paiza;

import java.util.Scanner;

public class TryJava1023 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scanner = new Scanner(System.in);
		//学生の数
		int studentCount = scanner.nextInt();
		//問題数 100の約数
		int allocation = 100 / scanner.nextInt();
		//減点数
		double deduction = 0;

		for (int i = 0; i < studentCount; i++) {
			//レポート提出日
			int filingDate = scanner.nextInt();
			//正解数
			int correctAnswer = scanner.nextInt();

			double score = (double) correctAnswer * (double) allocation;

			//提出日により減点数を代入
			if (filingDate <= 0) {
				deduction = 1;

			} else if (1 <= filingDate && filingDate < 10) {
				deduction = 0.8;

			} else {

			}
			score = score * deduction;

			System.out.println(judgment(score));
		}

	}

	public static String judgment(double score) {

		if (80 <= score && score <= 100) {
			return "A";
		} else if (70 <= score && score <= 79) {
			return "B";
		} else if (60 <= score && score <= 69) {
			return "C";
		} else {
			return "D";
		}

	}

}
