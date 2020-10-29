package SukkiriJava;

public class Matango {
	// 属性の初期値指定と定数フィールド
	int hp;
	final int LEVEL = 10;
	// 定数フィールドの名前は一目でわかるよう大文字が推奨されている

	char suffix;

	public void run() {
		System.out.println("お化けキノコ" + this.suffix + "は逃げ出した！");
	}
}
