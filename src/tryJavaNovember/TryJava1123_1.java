package tryJavaNovember;

import java.util.Scanner;

public class TryJava1123_1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		/**
		 * パイザ君と霧島京子は最初どちらも数 1 をもっています。パイザ君は自分の番が来ると、
		 * 自分のもっている数の a 倍を霧島京子の数に足してあげます。
		 * 霧島京子は自分の番が来ると、自分のもっている数を b で割った余りをパイザ君の数に足してあげます。
		 * この手続きをパイザ君の番から始めて、霧島京子の数がnより大きくなるまで繰り返します。
		 * 手続きが終わったときのパイザ君の操作回数を求めてください。
		 */

		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int a = scanner.nextInt();
		int b = scanner.nextInt();

		int paiza = 1;
		int kyoko = 1;

		int paizaAct = 0;

		while (kyoko <= n) {
			// パイザくんの番
			kyoko += paiza * a;
			paizaAct++;
			// 霧島京子の番
			paiza += kyoko % b;
		}
		System.out.println(paizaAct);
		scanner.close();
	}
}
