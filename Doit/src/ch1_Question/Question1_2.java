package ch1_Question;

public class Question1_2 {
//세 값의 최소값을 구하는 min3 매서드
	static int min3(int a, int b, int c) {
		int min=a;
		if(b<min) {
			min=b;
		}
		if(c<min) {
			min=c;
		}
		return min;
	}
	public static void main(String args[]) {
		System.out.print(min3(15,9,7)+"\t");
		System.out.print(min3(10,2,9)+"\t");
		System.out.print(min3(1,5,8)+"\t");
	}
}
