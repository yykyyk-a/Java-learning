/*
	功能：将当前输入的货币大小换成最小的数量的硬币数量
*/

import java.util.Scanner;

public class ComputerChange{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an amount in double,for example 11.56: ");
		double amount = input.nextDouble();

		int remainingAmount = (int)(amount * 100);
		int numberOfDollars = remainingAmount / 100;
		remainingAmount = remainingA`mount % 100;
		int numberOfQuarters = remainingAmount / 25;
		remainingAmount = remainingAmount % 25;
		int numberOfDimes = remainingAmount / 10;
		remainingAmount = remainingAmount % 10;
		int numberOfNickels = remainingAmount / 5;
		remainingAmount = remainingAmount % 5;
		int numberOfPennies = remainingAmount;

		System.out.println("Your amount " + amount + " consists of");
		System.out.println("    " + numberOfDollars + " dollars");
		System.out.println("    " + numberOfQuarters + " quarters");
		System.out.println("    " + numberOfDimes + " dimes");
		System.out.println("    " + numberOfNickels + " nickels");
		System.out.println("    " + numberOfPennies + " pennies");

	}
}