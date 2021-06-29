package CODEWARS.Kyu8;

class Solution {

    public static int closeCompare(double a, double b) {
        if (a - b < 0) {
            return -1;
        } else if (b - a < 0) {
            return 1;
        } return 0;
    }

    public static int closeCompare(double a, double b, double margin) {
        if (a + margin - b < 0) {
            return -1;
        } else if (b - a + margin < 0) {
            return 1;
        } return 0;
    }
}

public class CompareWithinMargin {
    public static void main(String[] args) {
        System.out.println(Solution.closeCompare(20,30, 20));
    }
}
