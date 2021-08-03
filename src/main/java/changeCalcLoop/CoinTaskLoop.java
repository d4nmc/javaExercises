package changeCalcLoop;

import java.util.Scanner;

public class CoinTaskLoop {

	public static void main(String args[]) {
		

	Scanner newScanner = new Scanner(System.in);

	System.out.println("Enter the price of the item in £'s: ");
	double price = newScanner.nextDouble();
	System.out.println("Enter amount taken for payment in £'s: ");
	double paid = newScanner.nextDouble();	
		
		int fiftyPounds=0;
		int twentyPounds=0;
		int tenPounds=0;
		int fivePounds=0;
		int twoPounds=0;
		int onePound=0;
		int fiftyPence=0;
		int twentyPence=0;
		int tenPence=0;
		int fivePence=0;
		int twoPence=0;
		int penny=0;
		double change = paid - price;
		
	System.out.println("You spent £" + price + " paid for with £" + paid);
		
		while (change > 0) {

			if (change>=50 ) {
				fiftyPounds++;
				change-=50;
			}	
			else if (change>=20 ) {
				twentyPounds++;
				change-=20;
					
			}
			else if (change>=10 ) {
				tenPounds++;
				change-=5;
				
			}
			else if (change>=5 ) {
				fivePounds++;
				change-=5;
				
			}
			else if (change>=2 ) {
				twoPounds++;
				change-=2;
				
			}
			else if (change>=1 ) {
				onePound++;
				change-=1;
				
			}
			else if (change>=0.5 ) {
				fiftyPence++;
				change-=0.5;
				
			}
			else if (change>=0.2 ) {
				twentyPence++;
				change-=0.2;
				
			}
			else if (change>=0.1 ) {
				tenPence++;
				change-=0.1;
				
			}
			else if (change>=0.05 ) {
				fivePence++;
				change-=0.05;
				
			}
			else if (change>=0.2 ) {
				twoPence++;
				change-=0.2;
				
			}
			else if (change>=0.1 ) {
				fiftyPence++;
				change-=0.1;
				
			}
		}	
		System.out.println("£50 x " + fiftyPounds);
		System.out.println("£20 x " + twentyPounds);
		System.out.println("£10 x " + tenPounds);
		System.out.println("£5 x " + fivePounds);
		System.out.println("£2 x " + twoPounds);
		System.out.println("£1 x " + onePound);
		System.out.println("50p x " + fiftyPence);
		System.out.println("20p x " + twentyPence);
		System.out.println("10p x " + tenPence);
		System.out.println("5p x " + fivePence);
		System.out.println("2p x " + twoPence);
		System.out.println("1p x " + penny);
}
}


