package ch2;//이중for문

public class PrimeNumber1 {
	public static void main(String[] args) {
		int counter=0;
		
		for(int n=2; n<=100; n++) {
			int i;
		    for(i=2; i<n; i++) {
		    	counter++;
		    		if(n%i==0) {
		    			break;
		    		}
		}
		    if(n==i) {
		    	System.out.println(n);
		    }
		}
		    System.out.print("나눗셈을 수행한 횟수 : "+counter);
	}

}
