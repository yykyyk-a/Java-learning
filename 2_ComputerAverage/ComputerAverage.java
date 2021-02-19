import java.util.Scanner;


public class ComputerAverage{
	public static void main(String []args){
		System.out.println("This is a program to calculate the average of some number.Please follow the prompts to complete the operation !");
		double num1,num2,num3,average;
		System.out.println("Please enter some number:");
		Scanner input = new Scanner(System.in);
		num1 = input.nextDouble(); 
		num2 = input.nextDouble(); 
		num3 = input.nextDouble(); 
		average = (num1 + num2 + num3) / 3;
		System.out.println("The average of " + num1 + " " + num2 + " " + num3 + " is " + average);
		System.out.println(Math.pow(2,3));
	}
}