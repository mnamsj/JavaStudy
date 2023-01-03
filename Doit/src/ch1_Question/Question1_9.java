package ch1_Question;

import java.util.Scanner;
public class Question1_9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b;
		do {
			System.out.println("input a>"); 
			a=sc.nextInt();	
			System.out.print("input b>");
		    b=sc.nextInt();
		    if(b<=a) {
		    System.out.println("input more than a");
		    } 
		} while(b<=a);
		
		System.out.print("b-a="+(b-a));
		
		
	}

}
