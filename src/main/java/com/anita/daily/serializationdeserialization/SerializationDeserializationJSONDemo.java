package com.anita.daily.serializationdeserialization;

import com.fasterxml.jackson.databind.ObjectMapper;

public class SerializationDeserializationJSONDemo {

    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
        Staff staff1 = new Staff(1L,"Anisha","Babolo");
        try {

            String json = objectMapper.writeValueAsString(staff1);
            System.out.println(json);
        }catch (Exception ex){
            System.out.println(ex);
        }


        String json ="\n" +
                "{\n" +
                "\"id\":1,\n" +
                "\"name\":\"Anita\",\n" +
                "\"departmentName\": \"Carlos\"\n" +
                "\n" +
                "}";
        try {

            Staff staff = objectMapper.readValue(json, Staff.class);
            System.out.println(staff);
        }catch (Exception ex){
            System.out.println(ex);
        }

    }


}
