// Decimal to Binary
// Send Feedback
// Given a decimal number (integer N), convert it into binary and print.
// Note: The given input number could be large, so the corresponding binary number can exceed the integer range. So you may want to take the answer as long for CPP and Java.
// Note for C++ coders: Do not use the inbuilt implementation of "pow" function. The implementation of that function is done for 'double's and it may fail when used for 'int's, 'long's, or 'long long's. Implement your own "pow" function to work for non-float data types.


// Input format :
// Integer N
// Output format :
// Corresponding Binary number (long)
// Constraints :
// 0 <= N <= 10^5
// Sample Input 1 :
// 12
// Sample Output 1 :
// 1100
// Sample Input 2 :
// 7
// Sample Output 2 :
// 111

// ____________________________________________________________________________________________________________________

import java.util.*;
public class Decimaltobinary {
	
	public static void main(String[] args) {
		// Write your code here
		
        Scanner sc =new Scanner(System.in); 
      
        int n= sc.nextInt();
        
     int num,number,result=0 ,pow=1;String s=("");
     if (n==0)
     {
    	 System.out.println(0);
     }
     else {
    	 for(int i =1;n>0;i++) {
    	     num=n/2;
    	     number=n%2;
    	   
    	      s = (number+""+s);
    	     
    	     n=num;
    	     }
    	     System.out.print(s);
     }
    
	}
}
