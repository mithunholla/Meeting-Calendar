package org.example.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class MeetingTest {


    private Meeting testObject;

    @BeforeEach
    void setUp() {

        testObject = new Meeting(234, "meeting", "2021-05-08", "9.45", "11.45", "mithun"

        );
    }

    @Test
    @DisplayName("Test Object")
    void testObjectInstantiation() {
        assertNotNull(testObject);
        assertEquals(234, testObject.getId());
        assertEquals("meeting", testObject.getTopic());
        assertEquals("2021-05-08", testObject.getMeetingDate());
        assertEquals("9.45", testObject.getStart());
        assertEquals("11.45", testObject.getEnd());
        assertEquals("Mithun", testObject.getOrganizer());
        assertEquals("Mithun,Lakshmi", testObject.getAttendants());
    }
}
