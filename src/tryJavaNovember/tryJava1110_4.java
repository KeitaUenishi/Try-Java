package tryJavaNovember;

import java.util.Scanner;

public class tryJava1110_4 {

	/** 1行目の英大文字 X から、2行目の英大文字 Y の範囲に3行目のアルファベット C が含まれていれば"true",
	 *  そうでなければ"false"と出力してください。
		X が Y よりもアルファベット順で後ろになる場合(X = 'G', Y = 'F'のときなど)も"false"と出力してください。
	*/

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String string1 = scanner.nextLine();
		String string2 = scanner.nextLine();
		String string3 = scanner.nextLine();

		char word = string3.charAt(0);

		if (string1.charAt(0) > string2.charAt(0)) {
			System.out.println("false");

		} else {

			if (string1.charAt(0) <= word && word <= string2.charAt(0)) {
				System.out.println("true");
			} else {
				System.out.println("false");
			}
		}

		scanner.close();
	}
}