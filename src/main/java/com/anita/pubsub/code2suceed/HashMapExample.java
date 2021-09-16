package com.anita.pubsub.code2suceed;

public class HashMapExample {
   static Object[] heroes = new String[10];

    public static void main(String[] args) {

     put("IronMan");
     put("SpiderMan");
     put("BatMan");
     put("WonderWoman");

     get("IronMan");

    }

    public static Object get(Object obj){
        int formattedKey = getKey(obj);
        return heroes[formattedKey];
    }



    public static void put(Object obj){

        int formattedKey = getKey(obj);
        heroes[formattedKey] = obj;
    }

    public static  int getKey(Object obj){
        int rawKey = obj.hashCode();
        System.out.println("rawKey"+ rawKey);
        System.out.println("mod"+rawKey % heroes.length);
        System.out.println("mod with abs"+ Math.abs(rawKey % heroes.length));

        return Math.abs(rawKey % heroes.length);
    }

}
