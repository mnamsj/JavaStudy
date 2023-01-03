package ch4;

import java.util.Scanner;

public class DowhileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("insert message.");
		System.out.println("if program off insert q.");
		
		Scanner scanner=new Scanner(System.in);
		String inputString;
		
		do {
			System.out.print(">");
			inputString=scanner.nextLine();
			System.out.println(inputString);
		} while(!inputString.equals("q"));
		
		System.out.println();
		System.out.println("power off");
		}
	}


