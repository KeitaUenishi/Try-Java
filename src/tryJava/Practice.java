package tryJava;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		String year = sc.nextLine();
		String month = sc.nextLine();
		String day = sc.nextLine();

		// 20201031をtimeに作成
		String time = month + "/" + day + "/" + year;
		System.out.println(time);
		// 月/日/年になるようにフォーマットを指定
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		ParsePosition pos = new ParsePosition(0);
		Date date = sdf.parse(time, pos);
		System.out.println(date);

		// 20201031をDate型に変更する
		//try {

		// Date型に変更され、書式を指定したものを出力する
		//	sdf.parse(time);
		//} catch (ParseException e) {
		// TODO 自動生成された catch ブロック
		//	System.out.println(e);
		//}
	}
}