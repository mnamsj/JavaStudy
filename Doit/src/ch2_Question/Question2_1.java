package ch2_Question;
import java.util.Random;

public class Question2_1 {
	
	static int maxOf(int[]a) {
		int max=a[0];
		for(int i=1; i<a.length; i++) {
			if(a[i]>max) {
				max=a[i];
			} 
		} return max;
	}
	

	public static void main(String[] args) {
		Random ra=new Random();
		
		System.out.println("키의 최대값 구하기");
		int num=1+ra.nextInt(8);
		int[]height=new int[num];
		
		System.out.println("키값은 아래와 같다");
		for(int i=0; i<num; i++) {
			height[i]=100+ra.nextInt(90);
			System.out.println("height["+i+"] :"+height[i]);
		}
		
		System.out.println("최대값은"+maxOf(height)+"입니다");
	}
}
