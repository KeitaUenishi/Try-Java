package tryJavaNovember;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class TryJava1123 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		// 11/23途中 再挑戦

		Scanner scanner = new Scanner(System.in);

		String s = scanner.next();
		String t = scanner.next();
		int count = s.length() + t.length();
		int n[] = new int[s.length()];
		int m[] = new int[t.length()];

		for (int i = 0; i < s.length(); ++i) {
			char ch1 = s.charAt(i);
			n[i] = (int) ch1 - (int) 'a' + 1;
		}
		for (int i = 0; i < t.length(); i++) {
			char ch2 = t.charAt(i);
			m[i] = (int) ch2 - (int) 'a' + 1;
		}

		IntStream stream1 = Arrays.stream(n);
		IntStream stream2 = Arrays.stream(m);

		IntStream stream3 = IntStream.concat(stream1, stream2);
		int[] array = stream3.toArray();
		int calc[][] = new int[count][count];
		int answer = 0;

		for (int j : array) {

			answer = array[j];

		}

	}

}
