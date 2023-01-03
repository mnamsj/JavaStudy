package ch4;
public class SwitchNoBreakCaseExample {
 public static void main(String[] args) {
		// TODO Auto-generated method stub
	 int time=(int)(Math.random()*4)+8;
	 System.out.println("[present time:"+time+"time]");
	 
	 switch(time) {
	 	case 8:
		  System.out.println("in-working");
	 	case 9:
	 	  System.out.println("meating");
	 	case 10:
	 	  System.out.println("business");
	 	default:
	 	  System.out.println("working-out");	 	
	 }
	}

}
