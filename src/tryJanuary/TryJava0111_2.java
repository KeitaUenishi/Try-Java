package tryJanuary;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TryJava0111_2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			list.add(scanner.nextInt());
		}
		
		Collections.sort(list);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list);
			
		}
	}
}
