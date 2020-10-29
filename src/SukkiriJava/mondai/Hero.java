package SukkiriJava.mondai;

public class Hero {

	// フィールドを追加
	String name;
	int hp;

	/*
	 * this 特別に準備された変数で、「自分自身のインスタンス」を意味している。
	 */
	public void sleep() {
		this.hp = 100;
		System.out.println(this.name + "は、眠って回復した！");
	}

	public void sit(int sec) {
		this.hp += sec;
		System.out.println(this.name + "は、" + sec + "ポイント回復した");
	}

	public void slip() {
		this.hp -= 5;
		System.out.println(this.name + "は、転んだ！");
		System.out.println("5のダメージ！");
	}

	public void run() {
		System.out.println(this.name + "は、逃げ出した！");
		System.out.println("GAMEOVER");
		System.out.println("最終HPは" + this.hp + "でした");
	}
}
