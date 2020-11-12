package tryJavaNovember;

public class TryJava1112_1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		/**
		 *  10000 以上かつ 13 で割り切れるような最小の自然数を求めてください。
		 */
		int sum = 0;

		while (sum <= 10000) {
			sum += 13;
			if (sum >= 10000) {
				System.out.println(sum);
				break;
			}
		}
	}
}
