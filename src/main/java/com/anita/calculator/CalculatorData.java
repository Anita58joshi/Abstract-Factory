package com.anita.calculator;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Builder
@Setter
@ToString

public class CalculatorData implements Serializable {

    private Double num1;
    private Double num2;
    private String operator;
    private Double result;


}
