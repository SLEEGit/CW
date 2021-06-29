package CODEWARS.Kyu7;


public class TriangleArea {
    public static float tArea(String tStr) {
        long i = tStr.chars().filter(ch -> ch == '\n').count() - 2;
        return (float) (0.5 * i * i);
    }

    public static void main(String[] args) {
//        float S = (float) (0.5 * 8 * 8);
//        System.out.println(S);
//        System.out.println("\n.\n. .\n"); //1-1
//        System.out.println("0.5");
        System.out.println("\n.\n. .\n. . .\n"); // 2-2
//        System.out.println("2");
//        System.out.println("\n.\n. .\n. . .\n. . . .\n. . . . .\n. . . . . .\n. . . . . . .\n. . . . . . . .\n. . . . . . . . .\n");
//        System.out.println("32");
//        System.out.println("\n.\n. .\n. . .\n. . . .\n. . . . .\n"); //4-4
//        System.out.println("\n.\n. .\n. . .\n. . . .\n"); //3-3
//        System.out.println("8");
        System.out.println(TriangleArea.tArea("\n.\n. .\n. . .\n. . . .\n"));

    }
}
