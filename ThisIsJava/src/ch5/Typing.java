package ch5;

public class Typing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] arr1= {1,2,3};
			int[] arr2= arr1;
			int i;
			for(i=0;i<arr2.length;i++) {
					System.out.println(arr2[i]);
			}
			System.out.println("배열 arr1의 참조값 : " + arr1);
			System.out.println("배열 arr2의 참조값 : " + arr2);
	}

}


