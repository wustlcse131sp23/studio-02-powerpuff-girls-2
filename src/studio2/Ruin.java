package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {

		// find the variables

		Scanner in = new Scanner(System.in);
		System.out.println("What is your starting amount of money?");
		int startAmount = in.nextInt();
		System.out.println("What is your chance to win?");
		double winChance = in.nextDouble();
		System.out.println("What is your success limit?");
		double winLimit = in.nextInt();
		System.out.println("How many days will you be playing?");
		double totalSimulations = in.nextInt();
		
		int days = 1;

		
	

		// start the loopsfor a number of days
		
		for ( days = 1; days <= totalSimulations ; days++ ) {
			
			// reset your values on a new day
			
			int money = startAmount;
			int totalPlays = 0;
			
			

			// while you still have money and have not lost, check if you won and change money
			
			while (money > 0 && money < winLimit) {

				if ( Math.random() < winChance ){

					money++;

				} else {
					
					money--;}
				
				// how many games have you played?

				totalPlays = totalPlays + 1; }

		// once loop finishes, check whether or not you are ruined

		if (money == winLimit)
		{
			System.out.println("On day " + days + " you have played " + totalPlays + " times and done the impossible."); 
			
		} else {
			System.out.println("On day " + days + " you have played " + totalPlays + " times and are ruined!"); 
			}
		
		// and now the day repeats
		}

	}

}
