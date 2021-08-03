package changeCalc;

import java.util.Scanner;

public class CoinTask {

	static int changeTotal, penny, twoPence, fivePence, tenPence, twentyPence, fiftyPence, onePound, twoPound,
			fivePound, tenPound, twentyPound;
	static double payed, price;

//changed the static int to static double, idiot
	public static void main(String args[]) {

//create a new scanner for console input at this stage
		Scanner newScanner = new Scanner(System.in);

//info needed from console input through newScanner
		System.out.println("Enter the price of the item in £'s ");
		price = newScanner.nextDouble();
		System.out.println("Enter amount taken for payment in £'s ");
		payed = newScanner.nextDouble();

		int priceInt = (int) (price * 100);
		int payedInt = (int) (payed * 100);

// working from the lowest denomination define each coin/item as a penny
		penny = 1;
		twoPence = 2;
		fivePence = 5;
		tenPence = 10;
		twentyPence = 20;
		fiftyPence = 50;
		onePound = 100;
		twoPound = 200; 
		fivePound = 500;
		tenPound = 1000;
		twentyPound = 2000;
// make an array to store the variables in 
		int[] currencyArray = { penny, twoPence, fivePence, tenPence, twentyPence, fiftyPence, onePound, twoPound,
				fivePound, tenPound, twentyPound };
// start the change counter 		
		int[] changeCount = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
// if statements to determine failed / default outputs
		if (payed > price) {
			changeTotal = payedInt - priceInt;
		}
		if (price > payed) {
			System.out.println("You need a bit more dollar brother");
			System.exit(1);
		}
// error on array length should this be 10 not 11 as creating up to 11 gives an error length, i have 11
		for (int i = 10; i >= 0; i--) {
			int remainder = changeTotal % currencyArray[i];
			if (remainder < changeTotal) {
				changeCount[i] = (changeTotal - remainder) / currencyArray[i];
				changeTotal = remainder;
			}
		}
// results to provide answer
		System.out.println("Your change can be broken down as follows: ");
		System.out.println("Twenty Squids: " + changeCount[10]);
		System.out.println("Tenners: " + changeCount[9]);
		System.out.println("Deep Sea Divers: " + changeCount[8]);
		System.out.println("Two pounds: " + changeCount[7]);
		System.out.println("Squids: " + changeCount[6]);
		System.out.println("Fiddies: " + changeCount[5]);
		System.out.println("20p: " + changeCount[4]);
		System.out.println("10p: " + changeCount[3]);
		System.out.println("5p: " + changeCount[2]);
		System.out.println("Tuppence: " + changeCount[1]);
		System.out.println("Penny: " + changeCount[0]);
	}
}
