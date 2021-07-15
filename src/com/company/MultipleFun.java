package com.company;

public class MultipleFun implements FunctionBehavior{

    public String x, y, z;

    @Override
    public String perform() {
        return perform(x,y);
    }

    public String perform(String x, String y) {
        int a = Integer.parseInt(x);
        int b = Integer.parseInt(y);
        Integer answer = a * b;
        return answer.toString();
    }
}
