package CODEWARS.Kyu8;
public class FirstClass {
    public static byte sum (byte a, byte b) {
        byte c = (byte)(a + b);
        return c;
    }
}

class FirstClassTest {
    public static void main(String[] args) {
        byte a = 1;
        byte b = 1;
        System.out.println(FirstClass.sum(a, b));
    }
}
