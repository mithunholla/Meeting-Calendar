package org.example.models;

import org.junit.jupiter.api.BeforeEach;
import org.example.models.Person;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    private Person testObject;
    private AppUser AppUser;

    @BeforeEach
    void setUp() {

        testObject = new Person(123, "mithun", "surathkal", "mithunholla@gmail.com", AppUser);
    }


    @Test
    @DisplayName("Test Object")
    void testObjectInstantiation() {
        assertNotNull(testObject);
        assertEquals(123, testObject.getId());
        assertEquals("mithun", testObject.getFirstName());
        assertEquals("surathkal", testObject.getLastName());
        assertEquals("mithunholla@gmail.com", testObject.getEmail());
    }


    @Test
    @DisplayName("Copy of testObject compare with equals and hash code")
    void copu_equals_and_hashCode() {

        Person copy = new Person(123, "mithun", "surathkal", "mithunholla@gmail.com", AppUser);

        assertEquals(copy, testObject);
        assertEquals(copy.hashCode(), testObject.hashCode());
    }
}