package com.anita.factory;

public class MathCommandFactory {
    public static MathCommand get(String  operator) {
        MathCommand mathCommand = null;
        switch (operator) {
            case "add":
                mathCommand = new AddCommand();
                break;
            case "sub":
                //return new SubCommand();
                mathCommand = new SubCommand();
                break;

            case "div":
                mathCommand = new DivCommand();
                break;

            default:
                mathCommand = new NullCommand();
        }
        return mathCommand;


        }

    }


