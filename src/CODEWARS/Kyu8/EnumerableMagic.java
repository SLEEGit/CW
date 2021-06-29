package CODEWARS.Kyu8;

import java.util.Arrays;

public class EnumerableMagic {
    public static void main(String[] args) {
        int [] test = new int[] {};
        System.out.println(Arrays.toString(test));
        System.out.println(Arrays.toString(ZywOo.take(test, 3)));

    }
}

class ZywOo {
    public static int[] take(int[] arr, int n) {
        if (n >= arr.length ) {
            return arr;
        } return Arrays.copyOfRange(arr, 0, n);
    }

    @Override
    public String toString() {
        return "ZywOo{}";
    }
}
