package com.anita.abstractfactory;

import static com.anita.abstractfactory.OperatingSystemFactory.configureApplication;

public class FactoryMain {

    public static void main(String[] args) {
        Application application = configureApplication();
        application.paint();
    }
}
