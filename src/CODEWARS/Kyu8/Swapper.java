package CODEWARS.Kyu8;

import java.util.Arrays;

class Test {
    public static void main(String[] args) {
        Object [] objects = new Object[] {"first", "second"};
        Swapper swapper = new Swapper(objects);
        swapper.swapValues();
        System.out.println(swapper.toString());
    }
}


public class Swapper{

    public Object[] arguments;

    public void swapValues() {
        Object[] args = new Object[]{arguments[0],arguments[1]};
        Object temp = args[0];
        args[0] = args[1];
        args[1] = temp;
        arguments = args;
    }

    public Swapper(final Object[] args){
        arguments=args;
    }

    @Override
    public String toString() {
        return "Swapper{" +
                "arguments=" + Arrays.toString(arguments) +
                '}';
    }
}
