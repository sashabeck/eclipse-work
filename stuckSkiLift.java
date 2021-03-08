import java.util.Scanner;

class stuckSkiLift {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		char firstAnswer;
		char secondAnswer;
		char thirdAnswer;
		char fourthAnswer;
		String sixthAnswer;
		char seventhAnswer;
		char eighthAnswer;
		// javaQues is fifth answer
		String javaQues;

		System.out.println("You're stuck on a ski lift with no one around. \nIt's going to get dark soon. \nYour phone is at 2 percent so you may make a 5-second phone call. \nEnter 's' to scream or 'p' to make a phone call.");
		firstAnswer = s.next().charAt(0);

		// Scream will not help you and make you try again
		if (firstAnswer == 's' || firstAnswer == 'S') {
			System.out.println("Screaming does not help you, it only causes a lost voice. Try again.");
			System.exit(0);;
		}

		// calling someone is first option
		else if (firstAnswer == 'p' || firstAnswer == 'P') {
			System.out.println("You chose to call someone. \nYou have 2 percent battery left, so you may only choose one person to call.\nEnter a 'p' for police, a 'm' for mom, or a 'f' for friend.");
			secondAnswer = s.next().charAt(0);

			// if person chooses mom they lose
			if (secondAnswer == 'm' || secondAnswer == 'M') {
				System.out.println("Your mom has hearing issues, and doesn't understand you. \nNow you know no one is going to come rescue you, so you have a panic attack and decide to jump down impulsively. \nThis causes you to break your leg and later on a pack of wolves come to eat you. Try again.");
				System.exit(0);
			}
			// if person chooses police the dont win but dont lose right away
			else if (secondAnswer == 'p' || secondAnswer == 'P') {
				// asks person if they want to jump or stay
				System.out.println("The police understands you but cannot track where you are due to poor connection.\nYou are still left with some hope, so you decide to wait for a bit. Soon it becomes dark and you take off your gloves to reach for your phone. \nSuddenly, both gloves fall to the ground and your hands start to get cold.\nAs the night goes by, you make the decision you will either jump down and grab your gloves or stay put. Enter 'j' to jump or 's' to stay.");
				thirdAnswer = s.next().charAt(0);

				// if person chooses to jump, they lose
				if (thirdAnswer == 'j' || thirdAnswer == 'J') {
					System.out.println("You decide to jump, but break break your neck, back, and legs. \nSoon enough, a black bear comes out and finds his dinner. You. \nTry again.");
					System.exit(0);
				}

				// if person chooses to stay they dont lose yet
				else if (thirdAnswer == 's' || thirdAnswer == 'S')
					System.out.println("Good job. You stayed, and are safer up here. Try to wait a bit.");

				// if they enter anything other than j or s
				else {
					System.out.println("Sorry, I do not understand that. Please enter the letter 'j' to jump or 's' to stay.");
					System.exit(0);
				}
				}

			// if person chooses friend this is the best option
			else if (secondAnswer == 'f' || secondAnswer == 'F')
				System.out.println("Your friend can understand you and knows which town you are skiing in. \nUnfortunately, your phone dies before you can tell her the exact vicinity. \nShe calls the cops once you disconnect, but you don't know how long they will take and if they will be able to find you in time.");

			// if user does not input f, p, or m
			else {
				System.out.println("Sorry, I do not understand that. Please enter the letter 'p' for police, 'f' for friend, or 'm' for mom.");
				System.exit(0);
			}
		} 
		else {
			System.out.println("Sorry, I do not understand that. Please enter the letter 'p' for phonecall or 's' for scream.");
			System.exit(0);
		}
		// jacket gets wet- keeping it on is better, taking it off you lose
		System.out.println("Uh oh! It looks like it is starting to snow. \nYour jacket is getting wet and you start to get cold. \nNow you think taking your jacket off would make you warmer since it is soaked. Enter 't' to take it off or 'k' to keep it on.");
		fourthAnswer = s.next().charAt(0);
			
		// if they chose to take the jacket off or keep it on
		if (fourthAnswer == 't' || fourthAnswer == 'T') {
			System.out.println("Taking off your jacket was the wrong move. \nYou are now colder than before and your jacket has already fallen to the ground. \nTry again.");
			System.exit(0);
		}
		else if (fourthAnswer == 'k' || fourthAnswer == 'K') {
			System.out.println("Using your inner instincts, nice job! \nKeeping your jacket on continues to provide your body with heat once the snow stops.");
		}
		
		else {
			System.out.println("Sorry, I do not understand that. Please enter the letter 't' to take off your jacket or 'k' to keep it on.");

		}
		// searches lift and finds materials for fire left on by someone else, asks
		// coding question so person has chance to create fire
		System.out.println("It is starting to get colder and dark. \nYou decide to search the lift(under the paddings and seats) for anything that might help you. \nFinally, you find a safety box, one that was planted there incase of emergency. \nHowever, to open the lock you need to answer a java question: \"True or false: You can start a variable name with a number.\"");
		javaQues = s.next();
		
		if (javaQues.equalsIgnoreCase("False")) {
			System.out.println("Right answer. \nYou open the kit to find fire-making tools and an extra set of gloves. \nA breath of relief leaves you as your hands were starting to acquire frost bite.");
			System.out.println("That is when you realize: you do not know how to make a fire.\nYou find a paper that gives directions on how to make one in the kit. \nHowever you have to decode a message first. \nIf you decode it incorrectly, you are stuck with just gloves. \nA is 1, B is 2, and so on, commas seperate letters and underscores seperate words. \nThe message you need to decode is: 23,1,9,20_12,15,14,7,5,18_6,15,18_15,16,12,9,3,5.");
			s.nextLine();
			sixthAnswer = s.nextLine();
			if (sixthAnswer.equalsIgnoreCase("Wait longer for police.")) {
				System.out.println("You are correct, the fire is lit and now you are warm and the space around you is bright. \nHowever, you see a single coyote come near the ski lift. It starts to try and climb up. \nYou find a bow and arrow in the kit and you have the chance to shoot at the wild animal. \nDo you want to attempt to kill the coyote now or wait for it to get closer? Enter 'n' to kill it now or 'w' to wait.");
				seventhAnswer = s.next().charAt(0);
				// if person chooses to kill coyote now
				if (seventhAnswer == 'n' || seventhAnswer == 'N') {
					System.out.println("You aim for the coyote and shoot it right in the heart. Score! \nYou then search in the kit for anything else that could help you, which leads you to find a 300 foot lasso. \nYou can use this to bring the coyote up to eat for dinner, or wait longer to see if anyone comes to get you. \nEnter a 'l' to lasso the coyote and bring it up, or a 'n', to stay hungry and wait longer.");
					eighthAnswer = s.next().charAt(0);
					if (eighthAnswer == 'l' || eighthAnswer == 'L') {
							System.out.println("You take the lasso and throw it down to get the loop over the coyote's head. \nIt takes a few tries, but after a few minutes you have successfully caught the coyote. \nNow, you just need to pull it up. \nUnfotunately the coyote weighs three times you amount, and it pulls you down instead. \nYou sit there for a few minutes with a broken leg, arm, and neck until a wolf pack comes over and swallows you for their main meal.");
							System.exit(0);
					}
					//this is the line when they win
					else if (eighthAnswer == 'n' || eighthAnswer == 'N') {
						System.out.println("You have decided not to catch the coyote, and you wait a bit longer. \nSuddenly you hear police sirens and happiness hits you for the first time in what feels like years. \nSuddenly, one hundred people are walking/driving up and down ski mountains to find you. \nOnce you release a weak scream, a couple searching a few yards away hears you. \nThe police rush over and pull out a ladder to climb up and recieve you. Once you are down, you run to go hug your friend and are then rushed to the hospital. \nNow you see why people say \"patience is key\".");
					}
					else {
						System.out.println("I am sorry, I do not understand that. Enter 'l' to lasso the coyote or 'n' to wait longer and stay hungry.");
						System.exit(0);
					}
				}
				// if person chooses to wait to kill the coyote
				else if (seventhAnswer == 'w' || seventhAnswer == 'W')
					System.out.println("You wait for the coyote to come to you. That is when you realize it is too late. The dangerous animal eats you before you instincts have enough time to react.");
			}
			else if(sixthAnswer.equalsIgnoreCase("Wait longer for police")) {
				System.out.println("Oops! You forgot the period. Try again.");
				System.exit(0);
			}
			else {
				System.out.print("Wrong answer, you are stuck with the gloves only. \nIt becomes dark and you cannot see a thing. \nAn hour later you hear a weird noise, and suddenly you are being eaten alive by a bear. Try again.");
				System.exit(0);
			}
		}

		else if (javaQues.equalsIgnoreCase("True")) {
			System.out.println("This is the wrong answer. \nSadly, you are locked out of the kit now. \nYour hands have turned a full color of blue now and soon enough the rest of your body does too. \nYou have died from hypothermia, try again.");
			System.exit(0);
		}
		
		else {
			System.out.println("Sorry, I do not understand that. Please enter \"true\" or \"false\".");
		// If their answer to the code is not correct
		}

	}

}
