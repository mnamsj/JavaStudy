package ch5;

public class ArrayEx4 {

	public static void main(String[] args) {
		char[] abc= {'a','b','c','d'};
		char[] num= {'0','1','2','3','4','5','6','7','8','9'};
		System.out.println(abc);
		System.out.println(num);
		
		char[] result=new char[abc.length+num.length];
		System.arraycopy(abc, 0, result, 0, abc.length);
		System.arraycopy(num, 0, result, abc.length, num.length);
		System.out.println(result);
		
		System.arraycopy(abc,  0, num, 0, abc.length);
		System.out.println(num);
		
		System.arraycopy(abc, 0, num, 6, 3);
		System.out.println(num);
		
	}

}
