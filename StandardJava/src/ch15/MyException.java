package ch15;

public class MyException extends Exception {
	private int cnt;
	
	public MyException(int cnt) {
		super("크기는 "+cnt+"이상이어야 합니다." );
	}

}
