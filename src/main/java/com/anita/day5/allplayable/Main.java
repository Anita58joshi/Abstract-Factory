package com.anita.day5.allplayable;

import com.anita.day5.playable.Playable;
import com.anita.day5login.FacebookLogin;
import com.anita.day5login.Login;

public class Main
{
    public static void main(String[] args)
    {
        //abstract     //concrete
//        Ball ball= new BasketballV2();
//       ball.play();
//        justPlay(new Guitar());
        Login login = new FacebookLogin();
        login.process();


    }
   public static void justPlay(Playable playable){
        playable.play();
   }

}
