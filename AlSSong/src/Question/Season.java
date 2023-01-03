package Question;

import java.util.Scanner;


public class Season {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Season="";
		Scanner sc=new Scanner(System.in);
		System.out.println("월을 입력");
		Season=sc.next();
		switch(Season) {
		case "3월" :
		case "4월" :
		case "5월" :
			System.out.println("봄");
			break;			
		case "6월" :
		case "7월" :
		case "8월" :
			
			System.out.println("여름");
			break;
		case "9월" :
		case "10월" :
		case "11월" :
			System.out.println("가을");
			break;
		case "12월" :
		case "1월" :
		case "2월" :
			System.out.println("겨울");
			break;
		default :
			System.out.println("입력월을 확인");
			}
		
		}
	}


