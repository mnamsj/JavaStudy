package ch4;

public class IfElseIfElseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int score=88;
			
			if(score>=90) {
				System.out.println("Score is 100-90.");
				System.out.println("Grade A");
			}else if(score>=80) {
				System.out.println("Score is 80-89.");
				System.out.println("Grade B");
			}else if(score>=70) {
				System.out.println("Score is 70-79.");
				System.out.println("Grade C");
			}else{
				System.out.println("Score is under 70");
				System.out.println("Grade D");
			}
			
	}

}
