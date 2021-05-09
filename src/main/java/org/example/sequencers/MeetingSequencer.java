package org.example.sequencers;

public class MeetingSequencer {

    private static int meetingid = 1 ;

    public static int nextMeetingId(){    /////Method

        return Math.incrementExact(meetingid);
    }

    public static void reset(){   //////Method

        meetingid = 1;
    }
}
