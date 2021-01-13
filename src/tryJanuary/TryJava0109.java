package tryJanuary;

import java.util.ArrayList;

public class TryJava0109 {

	public static void main(String[] args) {

		int amount = 300;
		int n = 7;
		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < n; i++) {
			int ans = (amount + i) / n;
			list.add(ans);
		}

		System.out.println(list);
	}
}
