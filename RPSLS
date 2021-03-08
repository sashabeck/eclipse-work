import java.util.*;

public class RPSLS {

	public static void main(String[] args) {
	//1 – rock  2- paper, 3 – scissors, 4 – lizard, 5 – Spock
	/*Scissors cuts paper
    Paper covers rock
    Rock crushes lizard
    Lizard poisons Spock
    Spock smashes scissors
    Scissors decapitates lizard
    Lizard eats paper
    Paper disproves Spock
    Spock vaporizes rock
    Rock crushes scissors*/
		
	Scanner s = new Scanner(System.in);
	int countP = 0, countC = 0, move = 0;
	while(true) {
	System.out.println("Enter a number for your move. \n1 = rock,  2 =paper, 3 = scissors, 4 = lizard, 5 = Spock. Enter 6 to stop playing.");
	move = s.nextInt();
	if(move > 6 || move < 1) {
		System.out.println("Please enter a number 1-5.");
		continue;
	}
	int comp = (int)(Math.random()*5)+1;
	
	if(move == 6) {
		System.out.println("Computer's score: " + countC);
		System.out.println("Your score: " + countP);
			if(countC > countP) {
				System.out.println("Computer won.");
			}
			else
				System.out.println("You won.");
			System.out.println("Good game!");
		System.exit(0);
	}

	if(comp == 1) {
		System.out.println("Computer plays 1: rock.");
	}
	
	if(comp == 2) {
		System.out.println("Computer plays 2: paper.");
	}
	
	if(comp == 3) {
		System.out.println("Computer plays 3: scissors.");
	}
	
	if(comp == 4) {
		System.out.println("Computer plays 4: lizard.");
	}
	
	if(comp == 5) {
		System.out.println("Computer plays 5: spock.");
	}
	
	if(comp == 1 && move == 2) {
		countP++;
		System.out.println("Paper covers rock. You win.");
	}
	
	if(comp == 2 && move == 1) {
		countC++;
		System.out.println("Paper covers rock. Computer wins.");
	}
	
	if(comp == 1 && move == 3) {
		countC++;
		System.out.println("Rock crushes scissors. Computer wins.");
	}
	
	if(comp == 3 && move == 1) {
		countP++;
		System.out.println("Rock crushes scissors. You win.");
	}
	
	if(comp == 1 && move == 4) {
		countC++;
		System.out.println("Rock crushes lizard. Computer wins.");
	}
	
	if(comp == 4 && move == 1) {
		countP++;
		System.out.println("Rock crushes lizard. You win.");
	}
	
	if(comp == 1 && move == 5) {
		countP++;
		System.out.println("Spock vaporizes rock. You win.");
	}
	
	if(comp == 5 && move == 1) {
		countC++;
		System.out.println("Spock vaporizes rock. Computer wins.");
	}
	
	if(comp == 2 && move == 3) {
		countP++;
		System.out.println("Scissors cuts paper. You win.");
	}
	
	if(comp == 3 && move == 2) {
		countC++;
		System.out.println("Scissors cuts paper. Computer wins.");
	}
	
	if(comp == 2 && move == 4) {
		countP++;
		System.out.println("Lizard eats paper. You win.");
	}
	
	if(comp == 4 && move == 2) {
		countC++;
		System.out.println("Lizard eats paper. Computer wins.");
	}
	
	if(comp == 2 && move == 5) {
		countC++;
		System.out.println("Paper disproves Spock. Computer wins.");
	}
	
	if(comp == 5 && move == 2) {
		countP++;
		System.out.println("Paper disproves Spock. You win.");
	}
	
	if(comp == 3 && move == 4) {
		countC++;
		System.out.println("Scissors decapitates lizard. Computer wins.");
	}
	
	if(comp == 4 && move == 3) {
		countP++;
		System.out.println("Scissors decapitates lizard. You win.");
	}
	
	if(comp == 3 && move == 5) {
		countP++;
		System.out.println("Spock smashes scissors. You win.");
	}
	
	if(comp == 5 && move == 3) {
		countC++;
		System.out.println("Spock smashes scissors. Computer wins.");
	}
	
	if(comp == 4 && move == 5) {
		countC++;
		System.out.println("Lizard poisons Spock. Computer wins.");
	}
	
	if(comp == 5 && move == 4) {
		countP++;
		System.out.println("Lizard poisons Spock. You win.");
	}
	
	if(comp == move) {
		System.out.println("You both chose " + move + ". Tied round.");
	}

	
		
		
		
	//System.out.println((int)(Math.random()*5)+1);
	
	}
	}

}
