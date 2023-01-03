package ch3;

import java.util.Scanner;

public class NearByBirthday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int a;
			Scanner sc=new Scanner(System.in);
			System.out.println("Who's birthday is closer");
			System.out.println("input month and day ex)15.oct is 1015");
			a=sc.nextInt();
			if(0101<a<1232){
				System.out.println("A's birthday is closer");
			} else if(0601<a) {
				System.out.println("B's birthday is closer");
			} else if(1232>a) {
				System.out.println("checking input ex)");
			} else if(a<0101) {
				System.out.println("checking input ex)");
			} else if(a>1231) {
				System.out.println("checking input ex)");
			} else {
				System.out.println("checking input ex)");
			}				
		}
   }

