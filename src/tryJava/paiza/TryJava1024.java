package tryJava.paiza;

import java.util.Scanner;

public class TryJava1024 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scanner = new Scanner(System.in);
		int days = scanner.nextInt();

		int[] openPrice = new int[days];
		int[] closePrice = new int[days];
		int[] highPrice = new int[days];
		int[] lowPrice = new int[days];

		for (int i = 0; i < days; i++) {

			try {
				openPrice[i] = scanner.nextInt();
				closePrice[i] = scanner.nextInt();
				highPrice[i] = scanner.nextInt();
				lowPrice[i] = scanner.nextInt();

			} catch (NumberFormatException e) {
				// TODO: handle exception
				System.out.println(e);
				System.out.println("数値を入力してください");
			}

		}

		System.out.print(openPrice[0] + " " + closePrice[closePrice.length - 1] + " ");
		System.out.println(calcMax(highPrice) + " " + calcMin(lowPrice));

		scanner.close();

	}

	public static int calcMax(int[] array) {

		int intMax = array[0];

		for (int i = 1; i < array.length; i++) {
			if (intMax < array[i]) {
				intMax = array[i];
			}
		}
		return intMax;
	}

	public static int calcMin(int[] array) {

		int intMin = array[0];

		for (int i = 1; i < array.length; i++) {
			if (intMin > array[i]) {
				intMin = array[i];
			}
		}
		return intMin;
	}
}
