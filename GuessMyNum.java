import java.util.*; 

public class GuessMyNum {
	//randomNumber = random.nextInt(endRange - startRange + 1) + startRange;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int tries, count = 1; 
		int randNum = (int)(Math.random() * 100) + 1;
		
		System.out.println("Guess a positive integer from 1 to 100. \nHow many tries do you need?");
		tries = s.nextInt();
		System.out.println("You have " + tries + " tries to guess my number. \nHave fun!");
		
		while(true) {
		int input = s.nextInt();
		
		if(input < 1 || input > 100) {
			System.out.println("Please enter a number within the range");
			continue;
		}
		count++;
		
		if(randNum != input) {
			if(input < randNum)
				System.out.println("Number is too low");
			else
				System.out.println("Number is too high");
		}
		
		else {
			System.out.println("Correct answer. It took you " + count + " tries to guess my number.");
			System.out.println("Would you like to play again? Enter y for yes or n for no");
			char reponse = s.next().charAt(0);
			if(reponse == 'y'){
				count = 0;
				randNum = (int)(Math.random() * 100) + 1;
			}
			else {
				System.out.println("Thanks for playing, have a good day!");
				break;
			}
			
		}
		
		if(count > tries) {
			System.out.println("You exceeded your number of tries. Bye bye.");
			System.exit(0);
		}
		
		}
	}
}
