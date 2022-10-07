package coffee;

import java.util.List;
import java.util.Scanner;

public class Start {


	private CoffeeShop coffeeShop = new CoffeeShop();
	private Scanner userInput = new Scanner(System.in);

	public static void main(String[] args) {
		Start m = new Start();
		m.start();
	}

	public void start() {

		// initiate scanner

		boolean activeMenu = true;
		displayMenu();
		while (activeMenu) {

			int menuSelection = showMenu();

			switch (menuSelection) {
			case 1:
				addOrderMenu();
				break;

			case 2:
				fulfillOrderPrompts();
				break;

			case 3:
				showCurrentOrders();
				break;

			case 4:
				double total = coffeeShop.dueAmount();
				System.out.println("Total due is: " + total);
				break;

			case 5:
				displayDrinks();
				break;

			case 6:
				displayFood();
				break;

			case 7:
				System.out.println("Goodbyeeee :)");
				activeMenu = false;
				break;
			case 8:
				System.out.println("Please enter the order to delete: ");
				String orderToDelete = userInput.nextLine();
				coffeeShop.deleteFirstInstanceOfOrder(orderToDelete);
				break;
			case 9:
				displayMenu();
			default:
				System.out.println("Please select 1-7:  \n");
			}

		}

	}

	private void displayFood() {
		String[] foods = coffeeShop.foodOnly();
		System.out.println("Here is our food! \n");
		for (String food : foods) {
			System.out.println(food);
		}
		System.out.println("\n \n");
	}

	private void displayDrinks() {
		String[] drinks = coffeeShop.drinksOnly();
		System.out.println("Here are our drinks! \n");
		for (String drink : drinks) {
			System.out.println(drink);
		}
		System.out.println("\n \n");
	}

	private void showCurrentOrders() {
		List<String> orderList = coffeeShop.listOrders();
		System.out.println("Here are our your current orders! \n");
		for (String order : orderList) {
			System.out.println(order);

		}
		System.out.println("\n \n");
	}

	private void fulfillOrderPrompts() {
		String fulfillment = coffeeShop.fulfillOrder();
		System.out.println(fulfillment);
		System.out.println("\n \n");
	}

	private void displayMenu() {
		List<MenuItem> menuList = coffeeShop.getMenu();
		System.out.println("\t Welcome to BVD's coffee shop! \n");
		System.out.println("\t Here are our menu items! \n");
		System.out.println("\t ------------------------------------------------");
		for (MenuItem item : menuList) {
			System.out.println("\t" + item.getItem());

		}
		System.out.println("\t ------------------------------------------------");
		System.out.println("\n \n");
	}

	private int showMenu() {
		System.out.println("\t What would you like to do? (enter the number)\n");
		System.out.println("\t\t 1) order item");
		System.out.println("\t\t 2) fulfillOrder");
		System.out.println("\t\t 3) List orders");
		System.out.println("\t\t 4) print total");
		System.out.println("\t\t 5) list drinks");
		System.out.println("\t\t 6) list food");
		System.out.println("\t\t 7) exit");
		System.out.println("\t\t 8) delete order");
		System.out.println("\t\t 9) show menu");

		int menuSelection = userInput.nextInt();
		userInput.nextLine();
		return menuSelection;
	}

	private void addOrderMenu() {
		System.out.println("enter menu item below! \n");
		String menuItem = userInput.nextLine();
		String orderResult = coffeeShop.addOrder(menuItem);
		System.out.println(orderResult);
	}

}
