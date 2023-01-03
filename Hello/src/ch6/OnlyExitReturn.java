package ch6;

public class OnlyExitReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			divide(8,4);
			divide(10,0);
			divide(9,0);
	}
		
	public static void divide(int num1,int num2) {
		if(num2==0) {
			System.out.println("Can't divine 0");
			return;
		}
		
		System.out.println("divine result : "+(num1/num2));
	}
}
