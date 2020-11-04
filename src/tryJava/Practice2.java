package tryJava;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) throws ParseException {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		String year = sc.nextLine();
		String month = sc.nextLine();
		String day = sc.nextLine();

		// 20201031をtimeに作成
		String time = month + "/" + day + "/" + year;
		System.out.println(time);
		// 月/日/年になるようにフォーマットを指定
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		//String型をdate型に変換
		Date date = dateFormat.parse(time);

		System.out.println(date);
	}
}