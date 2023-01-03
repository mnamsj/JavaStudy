package ch1_Question;

public class Question1_1 {

		static int max(int a, int b, int c, int d) {
			int max=a;
			if(b>max) {
				max=b;
			}
			if(c>max) {
				max=c;
			}
			if(d>max) {
				max=d;
			}
			return max;
		}
		public static void main(String[] args) {
		System.out.print(max(4,5,7,1));
}
}
