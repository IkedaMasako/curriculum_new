//Creatureクラス
 class Creature {

//	メソッド
	void walk() {
		System.out.println("あるいています");
	}

	 void speak() {
		System.out.println("しゃべっています");
	}
}

//Birdクラス
 
 class Bird extends Creature{
	 void speak() {
		System.out.println("鳴いています");
		super.speak();
	}

 }


// メイン
 public class main {

	public static void main(String[] args) {
		Bird suzume = new Bird();
		suzume.speak();

	}

}

