package ordersExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrdersClass {
	

//	
//// treat what ive got as string as a separate object and go from there, coffee.size / coffee.type / coffee.extra
//
////	String size =0; 
////	String type =0;
////	String extra =0; 
//	
//// Create a new scanner for console input 
//	
//	Scanner orderScanner = new Scanner(System.in);
//
//// Info needed from console input through newScanner
//	
//	System.out.println("Enter the size of your drink: ");
//	size = newScanner.nextString();
//	System.out.println("Enter the type of your drink: ");
//	type = newScanner.nextString();
//	System.out.println("Enter what extras you'd like: ");
//	extra = newScanner.nextString();	

	
	
	public static List<String> Orders = new ArrayList<>();
	
// Create

	public static void addOrder(String orderName) {
		Orders.add(orderName);

	}

// Read
	public static void getOrder(int orderNumber) {
		System.out.println(Orders.get(orderNumber));

	}

// Update
	public static void updateOrder(int orderNumber, String orderName) {
		Orders.set(orderNumber, orderName);

	}

// Delete
	public static void deleteOrder(int orderNumber) {
		Orders.remove(orderNumber);

	}

// ReadAll
	public static void getAllOrder() {
		System.out.println(Orders);
	}

	
}
