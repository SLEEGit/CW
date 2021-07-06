package CODEWARS.Kyu7;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static CODEWARS.Kyu7.Kata12.highAndLow;

class Kata12 {
    public static String highAndLow(String numbers) {
        int min = Arrays.stream(numbers.split(" ")).mapToInt(Integer::parseInt).min().getAsInt();
        int max = Arrays.stream(numbers.split(" ")).mapToInt(Integer::parseInt).max().getAsInt();
        return max + " " + min;
    }
}

public class HighestAndLowest {
    public static void main(String[] args) {
        System.out.println(highAndLow("1 2 3 4 5"));  // return "5 1"
        System.out.println(highAndLow("1 2 -3 4 5")); // return "5 -3"
        highAndLow("1 9 3 4 -5");// return "9 -5"
    }
}
