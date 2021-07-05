package com.anita.daily.adapter2.v2;

import com.anita.daily.adapter2.v2.external.FileReader;
import com.anita.daily.adapter2.v2.external.MyFileReader;


public class AdapterMainV2 {

    public static void main(String args[])  {
        FileReader fileReader = new MyFileReader();
        System.out.println(fileReader.read());

        DatabaseReader databaseReader = new MyAdapter(new MyFileReader());
        Student[] students = (Student[]) databaseReader.executeQuery();
        for(Student student: students){
            System.out.println(student);
        }
    }

}
