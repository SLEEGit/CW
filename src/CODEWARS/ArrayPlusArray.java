package CODEWARS;

class Sum {
    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        int sum = 0;
        for (int num: arr1) { sum += num; }
        for (int num: arr2) { sum += num; }
        return sum;
    }
}

public class ArrayPlusArray {
    public static void main(String[] args) {
        int [] arr1 = {10, 20, 30};
        int [] arr2 = {40, 50, 60, 100};
        System.out.println(Sum.arrayPlusArray(arr1, arr2));
    }
}
