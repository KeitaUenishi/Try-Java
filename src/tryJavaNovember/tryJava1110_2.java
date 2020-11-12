package tryJavaNovember;

import java.util.Scanner;

public class tryJava1110_2 {

	/** 英大文字の文字列が入力されます。
		文字列の先頭1文字が、末尾1文字よりもアルファベット順で先に出現するならば、
		"true"を出力し、そうでなければ"false"を出力してください。
	*/

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String string = scanner.next();

		char one = string.charAt(0);
		char last = string.charAt(string.length() - 1);

		if (one < last) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		scanner.close();
	}
}