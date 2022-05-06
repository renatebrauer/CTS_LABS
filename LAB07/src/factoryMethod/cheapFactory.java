package factoryMethod;

public class cheapFactory implements IFactory {

	@Override
	public IWeapon getWeapon(int price) {
		return new cheapWeapon();
	}

}
