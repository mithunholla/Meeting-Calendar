package org.example.sequencers;

public class PersonSequencer {

    private static int personid = 1 ;

    public static int nextPersonId(){   /////Method

        return Math.incrementExact(personid);
    }

    public static void reset(){   //////Method

       personid = 1;
    }
}
