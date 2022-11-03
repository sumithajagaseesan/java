package decorator;

public class CheeseDecorator extends SubstanceDecorator {
	public CheeseDecorator (Pizza decoratedPizza) {
		super(decoratedPizza);
		
	}
	@Override
	public String ingredients() {
		return decoratedPizza.ingredients () +  "  and   "  + addCheese();
		
	}

	private String addCheese() {
	
			return "Add Cheese to Pizza";
}

	
}
