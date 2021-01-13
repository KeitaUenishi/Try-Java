package tryJanuary;

import java.util.Scanner;

public class TryJava0109_1 {

	public static void main(String[] args) {
		
		//Paiza Bランク公平な分割 解けず再チャレンジ

		Scanner scanner = new Scanner(System.in);
		int hight = scanner.nextInt();
		int width = scanner.nextInt();
		
		String[][] cake = new String[hight][width];
		
		for (int i = 0; i < hight; i++) {
			cake[i] = scanner.next().split("");
		}
		//System.out.println(Arrays.deepToString(cake));
		
		int area = 0;
		int strawberry = 0;
		
		
		//座標を1つずつ指定
		for (int i = 0; i < hight; i++) {
			for (int j = 0; j < width; j++) {
				//座標の表示
				//System.out.println((i + 1) + " " + (j + 1));
				
				cakeSpritLeftUp(cake, i, j);
				cakeSpritRightUp(cake, i, j);
				cakeSpritLeftDown(cake, i, j);
				cakeSpritRightDown(cake, i, j);
				
				//System.out.println("ぴーや");
			}
		}
	}
	
	// ケーキ左上
	static void cakeSpritLeftUp (String[][] cake, int i, int j) {
		String[][] newCake1 = new String[i + 1][j + 1];
		//System.out.println(newCake1[i][j]);
		int area = 0;
		int strawberry = 0;
		int answer = 0;
		
		for (int k = 0; k <= i; k++) {
			for (int k2 = 0; k2 <= j; k2++) {
				newCake1[k][k2] = cake[k][k2];
				
				if(newCake1[k][k2].equals("#")) {
					area = area + 1;
				}else if(newCake1[k][k2].equals("@")) {
					strawberry = strawberry + 1;
				}
			}
		}
		answer = area + (strawberry ^ 2);
		System.out.println(answer);
		//System.out.println(Arrays.deepToString(newCake1));
	}
	
	// ケーキ右上
		static void cakeSpritRightUp (String[][] cake, int i, int j) {
			String[][] newCake1 = new String[i + 1][j + 1];
			//System.out.println(newCake1[i][j]);
			int area = 0;
			int strawberry = 0;
			int answer = 0;
			
			for (int k = 0; k <= i; k++) {
				for (int k2 = 0; k2 <= j; k2++) {
					newCake1[k][k2] = cake[k][-(k2 - j)];
					
					if(newCake1[k][k2].equals("#")) {
						area = area + 1;
					}else if(newCake1[k][k2].equals("@")) {
						strawberry = strawberry + 1;
					}
				}
			}
			answer = area + (strawberry ^ 2);
			System.out.println(answer);
			//System.out.println(Arrays.deepToString(newCake1));
		}
		// ケーキ左下
				static void cakeSpritRightDown (String[][] cake, int i, int j) {
					String[][] newCake1 = new String[i + 1][j + 1];
					//System.out.println(newCake1[i][j]);
					int area = 0;
					int strawberry = 0;
					int answer = 0;
					
					for (int k = 0; k <= i; k++) {
						for (int k2 = 0; k2 <= j; k2++) {
							newCake1[k][k2] = cake[-(k - i)][k2];
							
							if(newCake1[k][k2].equals("#")) {
								area = area + 1;
							}else if(newCake1[k][k2].equals("@")) {
								strawberry = strawberry + 1;
							}
						}
					}
					answer = area + (strawberry ^ 2);
					System.out.println(answer);
					//System.out.println(Arrays.deepToString(newCake1));
					
				}
				// ケーキ右上
				static void cakeSpritLeftDown (String[][] cake, int i, int j) {
					String[][] newCake1 = new String[i + 1][j + 1];
					//System.out.println(newCake1[i][j]);
					int area = 0;
					int strawberry = 0;
					int answer = 0;
					
					for (int k = 0; k <= i; k++) {
						for (int k2 = 0; k2 <= j; k2++) {
							newCake1[k][k2] = cake[-(k - i)][-(k2 - j)];
							
							if(newCake1[k][k2].equals("#")) {
								area = area + 1;
							}else if(newCake1[k][k2].equals("@")) {
								strawberry = strawberry + 1;
							}
						}
					}
					answer = area + (strawberry ^ 2);
					System.out.println(answer);
					//System.out.println(Arrays.deepToString(newCake1));
				}
	// イチゴの数をカウントしintに変換
	void strawberryCount(String strawberry) {	
	}
	
	// 面積をカウントしintに変換
	void areaCount(String area) {
		
	}
}
