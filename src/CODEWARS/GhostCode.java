package CODEWARS;

class GhostCode1 {
    public static String helloName(final String name){
        /* \u000d name="dumb"; */
        if(name == null || name.equals(""))
            return "Hello world!";
        else
            return "Hello my name is " + name;
    }
}

public class GhostCode {
    public static void main(String[] args) {
        GhostCode1.helloName("Qwer");
    }
}
