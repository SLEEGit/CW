package CODEWARS.Kyu8;

class Kata10 {
    public static String chromosomeCheck(String sperm) {
//        if (sperm.equals("XX")) {
//            return "Congratulations! You're going to have a daughter.";
//        } return "Congratulations! You're going to have a son.";
        return sperm.equals("XY") ? "Congratulations! You're going to have a son." : "Congratulations! You're going to have a daughter.";
    }
}

public class DetermineOffsprings {
}
