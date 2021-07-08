package com.anita.calculator;

import java.util.Scanner;


public class CalculatorMain{

    private static void userInput(){
        History history = new History();

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to my calculator");
        System.out.println("Enter operand1: ");
        Double operand1 = sc.nextDouble();
        System.out.println("Enter operand2: ");
        Double operand2 = sc.nextDouble();
        System.out.println("Enter operator: ");
        String op = sc.next();

        MathRuleset mathRuleset = MathRulesetFactory.get(op);
        System.out.println(mathRuleset.calculate(operand1,operand2));
        mathRuleset.calculate(operand1, operand2);
        history.Write(operand1,operand2,op, mathRuleset.calculate(operand1, operand2));
    }

    private static void checkFurtherActivity(){

        System.out.println("Do you wish to continue? Press 'Y' to continue and 'N' to quit");
        Scanner in = new Scanner(System.in);
        String result = in.next();
        if(result.equals("Y")) {
            System.out.println(" 1. Press H for history "+"\n"+"2. Press C for calculation" +"\n"+"3. Press Q to quit");

            switchCase(in.next());
        }
        else{
            System.out.println("Thank you for using our calculator ! Have a good day");
            in.close();
        }
    }

    private static void switchCase(String response){
        History history = new History();
        switch (response) {
            case "H":
                history.Read();
                checkFurtherActivity();
                break;
            case "C":
                userInput();
                checkFurtherActivity();
                break;
            case "Q":
                System.out.println("Thank you for using our calculator ! Have a good day");
                break;
        }
    }
    public static void main(String[] args) {
        userInput();
        checkFurtherActivity();
    }
}
