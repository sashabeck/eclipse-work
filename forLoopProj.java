import java.util.*;

public class forLoopProj {
	
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		System.out.println("Which program would you like to use?");
		System.out.println("1. Print a list of the positive integers less than 500 that are divisible by either 5 or 7");
		System.out.println("2. Print sum of 10 numbers");
		System.out.println("3. PrintS average of positive and negative numbers separately");
		System.out.println("4. Print factorial of user's input");
		System.out.println("5. Calculate daily salary and total over thirty days");
		int choose = s.nextInt();
		
		if(choose == 1) {
		//1. Print a list of the positive integers less than 500 that are divisible by either 5 or 7.
		//initialize variable count that will print amount of numbers divisble by 5 or 7 at end
		int count = 0;
		//for loop to go through numbers 1 to 500
		for(int i = 1; i < 500; i++) {
			//find if the num is divisible by 5 or 7
			if(i%5 == 0 || i%7 == 0) {
				System.out.println(i);
				count++;
			}
		}
		//prints count at end
		System.out.println("The number of integers that are divisible by 5 or 7 are " + count);
		}
		
		else if(choose == 2) {
		//2. Print sum of 10 numbers. 
		//Initializes the sum variable that adds 10 nums tg and prints at end
		double sum = 0;
		System.out.println("Enter 10 numbers");
		//for loop to collect the 10 numbers and add each one to the sum
		for(int i = 0; i < 10; i++) {
			double nums = 0;
			nums = s.nextDouble();
			sum += nums;
		}
		//print sum
		System.out.printf("These ten numbers have a sum of %.2f", sum);
		}
		
		else if(choose == 3) {
		//3. prints average of positive and negative numbers separately
		//initialze the count of positive and negative and the sum of them
		double numNeg = 0, numPos = 0, sumNeg = 0, sumPos = 0;
		System.out.println("Input 10 real numbers");
		//for loop to take in input
		for(int i = 0; i < 10; i++) {
			double input = 0;
			input = s.nextDouble();
			//if input is neg then count how many negative numbers and find sum
			if(input < 0) {
				numNeg++;
				sumNeg += input;
			}
			//if input is pos then count how many positive numbers and find sum
			else {
				numPos++;
				sumPos += input;
			}
		}
		//print avg of both
		System.out.printf("The average of the positive inputs is %.2f\n", sumPos/numPos);
		System.out.printf("The average of the negative inputs is %.2f", sumNeg/numNeg);
		}
		
		else if(choose == 4) {
		//4. factorial of user's input		
		int num, fact = 1;
		System.out.println("Input integer to multiply all positive integers before it");
		num = s.nextInt();
		for(int i = 1; i <= num; i++) {
			//multiplies every number below the input by each other
			fact *= i;
		}
		//prints the answer
		System.out.println("The factorial of " + num + " is " + fact);
		}
		
		else if(choose == 5) {
		//5. calculate daily salary and total over thirty days
		//initialize the day number, daily earning, total earning
		int dayNum = 0;
		double daily = .01, total = 0;
		//labels
		System.out.println("  Day number        Daily Salary        Total Earned  ");
		System.out.println("________________________________________________________");
		//adds day, multiplies daily earning by two, adds yesterday to today
		for(int i = 1; i < 31; i++) {
			dayNum++;
			daily*=2;
			total+=daily;
			//printf function to print only 2 decimal points
			System.out.printf("______%d_________________$%.2f______________$%.2f______\n", dayNum, daily, total);
			
		}
		}
		
				

	}
}
