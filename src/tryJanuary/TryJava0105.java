package tryJanuary;

import java.util.Scanner;

public class TryJava0105 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scanner = new Scanner(System.in);
		int count = scanner.nextInt();
		int score = 0;
		
		for (int i = 0; i < count; i ++) {
			String correctAnswer = scanner.next();
			String answer = scanner.next();
			int defference = 0;
			
			if (answer.equals(correctAnswer)) {
				score = score + 2;
			}else if(correctAnswer.length() == answer.length()){
				for (int j = 0; j < correctAnswer.length(); j++) {
					if (correctAnswer.charAt(j) != answer.charAt(j)) {
						defference ++;
					}
				}
				if (defference == 1) {
					score = score + 1;
				}else if (defference >= 2) {
				}
			}else {
			}
		}
		System.out.println(score);
	}
}
