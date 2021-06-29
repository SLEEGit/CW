// UNFINISHED ! ! ! !

package CODEWARS.Kyu8;

public class FindTheForceOfGravityBetweenTwoObjects {
    public static void main(String[] args) {
        System.out.println(Solution2.solution(new double[]{1000, 1000, 100}, new String[]{"g", "kg", "m"}));
        System.out.println(Solution2.solution(new double[]{1000, 1000, 100}, new String[]{"kg", "kg", "m"}));
        System.out.println(Solution2.solution(new double[]{1000, 1000, 100}, new String[]{"kg", "kg", "cm"}));
//        test(6.67e-12, new double[] {1000, 1000, 100}, new String[] {"g", "kg", "m"});
//        test(6.67e-9, new double[] {1000, 1000, 100}, new String[] {"kg", "kg", "m"});
//        test(0.0000667, new double[] {1000, 1000, 100}, new String[] {"kg", "kg", "cm"});
    }
}


class Solution2 {

    public static double solution(double[] arrVal, String[] arrUnit) {
        double first = arrVal[0];
        double second = arrVal[1];
        double distance = arrVal[2];
//        double G = 6.67 * 10^-11 * first m2 / kg2
        return 0;
    }

}
