package com.anita.calculator;



public class MathRulesetFactory  {

    public static MathRuleset get(String operator)
    {
        MathRuleset mathRuleset= null;
        switch (operator) {
            case "+":
                mathRuleset = new Addition();
                break;
            case "-":

                mathRuleset  = new Subtraction();
                break;

            case "*":
                mathRuleset  = new Multiplication();
                break;

            case "/":
                mathRuleset  = new Division();
                break;

            default:
                mathRuleset = new Nullable();
        }
        return mathRuleset ;


    }


}

