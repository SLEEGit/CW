package CODEWARS.Kyu8;

class Kata6 {
    public static int findLongest(final String str) {
        String[] spl = str.split(" ");
        int longest = 0;
        for (int i = 0; i < spl.length; i++) {
            if (spl[i].length() > longest) {
                longest = spl[i].length();
            }
        }
        return longest;
    }
}


public class SquashTheBugs {
    public static void main(String[] args) {
        System.out.println(Kata6.findLongest("It is a good daaaaaaaay to dieeee"));
    }
}
