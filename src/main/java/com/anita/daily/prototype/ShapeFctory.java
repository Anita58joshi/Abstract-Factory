package com.anita.daily.prototype;

public class ShapeFctory {
    private static Shape[] shapes = new Shape[]
            {
                    new Circle(),
                    new Rectangle()
            };

    //you can use Map data structure too

    public static  Shape getShape(String type){
        for (int i =0;i<=shapes.length;i++)
        {
            if(shapes[i].getType().equals(type))
            {
                return (Shape)  shapes[i].clone();
            }
        }
        return null;
    }
}
