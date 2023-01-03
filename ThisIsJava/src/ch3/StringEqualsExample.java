package ch3;

public class StringEqualsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String strVar1="SHIN";
			String strVar2="SHIN";
			String strVar3=new String("SHIN");
			
			System.out.println(strVar1==strVar2);
			System.out.println(strVar1==strVar3);
			System.out.println();
			System.out.println(strVar1.equals(strVar2));
			System.out.println(strVar1.equals(strVar3));
					
	}

}
