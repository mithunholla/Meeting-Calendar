package org.example.models;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Objects;

public class Meeting {

        private int id;
        private String topic;
        private LocalDate meetingDate;
        private LocalTime start;
        private LocalTime end;
        private Person organizer;
        private List<Person> attendants;


    public Meeting(int id, String topic, LocalDate meetingDate, LocalTime start, LocalTime end, Person organizer) {
        this.id = id;
        this.topic = topic;
        this.meetingDate = meetingDate;
        this.start = start;
        this.end = end;
        this.organizer = organizer;
    }

    public void addAttenndant(Person person){   /////////////Method Creation
      if(!attendants.contains(person)){
          attendants.add(person);
      }
    }

   // public compareTo(Meeting){    /////////////Method Creation
 //   }

    public int getId() {
        return id;
    }

    public String getTopic() {
        return topic;
    }

    public LocalDate getMeetingDate() {
        return meetingDate;
    }

    public LocalTime getStart() {
        return start;
    }

    public LocalTime getEnd() {
        return end;
    }

    public Person getOrganizer() {
        return organizer;
    }

    public List<Person> getAttendants() {
        return attendants;
    }

   public boolean removeAttendant(Person person) {     //////////////Method Creation

       return attendants.remove(person);
   }


    public void setTopic(String topic) {
        this.topic = topic;
    }

    public void setMeetingDate(LocalDate meetingDate) {
        this.meetingDate = meetingDate;
    }

    public void setStart(LocalTime start) {
        this.start = start;
    }

    public void setEnd(LocalTime end) {
        this.end = end;
    }

    public void setOrganizer(Person organizer) {
        this.organizer = organizer;
    }

    public void setAttendants(List<Person> attendants) {
        this.attendants = attendants;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Meeting meeting = (Meeting) o;
        return id == meeting.id && Objects.equals(topic, meeting.topic) && Objects.equals(meetingDate, meeting.meetingDate) && Objects.equals(start, meeting.start) && Objects.equals(end, meeting.end) && Objects.equals(organizer, meeting.organizer) && Objects.equals(attendants, meeting.attendants);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, topic, meetingDate, start, end, organizer, attendants);
    }
}
