package ch3;
import java.util.Scanner; 
public class Excercise07 {
public static void main(String[] args) {
		boolean run=true;
		
		int balance=0;
				
		Scanner scanner=new Scanner(System.in);
		
		while(run) {
			System.out.println("------------------------");
			System.out.println("1)input | 2)ouput | 3)Summary | 4)Done");
			System.out.println("------------------------");
			System.out.print("Select>");
		
			int a=scanner.nextInt();
			
			switch(a) {
			case 1:
			System.out.print("money of input>");
			balance+=scanner.nextInt();
			break;
			case 2:
			System.out.print("money of ouput>");
			balance-=scanner.nextInt();
			break;
			case 3:
			System.out.print("Checking money>");
			System.out.println(balance);
			break;
			case 4:
			run=false;
			break;
			}
			System.out.println();
		}
		System.out.println("Done");
	}

}
