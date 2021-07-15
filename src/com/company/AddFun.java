package com.company;


public class AddFun implements FunctionBehavior {

    public String x, y, z;


    @Override
    public String perform() {
        return perform(x,y,z);
    }

    public String perform(String x, String y, String z) {
        int a = Integer.parseInt(x);
        int b = Integer.parseInt(y);
        int c = Integer.parseInt(z);

        Integer answer = a + b + c;
        return answer.toString();
    }
}
