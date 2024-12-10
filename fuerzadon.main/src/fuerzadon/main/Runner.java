package fuerzadon.main;

import fuerzadon.util.Calculator;
import fuerzadon.util.internal.AddHelper;

public class Runner {
    public static void main(String[] args){
        Calculator c = new Calculator();
        int result = c.add(10, 20);
        System.out.println(result);

    }
}
