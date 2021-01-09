
import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int N=sc.nextInt();
		int[] a = new int[N]; 
		System.out.println("Enter the sum: ");
		int sum=sc.nextInt();
		
		findTriplets(a,sum);
		sc.close();
	}
	public static void findTriplets(int a[], int sum) {
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				for(int k=j+1;k<a.length;k++) {
					if(a[i]+a[j]+a[k]==sum) {
						System.out.println("The triplets are: "+a[i]+" "+a[j]+" "+a[k]);
					}
				}
			}
		}
	}

}
