package tryJanuary;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class TryJava0107 {

	public static void main(String[] args) {
		// ユーザーの血液型のデータ処理

		Scanner scanner = new Scanner(System.in);
		Map<String, String> map = new LinkedHashMap<>();
		int count = scanner.nextInt();
		
		for (int i = 0; i < count; i++) {
			map.put(scanner.next(), scanner.next());
		}
		
		for (Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		scanner.close();
	}
}
