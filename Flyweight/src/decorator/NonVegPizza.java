package decorator;

public class NonVegPizza implements Pizza{
	
	
	public String size() {
		return "Big";
		
	}

	
	public String ingredients() {
		return "Mutton";
		
	}
}
