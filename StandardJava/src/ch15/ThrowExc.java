package ch15;

public class ThrowExc {
	String str=null;
	
	public String substr(int idx) {
		if(str==null) {
			System.out.println("str이 null이다.");
			throw new NullpointerException();
		} else {
			return str.substring(idx);
		}
	}
}
