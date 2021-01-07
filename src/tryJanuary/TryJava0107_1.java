package tryJanuary;

import java.util.Scanner;

public class TryJava0107_1 {

	public static void main(String[] args) {
		// Paiza Bランク 回答時間切れ リベンジ

		Scanner scanner = new Scanner(System.in);
		int hight = scanner.nextInt();
		int width = scanner.nextInt();
		int rope = 0;
		
		String[][] flowerBed = new String[hight][width];
		
		// 図を入力
		for (int i = 0; i < hight; i++) {
			flowerBed[i] = scanner.next().split("");
			}
		//System.out.println(Arrays.deepToString(flowerBed));
		
		// #の数だけ一旦４を足す
		for (int i = 0; i < hight; i++) {
			for (int j = 0; j < flowerBed[0].length; j++) {
				if (flowerBed[i][j].equals("#")) {
					rope = rope + 4;
				}
			}
		}
		//System.out.println(rope);
		String line = "";
		
		// 横一列を判定
		for (int i = 0; i < hight; i++) {
			for (int j = 0; j < flowerBed[0].length; j++) {
					// System.out.println(flowerBed[i][j]);
				line += flowerBed[i][j];
					
			}
			
			//System.out.println(line);
			//System.out.println(line.substring(i, -(i - hight)));
			try {
				if (line.substring(i, i + 2).contains("##")){
					rope -= 2;
				}
			} catch (StringIndexOutOfBoundsException e) {
				// TODO: handle exception
			}
			line = "";
		}

		//縦一列を判定
		for (int i = 0; i < hight; i++) {
			for (int j = 0; j < flowerBed[0].length; j++) {
					// System.out.println(flowerBed[i][j]);
				line += flowerBed[j][i];
					
			}
			
			//System.out.println(line);
			//System.out.println(line.substring(i, -(i - hight)));
			
			try {
				if (line.substring(i, i + 2).contains("##")){
					rope -= 2;
					//System.out.println(line.substring(i, i + 2));
				}
			} catch (StringIndexOutOfBoundsException e) {
				// TODO: handle exception
			}
			line = "";
		}
		System.out.println(rope);
	}
}
