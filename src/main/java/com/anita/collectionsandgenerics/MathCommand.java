package com.anita.collectionsandgenerics;

public interface MathCommand<O, R> {

    R calculate(O x, O y);
}
