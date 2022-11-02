package decorator;

public abstract class SubstanceDecorator implements Pizza {
	protected Pizza decoratedPizza;
	public SubstanceDecorator (Pizza decoratedPizza) {
	
	this.decoratedPizza = decoratedPizza;
}
public String size() {
	return decoratedPizza.size();
}
public String ingredients() {
	return decoratedPizza.ingredients();
	
}


}
