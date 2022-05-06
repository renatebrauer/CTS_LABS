package factoryMethod;

public class Factory implements IFactory {

	@Override
	public IWeapon getWeapon(int price) {

		if(price>200) {
			return new magicWeapon();
		}
		else {
			return new cheapWeapon();
		}
		
	}

}
