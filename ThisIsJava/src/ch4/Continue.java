package ch4;

public class Continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		for (i=0; i<11; i++) {
			if((i%2==1)) {
				continue;
			}
			System.out.print(i+"\t");
		}
	}

}
