package CODEWARS;


class Cube{
    int Side = 0;

    public int getSide() {
        return Side;
    }

    public void setSide(int num) {
        Side = num;
    }

    public static int toBinary(int n) {
        String s = Integer.toBinaryString(n);
        return Integer.parseInt(s);
    }
}

public class PlayingWithCubes {
}
