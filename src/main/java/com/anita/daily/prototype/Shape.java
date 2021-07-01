package com.anita.daily.prototype;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Shape implements Cloneable {


    protected String type;
    protected  String data;
    private Integer size;

    public Shape() {
        hitDb();
    }

    abstract void draw();


     public Object clone() {
         Object clone = null;

         try{
             clone = super.clone();
         }catch (CloneNotSupportedException e){
             System.err.println("Exception " +e.getMessage());
         }
         return clone;
    }
    public void hitDb() {
        try {
            System.out.println("Hitting the database");
            Thread.sleep(1000);
            data= "the heavy data";
            System.out.println("ended the database");

        } catch (Exception e) {
            System.out.println("Handled the error");
        }
    }

    @Override
    public String toString() {
        return "Shape{" +
                "type='" + type + '\'' +
                '}';
    }
}
