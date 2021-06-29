package CODEWARS.Kyu8;


import java.util.ArrayList;
import java.util.List;

class Kata5 {
    public static List CreateList(int number)
    {
        List list = new ArrayList();

        for(int count = 1; count <= number;count++)
        {
            list.add(count);
        }

        return list;
    }
}

public class UnfinishedLoop {
    public static void main(String[] args) {
        System.out.println(Kata5.CreateList(5));
    }
}
