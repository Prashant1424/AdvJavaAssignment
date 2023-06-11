package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        UserRegistration ur = new UserRegistration();

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your First name : ");

        String firstName = scan.next();

        ur.firstName(firstName);

        System.out.println("Enter your Last name : ");

        String lastName = scan.next();

        ur.lastName(lastName);

        System.out.println("Enter your mail : ");

        String email = scan.next();

        ur.email(email);

        System.out.println("Enter your Mobile number : ");

        String mobNum = scan.next();

        ur.mobileNum(mobNum);

        System.out.println("Enter your password : ");

        String psw = scan.next();

        ur.password(psw);

    }

}