package CODEWARS.Kyu8;

public class BooleanToString {
    public static String convert(boolean b){
        if(b == true) {
            return "true";
        } return "false";
    }
}

class Test1{
    public static void main(String[] args) {
        System.out.println(BooleanToString.convert(false));
    }
}
