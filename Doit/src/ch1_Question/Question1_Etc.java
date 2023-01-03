package ch1_Question;

public class Question1_Etc {
	
	static void ggd(int n) {
		for(int i=1; i<10; i++) {
			for(int j=1; j<10; j++) {
				System.out.printf("4%d",i*j);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int n=0;
		System.out.println();
		ggd(n);
	}	
}
	
