package chapter1;

public class cat {
	
//	フィールド
	private String name;
	private int age;
	
//	コンストラクタ
	public cat(String n,int a) {
		this.name = n;
		this.age =a;
	}
	
//メソッド
	public void showName() {
		System.out.println("名前は" + this.name + "です。");
	}
	public void showAge() {
		System.out.println("年齢は" + this.age + "歳です。");
	}
	public void agePlus() {
		age++;
	}
}



