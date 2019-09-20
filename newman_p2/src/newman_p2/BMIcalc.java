package newman_p2;

import java.util.Scanner;

public class BMIcalc {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Welcome to the BMI Calculator\nTo get started please press:\n1: for pounds/ inches\n2: for kilograms/ meters");
		//get choice
		int userChoice;
		userChoice = scnr.nextInt();
		//var declaration
		int weight, height;
		double bmi=0;
		//Collect weight and height
		System.out.println("Please enter your body weight: ");
		weight = scnr.nextInt();
		System.out.println("Please enter your height: ");
		height = scnr.nextInt();
		//BMI Calcs
		if(userChoice == 1) {
			bmi = (703 * weight)/(Math.pow(height, 2));
		}
		if(userChoice == 2) {
			bmi = (weight)/(Math.pow(height, 2));
		}
		//final print out
		System.out.printf("Your BMI is: %.1f\n" , bmi);// had to set compiler compliance level to 1.5 in order to get this to function
		if(bmi < 18.5) System.out.println("You are in the Category: Underweight");
		if(bmi >= 18.5 && bmi <=24.9) System.out.println("You are in the Category: Normal weight");
		if(bmi >= 25 && bmi<= 29.9) System.out.println("You are in the Category: Overweight");
		if(bmi >= 30) System.out.println("You are in the Category: Obesity");
		System.out.println("");
		System.out.println("BMI Categorys: ");
		System.out.println("Underweight: Less than 18.5");
		System.out.println("Normal Weight: 18.5 - 24.9");
		System.out.println("Overweight: 25 - 29.9");
		System.out.println("Obesity: 30 or greater ");
		scnr.close();
	}

}
