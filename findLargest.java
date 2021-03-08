import java.util.*;

public class findLargest {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		
		while(true) {
			int input = s.nextInt();
			if(input == 0) {
				break;
			}
			
			if(input > largest) {
				secondLargest = largest;
				largest = input;
			}
			
			else if(input > secondLargest) {
				secondLargest = input;
			}
		
		}
		
		System.out.println("The largest is " + largest +  ", the second largest is " + secondLargest);
		
	}
	
}
