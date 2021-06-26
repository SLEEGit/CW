package CODEWARS;


import java.util.Arrays;

class TotalPoints {

    public static int points(String[] games) {
        int total = 0;
        for (String game : games) {
            if (game.charAt(0) > game.charAt(2)) { total = total + 3;
            } else if (game.charAt(0) == game.charAt(2)) { total = total + 1; }
        }
        return total;
    }
}

public class TotalAmountOfPoints {
    public static void main(String[] args) {
        String [] strings = new String[10];
        strings[0] = "3:1";
        strings[1] = "1:1";
        strings[2] = "2:2";
        strings[3] = "2:1";
        strings[4] = "4:0";
        strings[5] = "1:3";
        strings[6] = "2:4";
        strings[7] = "3:2";
        strings[8] = "2:0";
        strings[9] = "0:1";

        System.out.println(Arrays.toString(strings));
        System.out.println(TotalPoints.points(strings));
    }
}
