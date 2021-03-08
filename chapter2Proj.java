import java.util.*;

public class chapter2Proj {
	
	public static void main(String[] args) {
	
	Scanner s = new Scanner(System.in);
	
	//1. Integer Division with remainders
	//user inputs numbers that are being divided 
	int num1, num2;
	System.out.println("Enter 2 numbers to be divided.");
	num1 = s.nextInt();
	num2 = s.nextInt();
	
	System.out.print("The quotient is " + num1/num2);
	if(num1%num2 != 0)
		System.out.print(" r " + num1%num2);
	
	
	//2. Slope
	//four numbers of the graph, x1 and x2 are the x values and y1 and y2 are the y values
	double x1, y1, x2, y2;
	System.out.println("Input coordinates of two points on a graph, 4 numbers in total.");
	x1 = s.nextDouble();
	y1 = s.nextDouble();
	x2 = s.nextDouble();
	y2 = s.nextDouble();
	
	//calculating the slope
	double slope = (y2-y1)/(x2-x1);
	
	System.out.println("The slope is " + slope);
	
	
	//3. Type of triangle
	double side1, side2, side3;
	System.out.println("Enter a length for each side of a triangle. Make sure to put a space between each number.");
	side1 = s.nextDouble();
	side2 = s.nextDouble();
	side3 = s.nextDouble();
	
	if(side1 == side2 && side1 == side3) {
		System.out.println("The triangle is an equilateral.");
	}
	if(side1 != side2 && side1 != side3 && side2 != side3) {
		System.out.println("The triangle is a scalene.");
	}
	if(side1 == side2 && side1 != side3 || side2 == side3 && side2 != side1 || side3 == side1 && side2 != side3) {
		System.out.println("The triangle is an isosceles.");
	}
	
	//4. Sink or float
	double mass, vol;
	System.out.println("Enter the mass and volume of your object.");
	mass = s.nextDouble();
	vol = s.nextDouble();
	
	if(mass/vol < 1) 
		System.out.println("Your object will float.");
	else 
		System.out.println("Your object will sink.");
	
	// 5. Metric coversion
	char choice;
	double P, F, M;
	
	System.out.println("Enter a P to convert to newtons, F to convert to meters, or M to convert to kilometers.");
	choice = s.next().charAt(0);
	
	if(choice == 'P') {
		System.out.println("Enter number of pounds.");
		P = s.nextDouble();
		
		System.out.println(P + " pounds is " + P*4.45 + " newtons.");
	}
	else if(choice == 'F') {
		System.out.println("Enter number of feet.");
		F = s.nextDouble();
		
		System.out.println(F + " feet is " + F*3.28 + " meters.");
	}
	else if(choice == 'M') {
		System.out.println("Enter number of meters.");
		M = s.nextDouble();
		
		System.out.println(M + " meters is " + M*1.61 + " kilometers.");
	}
	else
		System.out.println("Sorry I didn't understand that. Please enter  a P to convert to newtons, F to convert to meters, or M to convert to kilometers.");
	
	
	//6. Weigh yourself on another planet
	double weight;
	String planetName;
	System.out.println("Enter your weight.");
	weight = s.nextDouble();
	System.out.println("Enter the planet you want to be weighed on. The choices are: ");
	System.out.println("Earth");
	System.out.println("Jupiter");
	System.out.println("Mars");
	System.out.println("Mercury");
	System.out.println("Neptune");
	System.out.println("Pluto");
	System.out.println("Saturn");
	System.out.println("Uranus");
	System.out.println("Venus");
	planetName = s.next();
	planetName = planetName.toLowerCase();
	
	switch(planetName) {
	case "earth": {
		System.out.println("Your weight on " + planetName + " is " + weight);
		break;
	}
	case "jupiter": {
		System.out.println("Your weight on " + planetName + " is " + weight*2.65);
		break;
	}
	case "mars": {
		System.out.println("Your weight on " + planetName + " is " + weight*.39);
		break;
	}
	case "mercury": {
		System.out.println("Your weight on " + planetName + " is " + weight*.38);
		break;
	}
	case "neptune": {
		System.out.println("Your weight on " + planetName + " is " + weight*1.23);
		break;
	}
	case "pluto": {
		System.out.println("Your weight on " + planetName + " is " + weight*.05);
		break;
	}
	case "saturn": {
		System.out.println("Your weight on " + planetName + " is " + weight*1.17);
		break;
	}
	case "uranus": {
		System.out.println("Your weight on " + planetName + " is " + weight*1.05);
		break;
	}
	case "venus": {
		System.out.println("Your weight on " + planetName + " is " + weight*.78);
		break;
	}
	default: {
		System.out.println("Invalid input.");
	}
	}
	
	
	}
}
	


