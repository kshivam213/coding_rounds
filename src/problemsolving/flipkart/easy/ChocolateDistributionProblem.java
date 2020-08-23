package problemsolving.flipkart.easy;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Distribution of chocolate such that difference between minimum and
 * maximum should be less
 * @author shivamkumar
 *
 */
public class ChocolateDistributionProblem {
	
	public static void main(String args[]) {
		
		Scanner scan= new Scanner(System.in);
		
		int t = scan.nextInt();
		
		for(int i=0;i<t;i++) {
			
			int n = scan.nextInt();
			int m = scan.nextInt();
			int[] arr= new int[n];
			
			for(int j=0;j<n;j++) {
				arr[j] = scan.nextInt();
			}
			
			Arrays.sort(arr);
			
			int minDiff = Integer.MAX_VALUE;
			for(int k=0; (k+m)-1 < n;k++) {
				
				int diff = arr[(k+m)-1] - arr[k];
				if(diff < minDiff)
					minDiff= diff;
			}
			
			System.out.println(minDiff);
		}
		scan.close();
	}
}
