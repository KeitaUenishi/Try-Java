package tryJavaNovember;

import java.util.Scanner;

public class tryJava1110_3 {

	/** 英大文字の文字列が入力されます。
		この文字列の先頭1文字と末尾1文字で表される範囲に含まれる文字をすべて出力してください。
	
		範囲とは、アルファベット順に並べた英大文字の列('A', 'B', 'C', ..., 'Z')について、
		先頭の文字の出現位置から末尾の文字の出現位置までの部分列のことです。
		たとえば、先頭の文字が'G'で末尾の文字が'O'で表される範囲は、
		('G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O')となります。
	
		出力はアルファベット順に表示し、1文字表示するたびに改行してください。
	*/

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String string = scanner.next();

		char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
		char one = string.charAt(0);
		char last = string.charAt(string.length() - 1);

		for (int i = 0; i < alphabet.length; i++) {
			char c = alphabet[i];
			if (one <= c && last >= c) {
				System.out.println(c);
			} else {
			}
		}

		scanner.close();
	}
}