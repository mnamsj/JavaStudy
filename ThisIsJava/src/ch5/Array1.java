package ch5;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String[] arrString= {"january","february","march","april","may","june",
					"july", "august", "september","october", "november", "december"};
			int i;
			System.out.println("영어로");
			for(i=0;i<arrString.length;i++) {
				System.out.println(arrString[i]);
			}
			for(i=0;i<arrString.length;i++) {
				arrString[i]=(i+1)+"월";
			}
			System.out.println("한글로");
			for(i=0;i<arrString.length;i++) {
				System.out.println(arrString[i]);
			}
		}

}
