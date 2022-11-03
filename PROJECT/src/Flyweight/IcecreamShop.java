package Flyweight;
import java.util.ArrayList;

public class IcecreamShop {
	private final ArrayList<IcecreamOrder> icecreamOrders = new ArrayList<IcecreamOrder>();
	private final IcecreamMenu  icecreamMenu = new IcecreamMenu();
	private void getIcecreamOrder(String flavourName, int tableNumber) {
		 IcecreamFlavour flavour = icecreamMenu.lookup(flavourName);
		 IcecreamOrder order = new IcecreamOrder(tableNumber, flavour);
         icecreamOrders.add(order);
	}
	private void icecreamService() {
		for (IcecreamOrder icecreamOrder : icecreamOrders) {
			icecreamOrder.serveIcecream();
		}
	}
	private String report() {
		return "Total number of Icecream flavour served :" + icecreamMenu.totalIcecreamFlavours();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IcecreamShop icecreamShop = new IcecreamShop();
		icecreamShop .getIcecreamOrder("vanilla",3);
		icecreamShop .getIcecreamOrder("Butter Scotch",15);
		icecreamShop .getIcecreamOrder("Cone",7);
		icecreamShop .getIcecreamOrder("Mango",5);
		icecreamShop .getIcecreamOrder("Pineapple",4);
        icecreamShop .getIcecreamOrder("Two in One",7);
		icecreamShop .getIcecreamOrder("Butter Milk",8);
		icecreamShop .getIcecreamOrder("Lemon",10);
		icecreamShop .getIcecreamOrder("Chocolate",12);
		icecreamShop.icecreamService();
		System.out.println(icecreamShop.report());
	}
}


