package day07.q01;

/** 
 * 飲料水クラス 
 */

public class Drink {
	private int price;
	private String name;

	public Drink() {
		price = 120;
		name = "ビタミン麦茶";

	}

	public Drink(int price, String name) {
		super();
		this.price = price;
		this.name = name;

	}

	public void show() {
		System.out.println(name+":"+price+"円です。");
	}
}
