package ch3;

public class Practice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int i, x;
		 	int[][] a=new int[2][3];
			
			for(i=0; i<a.length; i++) {
				for(x=0; x<a[i].length; x++) {
					a[i][x]=i+x;
				}
				for(i=0; i<a.length; i++) {
					for(x=0; x<a[i].length; x++) {
						System.out.print(a[i][x]);
				}
				}
				System.out.println("a.length : "+a.length);

				
							}
	}

}
