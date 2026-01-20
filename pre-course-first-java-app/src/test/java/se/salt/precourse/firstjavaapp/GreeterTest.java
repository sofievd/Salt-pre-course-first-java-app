package se.salt.precourse.firstjavaapp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreeterTest {

    @Test
    void greetTestMarcus() {
        String greeting = Greeter.greet("Marcus");
        String expectedGreeting = "Welcome to SALT, Marcus";

        assertEquals(expectedGreeting, greeting);
    }

}