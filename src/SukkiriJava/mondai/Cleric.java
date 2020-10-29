package SukkiriJava.mondai;

import java.util.Random;

public class Cleric {

	String name;
	final int MAXHP = 50;
	final int MAXMP = 10;
	int hp;
	int mp;

	public void selfAid() {
		this.mp = -5;
		this.hp = MAXHP;
	}

	public int pray(int second) {
		System.out.println(this.name + "は" + second + "秒間天に祈った！");
		int recovery = new Random().nextInt(3) + second;
		int recoverAcutal = Math.min(this.MAXMP - this.mp, recovery);
		this.mp += recoverAcutal;
		System.out.println("MPが" + recoverAcutal + "回復した！");
		return recoverAcutal;
	}

}
