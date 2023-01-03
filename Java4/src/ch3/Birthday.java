package ch3;

import java.util.Scanner;

public class Birthday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Birthday="";
		Scanner sc=new Scanner(System.in);
		System.out.println("input S's Birthday in correct");
		Birthday=sc.next();
		switch(Birthday) {
		case "1015" :
		case "10/15" :
		case "10월15일" :
			System.out.println("SJ's Birthday");
			break;
		case "1023" :
		case "10/23" : 
		case "10월23일" :
			System.out.println("SH's Birthday");
			break;
		default : 
			System.out.println("OMG");
		}
		
	}

}
