package ch3;

public class Excercise04 {

	public static void main(String[] args) {
		// while문, Math.random()메소드, 두수의 합이 5가 나오기까지 계속 반복
			while(true){
			int a=(int)(Math.random()*6)+1;
			int b=(int)(Math.random()*6)+1;
			System.out.println("("+a+'.'+b+")");
			if((a+b)==5) {
				break;
			 }
		}
	}

}
