import java.util.Scanner;

public class ComputerArea{
	public static void main(String []args){
		System.out.println("This is a program to calculate the area of a circle.Please follow the prompts to complete the operation !");
		double r,area;
		System.out.println("Please enter the radius of the circle:");
		Scanner input = new Scanner(System.in);
		r = input.nextDouble(); 
		area = 3.14159 * r * r;
		System.out.println("The area for the circle of radius " + r + " is " + area);
	}
}