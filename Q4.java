package CWCweek9;
import java.util.Scanner;
public class Q4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		
		for (int i = 1; i <= (num+1)/2; i++)
        {
            int n = (num+1)/2;
   
            for (int j = 1; j<= n - i; j++) { 
            	System.out.print(" "); } 
            
            for (int k = i; k >= 1; k--)
            {
                System.out.print(k);
            }
            for (int l = 2; l <= i; l++) {  
            	System.out.print(l); }
            
            System.out.println(); }
		
		for (int i = ((num+1)/2)-1; i >= 1; i--)
        {
            int n = ((num+1)/2)-1;
   
            for (int j = 0; j<= n - i; j++) {  
            	System.out.print(" "); }
            
            for (int k = i; k >= 1; k--)
            {
                System.out.print(k);
            }
            for (int l = 2; l <= i; l++)
            {
                System.out.print(l);
            }
   
            System.out.println();
        }
		sc.close();

	}

}
