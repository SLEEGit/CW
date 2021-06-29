package CODEWARS.Kyu8;

import java.util.Arrays;

import static java.util.stream.IntStream.concat;
import static java.util.stream.IntStream.of;


class Kata8 {
    public static int[] mergeArrays(int[] first, int[] second) {
        return concat(of(first), of(second)).sorted().distinct().toArray();
    }
}

public class MergingSortedIntegerArrays {
    public static void main(String[] args) {
        int [] first = new int[] {1,2,3,4,5,6};
        int [] second = new int[] {3,4,7,8,9,10};
        System.out.println(Arrays.toString(Kata8.mergeArrays(first, second)));
    }
}
