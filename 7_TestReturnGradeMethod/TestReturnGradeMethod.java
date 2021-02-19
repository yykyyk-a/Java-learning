/*
	功能：给定一个分数，判断它属于哪个等级
*/

import java.util.Scanner;

public class TestReturnGradeMethod{
	public static String getGrade(double score){
		if(score >= 90.0){
			return "A";
		}
		if(score >= 80.0){
			return "B";
		}
		if(score >= 70.0){
			return "C";
		}
		if(score >= 60.0){
			return "D";
		}
		else{
			return "F";
		}
	}

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your score:");
		double score = input.nextDouble();
		System.out.println("The grade is " + getGrade(score));
	}


}