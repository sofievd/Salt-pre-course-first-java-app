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
    @Test
    void greetTestEliza() {
        String greeting = Greeter.greet("Eliza");
        String expectedGreeting = "Welcome to SALT, Eliza";

        assertEquals(expectedGreeting, greeting);
    }

    @Test
    void greetTestEmptyString() {
        String greeting = Greeter.greet("");
        String expectedGreeting = "Error. Enter a name";
        assertEquals(expectedGreeting, greeting);
    }

}