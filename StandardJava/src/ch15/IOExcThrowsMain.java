package ch15;

import java.io.IOException;

public class IOExcThrowsMain {

	public static void main(String[] args) {
		IOExcThrows io=new IOExcThrows();
		try {
			io.input();
		} catch(IOException e) {
			e.printStackTrace();
		}
		io.print();
	}

}
