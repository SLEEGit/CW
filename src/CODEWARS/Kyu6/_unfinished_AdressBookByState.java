package CODEWARS.Kyu6;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Person {
    private String name;
    private String address;
    private String city;
    private String state;
}

class State {
    public static Map <String, String> map = new HashMap<>();

    public static String byState(String str) {
        map.put("AZ", "Arizona");
        map.put("CA", "California");
        map.put("ID", "Idaho");
        map.put("IN", "Indiana");
        map.put("MA", "Massachusetts");
        map.put("OK", "Oklahoma");
        map.put("PA", "Pennsylvania");
        map.put("VA", "Virginia");
        System.out.println(map);

        String[] news = str.split("\n");
        System.out.println(Arrays.toString(news));
        int i = news.length;
        System.out.println(news[0]);
        String[] person1 = news[0].split(",");
        System.out.println(person1[0]);
        System.out.println(person1[1]);
        System.out.println(person1[2]);
        String[] b = person1[2].split(",");
        System.out.println(b[0]);
        System.out.println(b[1]);

        return "";
    }
}

public class _unfinished_AdressBookByState {
    public static void main(String[] args) {
        String ad0="John Daggett, 341 King Road, Plymouth MA\n" +
                "Alice Ford, 22 East Broadway, Richmond VA\n" +
                "Orville Thomas, 11345 Oak Bridge Road, Tulsa OK\n" +
                "Terry Kalkas, 402 Lans Road, Beaver Falls PA\n" +
                "Eric Adams, 20 Post Road, Sudbury MA\n" +
                "Hubert Sims, 328A Brook Road, Roanoke VA\n" +
                "Amy Wilde, 334 Bayshore Pkwy, Mountain View CA\n" +
                "Sal Carpenter, 73 6th Street, Boston MA";

        System.out.println(State.byState(ad0));
    }
}
