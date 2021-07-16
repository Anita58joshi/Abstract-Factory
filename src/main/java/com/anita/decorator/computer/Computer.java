package com.anita.decorator.computer;

import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public abstract class Computer {


    protected int ram;
    protected int ssd;
    protected int hdd;
    protected double clockSpeed;
    protected double core;

    protected String description;

    public abstract double cost();





}
