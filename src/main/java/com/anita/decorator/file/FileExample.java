package com.anita.decorator.file;

import java.io.File;
import java.io.FileWriter;
import java.security.Key;
import java.util.Scanner;

//Voids SRP and OECM
public class FileExample {

    public String readData(String key){
        String str = "";

       try{
           File file = new File("Resources/decorator.txt");
           Scanner myReader = new Scanner(file);
           while (myReader.hasNextLine()){
              str += myReader.nextLine();

           }
           myReader.close();
           System.out.println("Successfully read from the file");
           str = Aesenc.decrypt(str,key);


       }catch (Exception ex){
           System.out.println("An error occurred.");
           return "";

       }

       return str;
    }

    public void writeData(String data, String key){
        try {
            FileWriter writer = new FileWriter("Resources/decorator.txt");
            String encrypted = Aesenc.encrypt(data,key);
            writer.write(encrypted);
            writer.close();
            System.out.println("Successfully wrote to the file.");

        }catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }


    }

    public static void main(String[] args) throws Exception {
        FileExample fileExample = new FileExample();

//        fileExample.writeData("k xa kta/kti haru!!",key);
        System.out.println(fileExample.readData("thebestsecretkey"));
    }

}
