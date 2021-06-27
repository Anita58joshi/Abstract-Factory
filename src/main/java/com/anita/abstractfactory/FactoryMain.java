package com.anita.abstractfactory;

public class FactoryMain {

    private static Application configureApplication(){
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if(osName.contains("osx"))
        {
            factory = new OSXFactory();
            app= new Application(factory);
        }
        else{
            factory = new WinFactory();
            app= new Application(factory);
        }
        return app;
    }

    public static void main(String[] args) {
        Application application = configureApplication();
        application.paint();
    }
}
