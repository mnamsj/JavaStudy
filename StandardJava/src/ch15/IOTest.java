package ch15;

import java.io.IOException;

public class IOTest {

	public static void main(String[] args) {
		int ch=0;
		try {
			while((ch=System.in.read())!='\n') {
				System.out.println((char)ch);
			}
		} catch(IOException e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
