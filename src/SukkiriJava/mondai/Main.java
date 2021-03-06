package SukkiriJava.mondai;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		// 1.勇者を生成
		Hero h = new Hero();
		// 2.フィールドに初期値をセット
		h.name = "ゴン";
		h.hp = 100;
		System.out.println("勇者" + h.name + "を生み出しました！");

		Cleric cleric = new Cleric();
		cleric.name = "アウグスティヌス";
		cleric.hp = 50;

		Matango m1 = new Matango();
		m1.hp = 50;
		m1.suffix = 'A';

		Matango m2 = new Matango();
		m2.hp = 48;
		m2.suffix = 'B';

		// 3.メソッドを呼び出していく
		h.sit(5);
		h.slip();
		h.sit(25);
		cleric.pray(5);
		System.out.println("現在のMPは" + cleric.mp);
		m1.run();
		m2.run();
		h.run();
	}

}
