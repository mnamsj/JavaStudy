package ch5;

public class Typing2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] src= {1,2,3,4,5};
			int[] dest=new int[3];
			int i;
			
			System.arraycopy(src, 1, dest, 0, 3); {
			System.out.println("원본배열");
			for(i=0;i<src.length;i++) {
				System.out.print(src[i]+"\t");
			}
			System.out.println("\n복사배열");
			for(i=0;i<dest.length;i++) {
				System.out.print(dest[i]+"\t");
			}
			dest[2]=50;
			System.out.println("\n원본배열");
			for(i=0;i<src.length;i++) {
				System.out.print(src[i]+"\t");
			}
			System.out.println("\n복사배열");
			for(i=0;i<dest.length;i++) {
				System.out.print(dest[i]+"\t");
			}
		}
	}
}
