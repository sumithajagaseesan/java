package decorator;

public class ChickenDecorator  extends SubstanceDecorator {
	public ChickenDecorator (Pizza decoratedPizza) {
		super(decoratedPizza);
		
	}

	@Override
	public String ingredients() {
	  return decoratedPizza.ingredients()	+ " and " + addChicken();
	  
	}
	private String addChicken() {
		return "Add Chicken to Pizza";
	
	}
}


