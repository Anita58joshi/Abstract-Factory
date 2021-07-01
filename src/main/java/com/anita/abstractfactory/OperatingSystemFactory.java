package com.anita.abstractfactory;

public class OperatingSystemFactory {

    public static Application configureApplication(){
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
}
