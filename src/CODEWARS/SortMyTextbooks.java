package CODEWARS;

import java.util.ArrayList;
import java.util.List;

class sorter {
    public static List<String> sort(List<String> textbooks) {
        textbooks.sort(String::compareToIgnoreCase);
        return textbooks;
    }
}

public class SortMyTextbooks {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("History");
        list.add("algebra");
        list.add("Geometry");
        list.add("English");
        System.out.println(sorter.sort(list));
    }
}
