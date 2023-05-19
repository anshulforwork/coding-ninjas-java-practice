// Binary to decimal
// Send Feedback
// Given a binary number as an integer N, convert it into decimal and print.
// Input format :
// An integer N in the Binary Format
// Output format :
// Corresponding Decimal number (as integer)
// Constraints :
// 0 <= N <= 10^9
// Sample Input 1 :
// 1100
// Sample Output 1 :
// 12
// Sample Input 2 :
// 111
// Sample Output 2 :
// 7

// ____________________________________________________________________________________________________________________

import java.util.*;
public class Binarytodecimal {
	
	public static void main(String[] args) {
		// Write your code here
  Scanner sc =new Scanner(System.in); 
      
        int n= sc.nextInt();
        
     int num,number,result=0 ,pow=1;
     for(int i =1;n>0;i++) {
     num=n/10;
     number=n%10;
   
     result = result+number*pow;
     pow = pow*2;
     n=num;
     }
     System.out.println(result);
	}
}
