package ch6;

public class Methoe2Param {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			double myHeight=175.9;
			
			hiEveryone(12, 12.5);
			hiEveryone(13, myHeight);
			
			byEveryone();
	}
	
	public static void hiEveryone(int age, double height) {
		System.out.println("I'm "+age+"year's old.");
		System.out.println("My heigth is "+height+"cm.");			
	}
	
	public static void byEveryone() {
		System.out.println("See you again.");
	}
}
