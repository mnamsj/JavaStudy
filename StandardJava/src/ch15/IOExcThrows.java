package ch15;

import java.io.IOException;

public class IOExcThrows {
	char[] arr=new char[10];
	int i=0;
	
	void input() throws IOException {
		while((arr[i++]=((char)System.in.read()))!='\n');
	}
	
	void print() {
		int j=0;
		while(j<i) {
			System.out.print(arr[j++]);
		}
	}

}
