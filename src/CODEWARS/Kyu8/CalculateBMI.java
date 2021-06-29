package CODEWARS.Kyu8;


class Calculate {
    public static String bmi(double weight, double height) {
        if (weight/(height*height) <= 18.5) {
            return "Underweight";
        } else if (weight/(height*height) <= 25.0) {
            return "Normal";
        } else if (weight/(height*height) <= 30.0) {
            return "Overweight";
        } else return "Obese";
    }
}

public class CalculateBMI {
    public static void main(String[] args) {
        System.out.println(Calculate.bmi(80, 1.80));
    }
}
