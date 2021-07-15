package com.company;


import java.util.HashMap;
import java.util.Map;

public class Main {


    public static void main(String[] args) {

        ExpressionBuilder builder = new ExpressionBuilder();    //TODO

        // 绑定函数
        builder.addFunc("f1",  new MultipleFun());  //TODO
        builder.addFunc("f2",  new AddFun());   //TODO

        // 指定要计算的表达式
        Expression expression = builder.buildExpression("f1(x, f2(x, y,z))");   //TODO

        // 绑定参数
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("x", 4);
        params.put("y", 5);
        params.put("z", 7);

        Object value = expression.calculate(params);    //TODO
        System.out.println(value);//64
    }

}
