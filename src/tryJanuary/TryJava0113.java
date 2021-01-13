package tryJanuary;

import java.util.Scanner;

public class TryJava0113 {
	
	// グリッド上の移動
		  final static int[] dx = {1, 0, -1, 0};
		  final static int[] dy = {0, -1, 0, 1};
		  final static int R = 0, U = 1, L = 2, D = 3;

	public static void main(String[] args) {
		// ねずみ小僧　タイムオーバーエラー
		
		Scanner scanner = new Scanner(System.in);
		// 平面（街）の大きさ
		int h = scanner.nextInt();
		int w = scanner.nextInt();
		
		// 初期座標に指定
		int hPosition = scanner.nextInt() - 1;
		int wPosition = scanner.nextInt() - 1;
		
		String[][] city = new String[h][w];
		
	    for (int i=0; i<h; i++) {
	      
	        city[i] = scanner.next().split("");
	    }
	    //System.out.println(Arrays.deepToString(city));
	    
	    int count = 0;
	    int direction = 0;
	    
	    while (hPosition < h && wPosition < w && count < 2000) {
			
	    	// 初期状態の移動
	    	if (city[hPosition][wPosition].equals(".")) {
	    		city[hPosition][wPosition] = "*";
	    		direction ++;
	    		if(direction == 4) {
	    			direction = 0;
	    		}
	    	} else if (city[hPosition][wPosition].equals("*")) {
	    		city[hPosition][wPosition] = ".";
	    		direction --;
	    		if(direction == -1) {
	    			direction = 4;
	    		}
			}
	    	if(direction == 0) {
	    	// 上に移動 0
	    	wPosition += dx[U]; hPosition += dy[U];
	    	
	    	} else if (direction == 1) {
	    	// 右に移動 1
	    	wPosition += dx[R]; hPosition += dy[R]; 
	    	
			} else if (direction == 2) {
			// 下に移動 2
			wPosition += dx[D]; hPosition += dy[D]; 
				
			}else if (direction == 3) {
			// 左に移動 3
			wPosition += dx[L]; hPosition += dy[L]; 
				
			}
	    	
	    	//System.out.println(Arrays.deepToString(city));
	    	
	    	//System.out.println();
	    }//while
	    for (int i = 0; i < h; i++) {
	    	for (int j = 0; j < city[i].length; j++) {
	    		System.out.print(city[i][j]);
	    	}
	    	System.out.println();
	    }
	}
	
}
