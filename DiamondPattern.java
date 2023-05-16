// Code : Diamond of stars
// Send Feedback
// Print the following pattern for the given number of rows.
// Note: N is always odd.


// Pattern for N = 5



// The dots represent spaces.



// Input format :
// N (Total no. of rows and can only be odd)
// Output format :
// Pattern in N lines
// Constraints :
// 1 <= N <= 49
// Sample Input 1:
// 5
// Sample Output 1:
//   *
//  ***
// *****
//  ***
//   *
// Sample Input 2:
// 3
// Sample Output 2:
//   *
//  ***
//   *

//   ________________________________________________________________________________________________________________________________________________

import java.util.Scanner;
public class DiamondPattern {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
     Scanner sc = new Scanner(System.in);
	 int n = sc.nextInt();
	 int n1 = n/2;
	 if(n%2!=0){
		 n1++;
	 }
	 int n2 = n/2;

  for(int  i =1;i<=n1;i++){
	  for(int j =1;j<=n1-i;j++){
		  System.out.print(" ");
	  }
	  	for (int j = 1; j<=2*i-1;j++) {
			System.out.print("*");
		}
		System.out.println();
	  }
	  for(int i =1;i<=n2;i++){
		  for(int j =1;j<=i;j++){
			  	System.out.print(" ");
		  }
			for (int j = 1; j <= n-2*i; j++) {
				System.out.print("*");
			}
			System.out.println();
	  }	
	}


}