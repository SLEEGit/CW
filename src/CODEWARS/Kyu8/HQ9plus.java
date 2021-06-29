package CODEWARS.Kyu8;


class HQ {
    public static String HQ9(char code) {
        StringBuilder stringBuilder = new StringBuilder();
        int bottles = 99;
        switch (code) {
            case 'H': return "Hello World!";
            case 'Q': return "Q";
            case '9':
                for (int i = 99; i != 2; i--) {
                    stringBuilder.append(i + " bottles of beer on the wall, " + i + " bottles of beer.\nTake one down and pass it around, " + (i-1) + " bottles of beer on the wall.\n");
                } stringBuilder.append("2 bottles of beer on the wall, 2 bottles of beer.\n" +
                    "Take one down and pass it around, 1 bottle of beer on the wall.\n" +
                    "1 bottle of beer on the wall, 1 bottle of beer.\nTake one down and pass it around, no more bottles of beer on the wall.\nNo more bottles of beer on the wall, no more bottles of beer.\nGo to the store and buy some more, 99 bottles of beer on the wall.");
                return String.valueOf(stringBuilder);
            default: return null;
        }
    }
}


//class HQ {
//    public static String HQ9(char code) {
//        String HQ9 = new String();
//        StringBuilder stringBuilder = new StringBuilder();
//        int bottles = 99;
//        switch (code) {
//            case 'H': HQ9 =  "Hello World!"; break;
//            case 'Q': HQ9 =  "Q"; break;
//            case '9':
//                for (int i = 99; i != 2; i--) {
//                    stringBuilder.append(i + " bottles of beer on the wall, " + i + " bottles of beer.\nTake one down and pass it around, " + (i-1) + " bottles of beer on the wall.\n");
//                } stringBuilder.append("2 bottles of beer on the wall, 2 bottles of beer.\n" +
//                    "Take one down and pass it around, 1 bottle of beer on the wall.\n" +
//                    "1 bottle of beer on the wall, 1 bottle of beer.\nTake one down and pass it around, no more bottles of beer on the wall.\nNo more bottles of beer on the wall, no more bottles of beer.\nGo to the store and buy some more, 99 bottles of beer on the wall.");
//                HQ9 = String.valueOf(stringBuilder); break;
//            default: HQ9 = null;
//        }
//        return HQ9;
//    }
//}

public class HQ9plus {
    public static void main(String[] args) {
        System.out.println(HQ.HQ9('9'));
    }
}
