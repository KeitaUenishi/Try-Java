package tryJavaNovember;

import java.util.Scanner;

public class tryJava1105_2 {

	public static void main(String[] args) {

		/**
		 * あなたは健康のために、1日1万歩を歩くことを目標にしました。
		 * 入力として、歩いた距離(km)と歩幅(cm)が与えられるので、
		 * 1万歩を歩いているかどうかを判定して結果を出力してください。
		 */

		Scanner sc = new Scanner(System.in);
		int km = sc.nextInt();
		int cm = sc.nextInt();

		int run = (km * 1000) / cm;
		if (run <= 10000) {
			System.out.println("yes");
		} else {
			System.out.println("true");
		}
	}
}