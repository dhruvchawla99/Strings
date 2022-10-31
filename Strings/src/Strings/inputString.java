package Strings;
import java.util.Scanner;
public class inputString {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String str ;
		str = s.next();
		System.out.println(str + " "+ str.length());
		
		
		String str2 = s.nextLine();
		System.out.println(str2 + " "+ str2.length());

	}

}
