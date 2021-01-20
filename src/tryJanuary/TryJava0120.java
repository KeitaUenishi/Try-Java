package tryJanuary;

public class TryJava0120 {
	
	public static void main(String[] args) {
		// フィボナッチ数列の練習
		
		int f0, f1, fn;
		
		f0 = 0;
		System.out.println("f0= " + f0);
		
		f1 = 1;
		System.out.println("f1= " + f1);
		
		for (int i = 2; i <= 20; i++) {
			fn = f0 + f1;
			
			System.out.println(fn);
			f0 = f1;
			f1 = fn;
			
			System.out.println(f0 + " + " + f1 + "は");
		}
		
	}
	
}
