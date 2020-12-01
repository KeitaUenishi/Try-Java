package myidea;

import java.util.Random;
import java.util.Scanner;

public class Oraoraora {

	public static void main(String[] args) {

		/**
		 * 空条承太郎が「オラ」と言う数を当てなければ一生殴られ続ける
		 */

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int level = 0;
		System.out.println("難易度を1～10で選択");
		try {
			level = scanner.nextInt();
		} catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println("数値を入力してください" + e);
		}

		int set = (level + 2) * 2;
		System.out.println("「オラ」を言う数を当ててください");

		while (true) {
			int answer = scanner.nextInt();
			int ora = random.nextInt(set) + 1;
			System.out.println("～～～～" + ora + "回ッッ！！～～～～");

			if (ora == answer) {
				System.out.println("clear!!!");
				break;
			} else {
				for (int i = 0; i < ora; i++) {
					System.out.print("オラ");
				}
			}
		}
		scanner.close();
	}
}
