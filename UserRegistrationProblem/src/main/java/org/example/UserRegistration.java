package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    public void firstName(String name){

        Pattern p = Pattern.compile("[A-Z]{1}[a-z]{2,}");

        Matcher m = p.matcher(name);

        boolean b = m.matches();

        System.out.println("Your entered First name is " + (b ? "valid":"invalid") + ".");
    }

    public void lastName(String name){

        Pattern p = Pattern.compile("[A-Z]{1}[a-z]{2,}");

        Matcher m = p.matcher(name);

        boolean b = m.matches();

        System.out.println("Your entered Last name is " + (b ? "valid":"invalid") + ".");
    }

    public void email(String mail){

        Pattern p = Pattern.compile("^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" + "A-Z]{2,7}$");

        Matcher m = p.matcher(mail);

        boolean b = m.matches();

        System.out.println("Your entered email is " + (b ? "valid":"invalid") + ".");
    }

    public void mobileNum(String num){

        Pattern p = Pattern.compile("(91){0,1}[6-9][0-9]{9}");

        Matcher m = p.matcher(num);

        boolean b = m.matches();

        System.out.println("Your entered Mobile number is " + (b ? "valid":"invalid") + ".");
    }

    public void password(String name){

        Pattern p = Pattern.compile("^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$");

        Matcher m = p.matcher(name);

        boolean b = m.matches();

        System.out.println("Your entered Password is " + (b ? "valid":"invalid") + ".");

    }

}
