package ch4;

public class SwitchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=(int)(Math.random()*6)+1;
		
		switch(num) {
		case 1:
			System.out.println("no1");
			break;
		case 2:
			System.out.println("no2");
			//break;
		case 3:
			System.out.println("no3");
			break;
		case 4:
			System.out.println("no4");
			break;
		case 5:
			System.out.println("no5");
			break;
		default:
			System.out.println("no6");
			break;
		}
	}
}
