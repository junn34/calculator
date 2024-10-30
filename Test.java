package CalculatorProject;

import java.util.Scanner;



public class Test {

	public static void main(String[] args) {
		String[] inputArr;
		Result res = new Result();
		Scanner scanner = new Scanner(System.in);
		System.out.println("계산할 수식을 입력하세요. :");
		String input = scanner.nextLine();
		inputArr= input.split(" ");
		int calcResult = res.result(inputArr);
		System.out.println(calcResult);
		
		scanner.close();
	}
	

}
