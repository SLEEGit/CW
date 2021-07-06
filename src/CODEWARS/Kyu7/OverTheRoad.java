package CODEWARS.Kyu7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

class CodeWars {
    public static long overTheRoad(long address, long n) {
        return n * 2 - address + 1;
//        List<Long> odds = new ArrayList<>();
//        List<Long> evens = new ArrayList<>();
//        long longForOdds = n * 2;
//        long longForEvens = n * 2;
//        for (int i = 0; i < n; i++) {
//            odds.add(longForOdds - 1);
//            longForOdds = longForOdds - 2;
//        }
//        for (int i = 0; i < n; i++) {
//            evens.add(longForEvens);
//            longForEvens = longForEvens - 2;
//        }
//        Collections.reverse(evens);
//
//        if (address % 2 == 0) {
//            return odds.get(evens.indexOf(address));
//        } return evens.get(odds.indexOf(address));
    }
}

//0.1   10    0.1 - 6
//1.3   8     1.3 - 4
//2.5   6     2.5 - 2
//3.7   4
//4.9   2

public class OverTheRoad {
    public static void main(String[] args) {

//        1999981L
        //596421736780L
        System.out.println(CodeWars.overTheRoad(23633656673L, 310027696726L));
        System.out.println(CodeWars.overTheRoad(20, 1000000));
        System.out.println(CodeWars.overTheRoad(1, 3)); //6
        CodeWars.overTheRoad(3, 3); //4
        System.out.println(CodeWars.overTheRoad(2, 3)); //5
        System.out.println(CodeWars.overTheRoad(3, 5)); //8
        CodeWars.overTheRoad(3, 10); //8
    }
}
