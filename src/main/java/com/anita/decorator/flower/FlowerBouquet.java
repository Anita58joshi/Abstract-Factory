package com.anita.decorator.flower;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class FlowerBouquet {

    protected String description;

    public abstract double cost();

}
