package CODEWARS.Kyu8;

import java.util.stream.IntStream;

class GrassHopper1 {

    public static int findAverage(int[] nums) {
//        int summ = 0;
//        for (int i=0; i != nums.length;i++) {
//            summ = summ + nums[i];
//        }
//        return summ/nums.length;
        return IntStream.of(nums).sum()/nums.length;
    }


}


public class GrassHopper {
    public static void main(String[] args) {

        System.out.println(GrassHopper1.findAverage(new int []{10,20,30,40}));
    }
}
