package tryJanuary;

import java.util.Scanner;

/**
 * ダイクストラ法の学習
 * @author uenishikeita
 *
 */
public class TryJava0108 {
	// グリッド上の移動
	  final static int[] dx = {1, 0, -1, 0};
	  final static int[] dy = {0, -1, 0, 1};
	  final static int R = 0, U = 1, L = 2, D = 3;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
	    int w = sc.nextInt();
	    
	    // 配列に数字を格納
	    int[][] t = new int[h][w];
	    for (int i=0; i<h; i++)
	      for (int j=0; j<w; j++)
	        t[i][j] = sc.nextInt();
	    	
	    // move RDRUL
	    int cost = 0;
	    int x = 0, y = 0;
	    // 右に移動
	    x += dx[R]; y += dy[R]; cost += t[y][x]; System.out.println(t[y][x]);
	    // 下に移動
	    x += dx[D]; y += dy[D]; cost += t[y][x]; System.out.println(t[y][x]);
	    // 右に移動
	    x += dx[R]; y += dy[R]; cost += t[y][x]; System.out.println(t[y][x]);
	    // 上に移動
	    x += dx[U]; y += dy[U]; cost += t[y][x]; System.out.println(t[y][x]);
	    // 左に移動
	    x += dx[L]; y += dy[L]; cost += t[y][x]; System.out.println(t[y][x]);
	    System.out.println(cost);
	}
}
