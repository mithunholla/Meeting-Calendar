package org.example.sequencers;

public class AppUserSequencer {

    private static int appUserid = 1;

     public static int nextAppUserId(){    /////Method

         return Math.incrementExact(appUserid);
     }

    public static void reset(){   //////Method

         appUserid = 1;

    }


}
