package ch4;
public class SwitchCharExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade='b';
		
		switch(grade) {
		case 'A' :
		case 'a' :
			System.out.println("vip");
			break;
		case 'B':
		case 'b':
			System.out.println("standard");
			break;
		default :
			System.out.println("guest");
		}
	}

}
