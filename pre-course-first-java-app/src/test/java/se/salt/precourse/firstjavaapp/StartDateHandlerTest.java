package se.salt.precourse.firstjavaapp;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class StartDateHandlerTest {

    @Test
    void returns2ForDateTwoDaysInTheFuture() {
        LocalDate twodaysInTheFuture = LocalDate.now().plusDays(2);
        long two = new StartDateHandler().daysToCourseStart(twodaysInTheFuture.toString());
        assertEquals(2, two);
    }


}