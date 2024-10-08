// We use the integers a, b, and n to create the following series:
// (a + (2^0).b), (a + (2^0).b + (2^1).b),...., (a + (2^0).b + (2^1).b + ... + (2^(n-1)).b)

// You are given q queries in the form of a, b, and n. For each query, print the series corresponding to the given a, b, and n values 
// as a single line of n space-separated integers.

// Input Format :
// The first line contains an integer, q, denoting the number of queries.
// Each line i of the q subsequent lines contains three space-separated integers describing the respective ai, bi, and ni values for that query.

// Constraints :
// 0 <= q <= 500
// 0 <= a,b <= 50
// 1 <= n <=15

// Output Format :
// For each query, print the corresponding series on a new line. Each series must be printed in order as a single line of n space-separated integers.

// Sample Input :
// 2
// 0 2 10
// 5 3 5

// Sample Output :
// 2 6 14 30 62 126 254 510 1022 2046
// 8 14 26 50 98

import java.util.Scanner;
public class Java_Loops_II {
    static int power(int N, int P) {
        if (P == 0)
            return 1;
        else
            return N * power(N, P - 1);
    }
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int a,b,n;
        for(int i=0;i<t;i++){
            a = in.nextInt();
            b = in.nextInt();
            n = in.nextInt();
        int res = a;
        for(int j=0; j<n; j++) {
            res = res + (b*(power(2,j)));
            System.out.print(res+" ");
        }
        System.out.println();
        }
        in.close();
    }
}
