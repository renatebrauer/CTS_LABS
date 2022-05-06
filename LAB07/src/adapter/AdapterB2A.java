package adapter;

// B(new) implements, A(old) extends
public class AdapterB2A extends DiscountA implements IDiscountB{

	@Override
	public double calculateDiscountB(Customer c) {
		
		return this.calculateDiscountA(c.getNoOrders());
	}

}
