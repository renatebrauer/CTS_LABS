package abstractFactory;

public class magicFactory implements IFactory {

	@Override
	public IWeapon getWeapon() {
		return new magicWeapon();
	}

	@Override
	public ICostume getCostume() {
		return new magicCostume();
	}
	

}
