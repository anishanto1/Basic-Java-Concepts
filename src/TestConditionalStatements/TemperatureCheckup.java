package TestConditionalStatements;

import java.util.Scanner;

/*Temperature Check: Write a program that checks the temperature and prints whether it is "Cold", "Warm", or "Hot". For example:

Below 0°C: "Cold"
0°C to 20°C: "Warm"
Above 20°C: "Hot" */

public class TemperatureCheckup {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The temprature values in C  : ");
		
		Double temprature = scan.nextDouble();
		
		if (temprature <0) {
			System.out.println("Cold");
		} 
		else if (temprature >0 && temprature <=20) {
			System.out.println("Warm");
		}
		else
		{
			System.out.println("Hot");
		}
	}

}
