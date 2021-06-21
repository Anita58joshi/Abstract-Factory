package com.anita.day5;

public class Main
{
    public static void main(String[] args)
    {
        //abstract     //concrete
//        Ball ball= new BasketballV2();
//       ball.play();
        justPlay(new BasketballV2());

    }
   public static void justPlay(Ball ball){
        ball.play();
   }

}
