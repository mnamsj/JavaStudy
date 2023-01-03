package ch3;
public class Exercise07 {
	public static void main(String[] args) {
		//주어진 배열의 최대값 구하기(for문 사용)
		int max=0;
		int[] array= {1,5,3,8,2};
		
		for(int i=0; i<array.length; i++) {
			if(max<array[i]) {
				max=array[i];
			}
		}
		System.out.println("max: "+max);
	}
}
