package Question;
import java.util.Scanner;
public class Question4_7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Insert 0~");
		int s=sc.nextInt();
		if(s>0) {
			int i=0;
			while(i<s) {
					System.out.print('*');
					i++;
			}
			System.out.println();
		}
		
	}

}
