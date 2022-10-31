package Strings;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("abc");
		str.setCharAt(0, 'd');
		System.out.println(str+ " "+ str.length());

	}

}
