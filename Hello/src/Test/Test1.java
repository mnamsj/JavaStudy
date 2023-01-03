package Test;
import java.util.Scanner;
public class Test1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String a;
			Scanner sc=new Scanner(System.in);
			System.out.println("insert name, school, grade");
			a=sc.nextLine();
			switch(a) {
			case "Songjunghyuk Beolmal 6" :
				System.out.println("Name : Songjunghyuk");
				System.out.println("School : Beolmal");
				System.out.println("grade : 6");
				break;
			default :
				System.out.println("insert correct name");
			}			
						
	}

}
