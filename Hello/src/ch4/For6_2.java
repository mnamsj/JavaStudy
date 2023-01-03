package ch4;

public class For6_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		for(i=0;i<10;i++) {
				for(j=2;j<10;j++) {
					if(i==0) {
							System.out.print(j+"단\t");
					}else{
						
							System.out.print(j+"*"+i+"="+(j*i+"\t"));;
					}
				}
				System.out.println();
				}
			}
     
	}


