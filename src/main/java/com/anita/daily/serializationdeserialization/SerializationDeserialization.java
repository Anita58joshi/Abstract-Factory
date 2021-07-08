package com.anita.daily.serializationdeserialization;

import java.io.*;

public class SerializationDeserialization {
    public static void main(String[] args) {


        //object => Byes/String = serialization
        //Bytes/String =>Object = Deserialization
//
//        UserData anitaData = UserData
//                .builder()
//                .username("Anita")
//                .highScore(1000234L)
//                .totalGamePlayed(18)
//                .level(5)
//                .build();
//
//        try {
//            FileOutputStream fileOutputStream = new FileOutputStream("E:\\anita.data");
//            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
//            objectOutputStream.writeObject(anitaData);
//            objectOutputStream.close();
//            fileOutputStream.close();
//
//        } catch (Exception ex) {
//            System.out.println(ex);
//
//        }

         try {
             FileInputStream fileInputStream = new FileInputStream("E:\\anita.data");
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
             UserData userData = (UserData) objectInputStream.readObject();
             System.out.println(userData);
             fileInputStream.close();
             objectInputStream.close();
         }catch (Exception ex){
             System.out.println(ex);
         }

    }


}
