package myidea;

import java.util.Random;
import java.util.Scanner;

public class AngryUncle {

	public static void main(String[] args) {
		/**
		 * 入力された数値(n)回のうち、ランダムにブチギレるおじさん
		 */

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		System.out.println("あそこにおじさんがいますね。数字を入力");
		int count = scanner.nextInt();

		for (int i = 0; i < count; i++) {
			int randomWord = random.nextInt(10);
			if (randomWord < 3) {
				System.out.println("おじさん：ゴラァ！！");
			} else if (randomWord > 7) {
				System.out.println("おじさん：おぉぉんん！？");
			} else {
				System.out.println("……///");
			}
		}
		System.out.println("おじさんは通り過ぎていった……。");
		scanner.close();
	}

}
