package ch3;

public class ConditionalOperationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score=85;
		String grade=(score>90)?"100":((score>86)?"200":"300");		
		System.out.println(score+"점은"+grade+"등급입니다.");
		
		
	}

}
