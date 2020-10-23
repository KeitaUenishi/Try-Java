package tryJava;

import java.math.BigDecimal;
import java.util.Scanner;

public class TryJava_1020_5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scanner = new Scanner(System.in);

		BigDecimal stock = new BigDecimal(scanner.nextLine());

		BigDecimal bayOut1 = new BigDecimal(0.01 * scanner.nextDouble());

		BigDecimal remaining = stock.subtract(bayOut1);

		System.out.println(remaining);

		scanner.close();
	}

}
