package CODEWARS.Kyu8;


class Kata1 {
    public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {
        return distanceToPump <= mpg*fuelLeft;
    }
}

public class WillYouMakeIt {
    public static void main(String[] args) {
        System.out.println(Kata1.zeroFuel(50, 25, 2));
    }
}
