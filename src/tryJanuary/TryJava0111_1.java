package tryJanuary;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TryJava0111_1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		Map<String, Integer> map = new HashMap<>();
		
		for (int i = 0; i < n; i++) {
			map.put(scanner.next(), scanner.nextInt());
		}
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getValue());
		}
	}
}
