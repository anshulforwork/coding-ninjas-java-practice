// Code : Inverted Number Pattern
// Send Feedback
// Print the following pattern for the given N number of rows.
// Pattern for N = 4
// 4444
// 333
// 22
// 1
// Input format :
// Integer N (Total no. of rows)
// Output format :
// Pattern in N lines
// Constraints :
// 0 <= N <= 50
// Sample Input 1:
// 5
// Sample Output 1:
// 55555 
// 4444
// 333
// 22
// 1
// Sample Input 2:
// 6
// Sample Output 2:
// 666666
// 55555 
// 4444
// 333
// 22
// 1

// ___________________________________________________________________________________________________________________________________________________

import java.util.Scanner;
public class Invertednumberpattern {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
    Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	for(int i = 1;i<=n;i++){
		for(int j =1;j<=n-i+1;j++)
		{System.out.print(n-i+1);
		}
		
		
			
		System.out.println();
		}

	}

}