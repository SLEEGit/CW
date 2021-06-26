package CODEWARS;


class KeepHydrated  {

    public static int Liters(double time)  {

        return (int) (time*0.5);

    }

}

public class Hydrated {
    public static void main(String[] args) {
        System.out.println(KeepHydrated.Liters(6.7));
    }
}
