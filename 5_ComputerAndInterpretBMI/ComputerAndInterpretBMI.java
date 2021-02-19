/*
	功能：计算身体的质量指数
*/

import java.util.Scanner;

public class ComputerAndInterpretBMI{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter weight in kg: ");
		double weight = input.nextDouble();
		System.out.println("Enter height in m: ");
		double height = input.nextDouble();
		double bmi = weight / (height * height);

		System.out.println("Your BMI is " + bmi);
		if(bmi < 18.5){
			System.out.println("UnderWeight");
		}
		else if(bmi < 25){
			System.out.println("Normal");
		}
		else if(bmi <  30){
			System.out.println("Overweight");
		}
		else 
			System.out.println("Obese");	
		
	}
}