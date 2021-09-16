package com.anita.generic;

public interface MathCommand<O, R> {

    R calculate(O operator1, O operator2);
}
