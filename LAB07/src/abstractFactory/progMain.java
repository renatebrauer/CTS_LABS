package abstractFactory;
//for creating x you need y z w. the user should not know the process behind

public class progMain {
	public static void main(String[]args) {
		
		//SIMPLE FACTORY
//		Factory factory=new Factory();
//		IWeapon weapon=factory.getWeapon(300);
//		weapon.power();
		
		//FACTORY METHOD
//		IFactory factory=new cheapFactory();
//		IWeapon weapon=factory.getWeapon(); //not using the price parameter!!!!
//		weapon.power();
		
		//ABSTRACT FACTORY
	
		 shop Shop =new shop(new magicFactory());
		 Shop.createFamilyObjs();
	}

}
