package com.anita.decorator;


import com.anita.decorator.computer.Computer;
import com.anita.decorator.computer.DellLaptop;
import com.anita.decorator.computer.HddDecorator;
import com.anita.decorator.computer.RamDecorator;

public class DecoratorTester {

    public static void main(String[] args) {
//        FlowerBouquet bouquet1 = new OrchidBouquet();
//        bouquet1 = new PaperWrapper(bouquet1);
//        bouquet1 = new Glitter(bouquet1);
//
//        System.out.println(bouquet1.getDescription());
//        System.out.println(bouquet1.cost());

        Computer computer = new DellLaptop();
        computer = new RamDecorator(computer,16);
        computer = new HddDecorator(computer,500);

        System.out.println(computer.getDescription());
        System.out.println("Price: " +computer.cost());
    }
}
