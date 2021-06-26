package CODEWARS;

public class ExpressionMatter {
    public static void main(String[] args) {
        System.out.println(Kata3.expressionsMatter(2,3,1));
    }
}

class Kata3
{
    public static int expressionsMatter(int a, int b, int c)
    {
        int max = 0;
        int max1 = 0;
        int a1 = a*b*c;
        int a2 = a+b+c;
        int a3 = a*(b+c);
        int a4 = (a+b)*c;
        if (a3 > a4) {
            max = a3;
        } else max = a4;
        if (a1 > a2) {
            max1 = a1;
        } else max1 = a2;
        if (max > max1) {
            return max;
        } return max1;
    }
}