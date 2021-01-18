package tryJanuary;

import java.util.Scanner;

public class TryJava0119 {
	
	public static void main(String[] args) {
		// FizzBuzz練習
		
		Scanner scanner = new Scanner(System.in);
		String fizz = "Fizz";
		String buzz = "Buzz";
		
		for (int i = 1; i < 100; i++) {
			
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println(fizz + buzz);
			}else if(i % 5 == 0) {
				System.out.println(buzz);
			}else if (i % 3 == 0) {
				System.out.println(fizz);
			}else {
				System.out.println(i);
			}
		}
		scanner.close();
	}
	
}
