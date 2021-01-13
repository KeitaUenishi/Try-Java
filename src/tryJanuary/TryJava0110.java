package tryJanuary;

import java.util.List;
import java.util.Scanner;

public class TryJava0110 {

	private static int price;
	private static int stock;
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int variety = scanner.nextInt();
		int query = scanner.nextInt();
		List[] listPrice = new List[variety];
		Bakeary bakeary = new Bakeary();
		
		for (int i = 0; i < variety; i++) {
			int price = scanner.nextInt();
			int stock = scanner.nextInt();
			
			
			
		}
		
	}
}

 class Bakeary{
	
	private static int price;
	private static int stock;
	
	public void bake(int price, int stock) {
		this.price = price;
		this.stock = stock;
	}
	
}