package abstractFactory;

public class shop {
	
	IFactory factory;

	public shop( IFactory factory) {
		super();
		this.factory=factory;
	}
	
	public void createFamilyObjs() {
		ICostume costume=factory.getCostume();
		IWeapon weapon=factory.getWeapon();
		
		weapon.power();
		costume.protection();
	}

}
