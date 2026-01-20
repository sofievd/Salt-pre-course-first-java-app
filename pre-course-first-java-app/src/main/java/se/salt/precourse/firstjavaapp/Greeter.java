package se.salt.precourse.firstjavaapp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;


public class Greeter {
  private static String greet(String namePassedIn, String date) {
    LocalDate now = LocalDate.now();
    LocalDate localDate = LocalDate.parse(date);
    long daysLeft = ChronoUnit.DAYS.between(now, localDate);

    return "Welcome to SALT, " + namePassedIn +
            "\n Today it is " + daysLeft + " days left until the course starts" ;
  }
  public static String greet(String namePassedIn) {
    return "Welcome to SALT, " + namePassedIn ;
  }

  public static void main(String[] args) throws IOException {
    System.out.print("What is your name? ");

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String name = reader.readLine();

    System.out.print("When does that course start? ");

    String date = reader.readLine();

    String greeting = greet(name,date);

    System.out.println(greeting);
  }
}
