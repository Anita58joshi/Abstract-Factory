package com.anita.calculator;

import java.io.*;
;

public class History {


    public void Write(Double operand1,Double operand2,String operator,Double result){
    CalculatorData calculatorData = CalculatorData
                .builder()
                .num1(operand1)
                .num2(operand2)
                .operator(operator)
                .result(result)
                .build();

        try{
            FileOutputStream fileOutputStream = new FileOutputStream("Resources/CalHistory.data");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(calculatorData);
            objectOutputStream.close();
            fileOutputStream.close();

        } catch (Exception ex) {
            System.out.println(ex);

        }
    }

    public CalculatorData Read(){
        CalculatorData calculatorData =null;
        try {
            FileInputStream fileInputStream = new FileInputStream("Resources/CalHistory.data");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            calculatorData = (CalculatorData) objectInputStream.readObject();
            System.out.println(calculatorData);
            fileInputStream.close();
            objectInputStream.close();

        } catch (Exception ex) {
            System.out.println(ex);
        }
        return calculatorData;
    }

}
