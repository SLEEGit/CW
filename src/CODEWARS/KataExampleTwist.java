package CODEWARS;

import java.util.Arrays;

class KataExampleTwist1
{
    public static String[] kataExampleTwist() {
        String[] websites = new String[1000];
        for (int i = 0; i != 1000; i++) {
            websites[i] = "codewars";
        }
        return websites;
    }
}

public class KataExampleTwist {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(KataExampleTwist1.kataExampleTwist()));
    }
}
