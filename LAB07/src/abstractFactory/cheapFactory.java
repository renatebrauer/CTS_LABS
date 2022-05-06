package abstractFactory;

public class cheapFactory implements IFactory {

	@Override
	public IWeapon getWeapon() {
		return new cheapWeapon();
	}

	@Override
	public ICostume getCostume() {
		return new cheapCostume();
	}

}
