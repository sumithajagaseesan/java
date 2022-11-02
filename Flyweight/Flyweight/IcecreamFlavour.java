package Flyweight;

public class IcecreamFlavour {
   private String flavourName;
   public IcecreamFlavour(String flavourName) {
	   this.flavourName = flavourName;
	   
   }
   @Override
   public String toString() {
	   return flavourName;
	   
   }
}
