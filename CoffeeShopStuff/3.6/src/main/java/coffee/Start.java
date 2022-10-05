package coffee;

import java.util.Arrays;
import java.util.Scanner;

public class Start {

	// hook this up to use a scanner to take user input
	// each of 1 to 4 should be implmented in its own sub function
	// should use a while loop to keep displaying the menu until the user selects
	// exit
	// print a menu
	// 1) order item 2) fulfillOrder 3) List menu 4) print total 5) list drinks 6)
	// list food 7) exit

	// -- 1 function that displays the menu, collects the user input, and returns an
	// integer for selection
	// if the user type 1 and hits enter this function will return 1

	// using a while loop ... an if or case statement

	// for example a user enters 1 .. create a function that will ask the user to
	// enter the item name and call
	// the addOrder on the coffee house and return to the main menu
	// then if a user select 4 print to total and go back to the main menu
	//
	// BONUS dont forget some error checking ... if a user enters a letter instead
	// of a number gracefully handle that








	private CoffeeShop coffeeShop = new CoffeeShop();
	private Scanner userInput = new Scanner(System.in);

	public static void main(String[] args) {
		Start m = new Start();
		m.start();
	}

	public void start() {

		// initiate scanner

		boolean activeMenu = true;
		welcome();
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

			default:
				System.out.println("Please select 1-7:  \n");
			}

		}

		// while loop
		// print our list of options
		// 1) order item 2) fulfillOrder 3) List menu 4) print total 5) list drinks 6)
		// list food 7) exit

		// close scanner

//
//        CoffeeShop tcs = new CoffeeShop();
//
//        // put a scanner to allow a person to enter a menu item
//
//        System.out.println(tcs.addOrder("hot cocoa"));
//        System.out.println(tcs.addOrder("iced tea"));
//        System.out.println(tcs.addOrder("cinnamon roll"));
//        System.out.println(tcs.addOrder("iced coffee"));
//        System.out.println(Arrays.toString(tcs.listOrders()));
//        System.out.println(tcs.dueAmount());
//
//        // we know that we have 2 items ordered
//        // so by fulfilling 3 times the 3rd time shuold be all orders fullfilled
//        System.out.println(tcs.fulfillOrder());
//        System.out.println(tcs.fulfillOrder());
//        System.out.println(tcs.fulfillOrder());
//
//        // now we sould get an empty array because we filled all orders
//        System.out.println(Arrays.toString(tcs.listOrders()));
//        System.out.println(tcs.dueAmount());
//
//        System.out.println(tcs.cheapestItem());
//        System.out.println(Arrays.toString(tcs.drinksOnly()));
//        System.out.println(Arrays.toString(tcs.foodOnly()));
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
		String[] orderList = coffeeShop.listOrders();
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

	private void welcome() {
		MenuItem[] menuList = coffeeShop.getMenu();
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
