
public class LastBoss extends Human{
	
	public LastBoss() {
		super.setName("らすぼす");
		super.setGender(1);
		super.setLength(210);
		super.setWeight(120);
		super.setVitality(500);
		super.setMagic(40);	
	}
	
	public void specialEvilAttack(Human target) {
		String name = super.getName();
		System.out.println(name + "の　こうげき");
		System.out.println(name + "の　じゃあくな　ひっさつわざが　さくれつした");
		
		target.setVitality(target.getVitality() - 30);
		System.out.println(target.getName() + "は　30　のダメージを　うけた");
		
		super.setVitality(getVitality() - 10);
		System.out.println(name + "の　たいりょくは" + super.getVitality()  + "になった");
		System.out.println("");
	}	
	

}
