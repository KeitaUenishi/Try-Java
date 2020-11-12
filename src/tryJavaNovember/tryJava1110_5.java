package tryJavaNovember;

import java.util.Scanner;

public class tryJava1110_5 {

	/** 1行目の英大文字 X から、2行目の英大文字 Y の範囲に3行目のアルファベット C が含まれていれば"true",
	 *  そうでなければ"false"と出力してください。
		X が Y よりもアルファベット順で後ろになる場合(X = 'G', Y = 'F'のときなど)も"false"と出力してください。
	
		※ 回答例
	*/

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char x = sc.next().charAt(0);
		char y = sc.next().charAt(0);
		char c = sc.next().charAt(0);
		System.out.println(x <= c && c <= y);
	}
}