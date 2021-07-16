package com.anita.decorator.file;

import java.io.File;
import java.io.FileWriter;
import java.security.Key;
import java.util.Scanner;

public class FileDataSource implements DataSource {

    @Override
    public void writeData(String data ) {
        try {
            FileWriter writer = new FileWriter("Resources/decorator.txt");
            writer.write(data);
            writer.close();
            System.out.println("Successfully wrote to the file.");

        }catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }

    @Override
    public String readData() {
        String str = "";

        try{
            File file = new File("Resources/decorator.txt");
            Scanner myReader = new Scanner(file);
            while (myReader.hasNextLine()){
                str += myReader.nextLine();

            }
            myReader.close();
            System.out.println("Successfully read from the file");



        }catch (Exception ex){
            System.out.println("An error occurred.");
            return "";

        }

        return str;

    }
}
