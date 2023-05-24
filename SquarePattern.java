// Code : Square Pattern
// Send Feedback
// Print the following pattern for the given N number of rows.
// Pattern for N = 4
// 4444
// 4444
// 4444
// 4444
// Input format :
// Integer N (Total no. of rows)
// Output format :
// Pattern in N lines
// Constraints
// 0 <= N <= 50
// Sample Input 1:
// 7
// Sample Output 1:
// 7777777
// 7777777
// 7777777
// 7777777
// 7777777
// 7777777
// 7777777
// Sample Input 1:
// 6
// Sample Output 1:
// 666666
// 666666
// 666666
// 666666
// 666666
// 666666

// ___________________________________________________________________________________________________________________________________________________


import java.util.Scanner;

public class SquarePattern {

    public static void main(String[] args) {

        /*
         * Your class should be named Solution.
         * Read input as specified in the question.
         * Print output as specified in the question.
         */
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a; j++) {
                System.out.print(a);
            }
            System.out.println();
        }

    }

}
