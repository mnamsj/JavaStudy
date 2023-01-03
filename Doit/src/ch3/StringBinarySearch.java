package ch3;

import java.util.Scanner;
import java.util.Arrays;

class StringBinarySearch {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String[]x= {
				"abstract",   "assert",       "boolean",   "break",      "byte",
	            "case",       "catch",        "char",      "class",      "const",
	            "continue",   "default",      "do",        "double",     "else",
	            "enum",       "extends",      "final",     "finally",    "float",
	            "for",        "goto",         "if",        "implements", "import",
	            "instanceof", "int",          "interface", "long",       "native",
	            "new",        "package",      "private",   "protected",  "public",
	            "return",     "short",        "static",    "strictfp",   "super",
	            "switch",     "synchronized", "this",      "throw",      "throws",
	            "transient",  "try",          "void",      "volatile",   "while"
		};
		
		System.out.print("input wanted key-words : ");
		String ky=sc.next();
		
		int idx=Arrays.binarySearch(x,  ky);
		
	
		if(idx<0) {
			System.out.println("Do not find that key-words");
		} else {
			System.out.println("That key-words is find-in x["+idx+"]");
		}

	}
}
	
