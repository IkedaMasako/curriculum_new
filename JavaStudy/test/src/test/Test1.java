package test;

public class Test1 {
	

	
	//sayHelloメソッド。String nageは仮引数
	public static void sayHello(String name,int age) {
		System.out.println("Hello" + name + "さん。年齢は" + age + "歳です。");
	}
 
	
	//メインメソッド
		public static void main(String[] args) {
			// TODO 自動生成されたメソッド・スタブ
			sayHello("太郎",30);

		}
}
