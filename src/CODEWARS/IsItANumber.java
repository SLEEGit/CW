package CODEWARS;

public class IsItANumber {
    public static void main(String[] args) {
        MyUtilities myUtilities = new MyUtilities();
        String s = new String("  4   ");
//        String newS = s.replaceAll("\\s","");
        String newS = s.trim();
        System.out.println(newS);
        System.out.println(myUtilities.isDigit(newS));
    }
}

class MyUtilities{

    public boolean isDigit(String s)
    {
        try {
            Double.parseDouble(s);
        } catch (NumberFormatException e) {
            return false;
        } return true;
    }
}

