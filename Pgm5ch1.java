//Brian Reser H787A975	Assignment 1 (#5)
//Program will calculate the depreciation value based on user input

/* Pseudocode
 * 		Define Package
 * 		Import Scanner utility
 * 
 * 		Create public class "BillandTax"
 * 			Nest public void function "main"
 * 
 * 		Function: Main
 * 		Define Variable:
 * 			Floats: depreciation (depre), price, salvage value (salve)
 * 			Integer: years
 * 			Scanner: (input)
 * 				Set Scanner to "System.in"
 * 
 * 		Output: program description
 * 				prompt for price (in dollars)
 * 				prompt for salvage value (in dollars)
 * 				prompt for number of years
 * 		Input: user input for price, salvage, and years
 * 
 * 		Equation: depreciation = (price - salvage value) / years
 * 
 * 		Output: display depreciation value
 * 
 * 		End Main and Program
 */

package main; //Package defined (automatic w/ eclipse)

import java.util.Scanner; //Scanner utility is imported

public class Pgm5ch1	//Class defined
{
	public static void main(String[] args)	//Main function
	{
		float depre, price, salve;		//Floats defined...
		int years;						//...along with the lone integer
		@SuppressWarnings("resource")	//Suppress warning issued for Scanner name ("input") *Suggested by eclipse
		Scanner input = new Scanner(System.in);	//New Scanner(System.in) is given the name "input"
		
		System.out.println("This program will calculate yearly depreciation.");	//Program is explained to user
		
		System.out.println("What's the price (in dollars)? ");	//Prompt for price
		price = input.nextFloat();	//User input price
		System.out.println("What's the salvage value (in dollars)? ");	//Prompt for salvage value
		salve = input.nextFloat();	//User input salvage value
		System.out.println("How many years? ");	//Prompt for years
		years = input.nextInt();	//User input years
		
		depre = (price - salve) / years;	//Depreciation value is computed
		System.out.printf("The yearly depreciation is: $%.2f", depre);	//Depreciation value is printed for user
		
		//End Main
	}
}

//End Program
