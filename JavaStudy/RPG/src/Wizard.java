
public class Wizard extends Human {
	
	//コンストラクタ
		public Wizard() {
			super.setName("まほうつかい");
			super.setGender(1);
			super.setLength(170);
			super.setWeight(60);
			super.setVitality(20);
			super.setMagic(50);	
		}
		public void magicAttack(Human target) {
			String name = super.getName();
			System.out.println(name + "の　こうげき");
			System.out.println(name + "の　こうげきじゅもんを　となえた");
			
			target.setVitality(target.getVitality() - 20);
			System.out.println(target.getName() + "に　20　のダメージを　あたえた");
			
			super.setMagic(getMagic() - 10);
			System.out.println(name + "の　まりょく" + super.getMagic()  + "になった");
			System.out.println("");
		}	
	}



