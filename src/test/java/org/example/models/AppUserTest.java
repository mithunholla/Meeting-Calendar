package org.example.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppUserTest {

    public static final String ID = "test_id";
    public static final int ID1 = 1234;
    public static final String USERNAME = "Mithun";
    public static final String PASSWORD = "Svarnika@1234";
    private AppUser testObject;


    @BeforeEach
    void setUp() {

        testObject = new AppUser(

                ID1, USERNAME, PASSWORD
        );
    }

    @Test
    @DisplayName("Test Object")
    void testObjectInstantiation(){
        assertNotNull(testObject);
        assertEquals(ID1, testObject.getId());
        assertEquals(USERNAME, testObject.getUsername() );
        assertEquals(PASSWORD, testObject.getPassword());
    }

    @Test
    @DisplayName("Copy of testObject compare with equals and hash code")
    void copu_equals_and_hashCode(){

        AppUser copy = new AppUser(ID1,USERNAME,PASSWORD);

        assertEquals(copy ,testObject);
        assertEquals(copy.hashCode(), testObject.hashCode());
    }
}