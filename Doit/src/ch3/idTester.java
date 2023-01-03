package ch3;

	class Id{
		private static int counter=0;
		private int id;
		
		public Id() {id=++counter;}
		
		public static int getCounter() {return counter;}
		
		public int getId() {
			return id;
			}
	}
	
	public class idTester {
		public static void main(String[]args) {
			Id a=new Id();
			Id b=new Id();
			
			System.out.println("a's ID : "+a.getId());
			System.out.println("b's ID : "+b.getId());
			
			System.out.println("numbering ID :"+Id.getCounter());
		}

}
