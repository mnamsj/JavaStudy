package ch3;

public class LogicalOpreratorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int charCode='A';
			
			if((charCode>=65)&(charCode<=90)) {
				System.out.println("Capital");
			}
			
			if(!(charCode<48)&&!(charCode>57)) {
				System.out.println("Lowercase");
			}
			
			if(!(charCode<48)&&!(charCode>57)) {
				System.out.println("0~9");
			}
			
			int value=6;
			
			if((value%2==0)|(value%3==0)) {
				System.out.println("2 or 3 multiple");
			}
			
			if((value%2==0)||(value%3==0)) {
				System.out.println("2 or 3 multiple");
			}
	}

}
