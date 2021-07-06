package CODEWARS.Kyu8;

import java.util.Arrays;
import java.util.stream.Collectors;

class Kata11
{
    public static int[] squareOrSquareRoot(int[] array) {
        for (int i = 0; i != array.length; i++) {
            if (Math.sqrt(array[i]) != Math.round(Math.sqrt(array[i]))) {
                array[i] = array[i]*array[i];
            } else array[i] = (int) Math.sqrt(array[i]);
        }
        return array;
    }
}

public class ToSquareOrNotToSquare {
    public static void main(String[] args) {
        int [] input = new int[] { 100, 101, 5, 5, 1, 1 };
        System.out.println(Arrays.toString(Kata11.squareOrSquareRoot(input)));
//        expected = new int[] { 10, 10201, 25, 25, 1, 1 };
    }
}
