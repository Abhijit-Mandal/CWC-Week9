package CWCweek9;
import java.util.Scanner;
public class Q3 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		
		getRoman(num);
		sc.close();
	}
	public static void getRoman(int n) {
		    String M[] = {"", "M"};
		 
	        String C[] = {"", "C", "CC", "CCC", "CD", "D", 
	                            "DC", "DCC", "DCCC", "CM"};
	        
	        String X[] = {"", "X", "XX", "XXX", "XL", "L", 
	                            "LX", "LXX", "LXXX", "XC"};
	        
	        String I[] = {"", "I", "II", "III", "IV", "V", 
	                            "VI", "VII", "VIII", "IX"};
			
	        System.out.println("Result: "+M[n/1000]+C[(n%1000)/100]+X[(n%100)/10]+I[n%10]);
		}
	}


