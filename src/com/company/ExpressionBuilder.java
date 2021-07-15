package com.company;

import java.util.HashMap;
import java.util.Map;

public class ExpressionBuilder {

    FunctionBehavior functionBehavior;
    Expression expression = new Expression();
    String name;

    Map<String, FunctionBehavior> functionName = new HashMap<>();
    public void addFunc(String n,FunctionBehavior fb) {
        this.name = n;
        this.functionBehavior = fb;
        functionName.put(name, functionBehavior);
    }

    public Expression buildExpression(String s) {
        //assume expression.f1 and expression.f2 are known

    }

}
