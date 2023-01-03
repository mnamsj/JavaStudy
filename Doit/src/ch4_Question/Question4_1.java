package ch4_Question;

import java.util.Scanner;

class Question4_1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		IntStack s=new IntStack(64);
		
		while(true) {
			System.out.println();
			System.out.printf("현재 데이터 개수 : %d / %d\n", s.size(), s.getCapacity());
			System.out.print("1:푸시   2:팝   3:피크   4:덤프   5:검색   6:비우기   7:출력   0:종료");
			
			System.out.print("\n시스템 구동값 입력>");
			int menu=sc.nextInt();
			if(menu==0) {
				break;
			} 
			int x;
			switch(menu) {
			case 1:
				System.out.print("데이터 : ");
				x=sc.nextInt();
				try {
					s.push(x);
				} catch(IntStack.OverflowIntStackException e) {
					System.out.println("스택이 가득 참");
				}
				break;
				
			case 2:
				try {
					x=s.pop();
					System.out.println("팝한 데이터>"+x);
				} catch(IntStack.EmptyIntStackException e) {
					System.out.println("스택이 비어있음");
				}
				break;
				
			case 3:
				try {
					x=s.peek();
					System.out.println("픽한 데이터는>+x");
				} catch(IntStack.EmptyIntStackException e) {
					System.out.println("스택이 비어있음");
				}
				break;
				
			case 4:
				s.dump();
				break;
				
			case 5:
				System.out.print("검색할 데이터 입력>");
				x=sc.nextInt();
				int n=s.indexOf(x);
				if(n>=0) {
					System.out.println("검색한 값은>"+(s.size()-n));
				} else {
					System.out.print("검색한 값은 없음");
				}
				break;
				
			case 6:
				s.clear();
				break;
				
			case 7:
				System.out.println("현재 남아있는 용량은>"+s.getCapacity()); //남아있는 용량
				System.out.println("현재 들어있는 데이터의 수량은>"+s.size()); //남아있는 데이터수
				System.out.println("비어"+(s.isEmpty()?"있음":"있지않음")); //비어있는 경우
				System.out.println("가득"+(s.isFull()?"있음":"있지않음"));//가득차있는 경우
				}
	    }	
   	}
}

