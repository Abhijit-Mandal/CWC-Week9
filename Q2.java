package CWCweek9;
import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String s1=sc.nextLine();
		System.out.println();
		System.out.print("Enter the String you want to remove: ");
		String s2=sc.nextLine();
		System.out.println();
		
		removeChar(s1,s2);
		sc.close();
	
	}
	public static void removeChar(String s1, String s2) {
		int c=0;
		while(c!=s2.length()) {
			s1=(s1.toLowerCase()).replaceAll(s2.toLowerCase().charAt(c)+"", "");
			c++;
		}
		System.out.println("Result: "+s1.trim());
		
	}
	

}
