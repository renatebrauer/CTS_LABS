package decorator;

public class ProgMain {

	public static void main(String[] args) {
		
		APizza pizzaBasic=new PizzaBasic();
		System.out.println(pizzaBasic.getIngredient()+' '+pizzaBasic.getCost());
		
		APizza pizzaChicken=new PizzaChicken(pizzaBasic);		//request the base pizza
		System.out.println(pizzaChicken.getIngredient()+' '+pizzaChicken.getCost());
	}

}
