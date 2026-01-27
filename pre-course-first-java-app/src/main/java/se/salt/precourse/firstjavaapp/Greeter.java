package se.salt.precourse.firstjavaapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

@SpringBootApplication
public class Greeter implements CommandLineRunner {
  @Autowired
  StartDateHandler startDateHandler;
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
    SpringApplication.run(Greeter.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    System.out.print("What is your name? ");

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String name = reader.readLine();

    String greeting = greet(name);
    System.out.println(greeting);
    System.out.print("When does that course start (yyyy-mm-dd)? ");

    String date = reader.readLine();
    System.out.println("start date: " + date);

    if(startDateHandler.dateHasOnlyNunmbers(date)){
      System.out.println("You start in " + startDateHandler.daysToCourseStart(date) + " day. Better start cracking on that Pre-course!!");
    }else{
      System.out.println("please provide a valid date.");
    }


    System.out.println(greeting);
  }
}
