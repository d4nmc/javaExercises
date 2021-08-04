package ordersExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrdersClass {
	
	public static List<String> orderList = new ArrayList<>();

	String size =0; 
	String type =0;
	String extra =0; 
	
//create a new scanner for console input 
	Scanner orderScanner = new Scanner(System.in);

//info needed from console input through newScanner
	System.out.println("Enter the size of your drink: ");
	size = newScanner.nextString();
	System.out.println("Enter the type of your drink: ");
	type = newScanner.nextString();
	System.out.println("Enter what extras you'd like: ");
	extra = newScanner.nextString();	
	
// Create

	public static void addOrder(String orderName) {
		orderList.add(orderName);

	}

// Read
	public static void getOrder(int orderNumber) {
		System.out.println(orderList.get(orderNumber));

	}

// Update
	public static void updateOrder(int orderNumber, String orderName) {
		orderList.set(orderNumber, orderName);

	}

// Delete
	public static void deleteOrder(int orderNumber) {
		orderList.remove(orderNumber);

	}

// ReadAll
	public static void getAllOrder() {
		System.out.println(orderList);
	}

}
