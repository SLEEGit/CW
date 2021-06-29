package CODEWARS.Kyu8;

import java.util.Arrays;

class Kata7 {
    public static int[] getSize(int w,int h,int d) {
        return new int[]{2 * (w * h + h * d + d * w), w * h * d};
    }
}

public class SurfaceAreaAndVolumeOfABox {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Kata7.getSize(4,2,6)));
    }
}
