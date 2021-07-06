package CODEWARS.Kyu7;

import java.math.BigInteger;

import static java.math.BigInteger.*;

public class EasyLine {
    public static BigInteger easyLine(int input) {
        BigInteger n = ONE;
        BigInteger k = ONE;
        for (int i = 1; i < input * 2 + 1; i++) {
            n = n.multiply(BigInteger.valueOf(i));
        }
        for (int i = 1; i < input + 1; i++) {
            k = k.multiply(BigInteger.valueOf(i));
        }
        return n.divide(k.multiply(k));
    }

    public static void main(String[] args) {
        System.out.println(EasyLine.easyLine(7));

    }
}
