// Reverse of a number
// Send Feedback
// Write a program to generate the reverse of a given number N. Print the corresponding reverse number.
// Note : If a number has trailing zeros, then its reverse will not include them. For e.g., reverse of 10400 will be 401 instead of 00401.


// Input format :
// Integer N
// Output format :
// Corresponding reverse number
// Constraints:
// 0 <= N < 10^8
// Sample Input 1 :
// 1234
// Sample Output 1 :
// 4321
// Sample Input 2 :
// 1980

// Sample Output 2 :
// // 

// ____________________________________________________________________________________________________________________

import java.util.*;
public class ReverseNumber {
	
	public static void main(String[] args) {
		// Write your code here
        Scanner sc =new Scanner(System.in); 
      
        int n= sc.nextInt();
        
        int number=0,result=0,num;
        for(int i=1;n>0;i++) {
        num=n/10;
        number=n%10;
        
        result = result*10+number;
        n=num;
        }
        System.out.println(result);


	}
}
