package ch5;
import java.util.Scanner;
public class Arr3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int i, sum=0;
			float avg;
			int[]jumsu=new int[5];
			Scanner sc=new Scanner(System.in);
			
			System.out.println("insert 5 student's math score");
			for(i=0; i<jumsu.length; i++) {
					jumsu[i]=sc.nextInt();			
			}
			for(i=0; i<jumsu.length; i++) {
					sum+=jumsu[i];
			}
			avg=(float)sum/5;
			System.out.println("TotalScore="+sum+" average="+avg);
	}

}
