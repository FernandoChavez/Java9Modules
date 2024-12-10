package com.fuerzadon.util;
import com.fuerzadon.internal.AddHelper;

public class Calculator {

    AddHelper helper = new AddHelper();

    public int add(int i, int j){
        return helper.add(i,j);
    }

    public int addDouble(double i, double j){
        return helper.add((int)i,(int)j);
    }

}
