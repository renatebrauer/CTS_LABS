package decorator;

//can be an abstract class or an interface
public abstract class APizza {

	private String name;
	private float price;
	public abstract String getIngredient();
	public abstract float getCost();
}
