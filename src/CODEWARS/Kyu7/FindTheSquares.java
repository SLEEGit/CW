//        9  -->  "25-16"
//        5  -->  "9-4"
//        7  -->  "16-9"

package CODEWARS.Kyu7;

class Solution{
    public static String findSquares(int n){
        long fisrt = 9;
        long second = 4;
        long number = 5;
        do {
            fisrt = fisrt + n;
            n = n -2;
            second = second + n;
        } while (number != n);
        return fisrt + "-" + second;
    }
}

public class FindTheSquares {
    public static void main(String[] args) {
        System.out.println(Solution.findSquares(9));
    }
}
