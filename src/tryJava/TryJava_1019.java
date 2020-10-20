package tryJava;

import java.util.Scanner;

public class TryJava_1019 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scanner = new Scanner(System.in);
		int log = 0;
		int nowPoint = 1;

		int count = scanner.nextInt();

		for (int i = 0; i < count; i++) {

			int num = 0;
			int moving = scanner.nextInt();

			if (nowPoint < moving) {
				num = moving - nowPoint;
			} else if (moving < nowPoint) {
				num = nowPoint - moving;
			}

			log = log + num;
			nowPoint = moving;
		}

		System.out.println(log);
		scanner.close();

	}

}
