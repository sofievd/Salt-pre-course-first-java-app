package se.salt.precourse.firstjavaapp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;


public class Greeter {
//  private static String greet(String namePassedIn, String date) {
//    LocalDate now = LocalDate.now();
//    LocalDate localDate = LocalDate.parse(date);
//    long daysLeft = ChronoUnit.DAYS.between(now, localDate);
//
//    return "Welcome to SALT, " + namePassedIn +
//            "\n Today it is " + daysLeft + " days left until the course starts" ;
//  }
  public static String greet(String namePassedIn) {
    if(namePassedIn.isBlank()){
      return "Error. Enter a name";
    }
    if(namePassedIn.contains(",")){
      int index = namePassedIn.indexOf(",");

      String firstName = namePassedIn.substring(0,index);
      String secondName= namePassedIn.substring(index+2);
      return "Welcome to SALT, " + firstName + " and " + secondName;
    }
    else{
      return "Welcome to SALT, " + namePassedIn ;
    }
  }

  public static void main(String[] args) throws IOException {
    System.out.print("What is your name? ");

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String name = reader.readLine();

    String greeting = greet(name);
    System.out.println(greeting);
    System.out.print("When does that course start (yyyy-mm-dd)? ");

    String date = reader.readLine();
    System.out.println("start date: " + date);

    StartDateHandler startDateHandler = new StartDateHandler();
    if(startDateHandler.dateHasOnlyNunmbers(date)){
          System.out.println("You start in " + startDateHandler.daysToCourseStart(date) + " day. Better start cracking on that Pre-course!!");
    }else{
      System.out.println("please provide a valid date.");
    }


    System.out.println(greeting);
  }
}
