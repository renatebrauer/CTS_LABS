package factoryMethod;

public class magicFactory implements IFactory {

	@Override
	public IWeapon getWeapon(int price) {
		return new magicWeapon();
	}
	

}
