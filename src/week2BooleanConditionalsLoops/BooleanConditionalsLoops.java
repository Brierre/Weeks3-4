package week2BooleanConditionalsLoops;

public class BooleanConditionalsLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create variable named age and assign it a value of 14
		int age = 14;
		//print the boolean expression age >= 16 to the console and note the results.
		System.out.println(age >= 16);
		
		//change the value of age to 18 and run again.
		age = 18;
		
		System.out.println(age >= 16);
		
		//using a conditional, print "You can drive" if age is greater than or equal to 16
		//and "You cannot drive" otherwise
		//change the value of age and rerun to see the result
		if (age >= 16) {
			System.out.println("You can drive");
		} else {
			System.out.println("You cannot drive");
		}
		
		//add a new variable called hasLicense before the conditional
		//change the boolean expression in the conditional to additionally include the need for hasLicense to be true
		//try changing the values of age and hasLicense and note the different results
		
		boolean hasLicense = false;
		if (age >= 16 && hasLicense) {
			System.out.println("You can drive");
		} else {
			System.out.println("You cannot drive");
		}
		
		//create two new variables, costOfMilk and thirstLevel
		//create a new conditional that prints "Milk Please" if costOfMilk is less than 2.50
		//or if thirstLevel is greater than 6 and prints "No Thanks" otherwise
		//change the values and note the different results
		double costOfMilk = 2.60;
		int thirstLevel = 5;
		if (costOfMilk < 2.50 || thirstLevel > 6) {
			System.out.println("Milk Please");
		} else {
			System.out.println("No Thanks");
		}
		
		//create two variables called numberOfCookies and numberOfChildren
		//you will evenly distribute all of the cookies to the children and as the adult
		//you get to keep the remaining cookies to yourself
		//use a conditional to print the following based on the following conditions:
		//if there are 0 cookies remaining, print "Sad Face"
		//if there are less than 2 cookies, print "Yes!"
		//if there are less than 5 cookies, print "Whoohoooo!"
		//if there are 5 or more cookies, print "Jackpot!"
		int numberOfCookies = 17;
		int numberOfChildren = 5;
		int leftovers = (numberOfCookies % numberOfChildren);
		if (leftovers == 0) {
			System.out.println("Sad Face");
		} else if (leftovers < 2) {
			System.out.println("Yes!");
		} else if (leftovers < 5) {
			System.out.println("Whoohoooo!");
		} else {
			System.out.println("Jackpot!");
		}
		
		//create a variable called loyaltyMemberStatus and assign the value "SILVER"
		String loyaltyMemberStatus = "SILVER";
		//create a variable called loyaltyMemberDiscount and assign the value of 0.0
		double loyaltyMemberDiscount = 0.0;
		//using a switch, set the value of loyaltyMemberDiscount based on the following loyaltyMemberStatus scale
		switch(loyaltyMemberStatus) {
		//"SILVER" is 0.10, "GOLD" is 0.15, and "PLATINUM" is 0.25
			case "SILVER":
				loyaltyMemberDiscount = .10;
				break;
			case "GOLD":
				loyaltyMemberDiscount = .15;
				break;
			case "PLATINUM":
				loyaltyMemberDiscount = .25;
				break;			
		}
		System.out.println("Discount is " + (loyaltyMemberDiscount * 100) + "%. Thank you for being a valued " + loyaltyMemberStatus + " customer.");

		
		//create a variable called billTotal and assign a value
		double billTotal = 600.00;
		//create a variable called adjustedTotal and assign it the billTotal minus the loyaltyMemberDiscount percent of the billTotal
		double adjustedTotal = (billTotal - (billTotal*loyaltyMemberDiscount));
		System.out.println("Adjusted total is: " + adjustedTotal);
		//if the adjustedTotal is greater than $500 upgrade the loyaltyMemberStatus from SILVER to GOLD or from GOLD to PLATINUM
		if (adjustedTotal > 500) {
			if (loyaltyMemberStatus == "SILVER") {	
				loyaltyMemberStatus = "GOLD";
				
			} else if (loyaltyMemberStatus == "GOLD") {
				loyaltyMemberStatus = "PLATINUM";
			}
			System.out.println("Congratulations! You have earned " + loyaltyMemberStatus + " level discounts.");
		}
		
		//create two variables, username and password
		String username = "Tommy123";
		String password = "12345";
		//create a conditional that prints "login successful" if the username is "Tommy123" and the password is "12345"
		//otherwise, print "access denied"
		//12345?! That sounds like the kind of code an idiot would use on his luggage!
		if (username.equals("Tommy123") && password.equals("12345")) {
			System.out.println("login successful");
		} else {
			System.out.println("access denied");
		}
		
		//write a for loop that prints each number from 0 to 9
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		//write a for loop that prints each number from 10 to 0 backwards
		for (int j = 10; j >= 0; j--) {
			System.out.println(j);
		}
		
		//write a for loop that prints every other number from 0 to 100
		for (int k = 0; k <= 100; k+= 2) {
			System.out.println(k);
		}
		
		//write same result another way
		for (int k = 0; k <= 100; k++) {
			if (k % 2 == 0) {
			System.out.println(k);
			}
		}
		
		//write a for loop that iterates from 0 to 100 and prints "EVEN" if the number is even and "ODD" if it's odd
		for (int m = 0; m <= 100; m++) {
			if (m % 2 == 0) {
				System.out.println(m + ": EVEN");
			} else {
				System.out.println(m + ": ODD");
			}
		
		}
		
		//write a while loop that starts at 100 and iterates backwards by 1 until it reaches 0
		//divide each number by 3 and print the remainder to the console
		int n = 100;
		while (n > 0) {
			System.out.println(n + "/3: remainder " + (n % 3));
			n--;
		}
		
		int numToAdd = 4;
		int howManyTimes = 7;
		int sumResult = 0;
		
		do {
			sumResult += numToAdd;
			howManyTimes--;
		} while (howManyTimes > 0);
		System.out.println(sumResult);
		
		String userWord = "Mineral";
		int wordLength = userWord.length();
		int counter = wordLength;
		
		do {
			System.out.println(userWord);
			if (wordLength < 5) {
				break;
			}
			counter--;
		} while (counter > 0);
		
	}
}
