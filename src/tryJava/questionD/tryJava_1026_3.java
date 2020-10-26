package tryJava.questionD;

import java.util.ArrayList;
import java.util.List;

public class tryJava_1026_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		List<String> list = new ArrayList<String>();

		list.add("Nara");
		list.add("Shiga");
		list.add("Hokkaido");
		list.add("Chiba");

		list.forEach(System.out::println);

		/* 回答例
		 * 
		 *  String[] str = {"Nara", "Shiga", "Hokkaido", "Chiba"};
		
				for (String p : str) {
				System.out.println(p);
				}
		 */

	}

}
