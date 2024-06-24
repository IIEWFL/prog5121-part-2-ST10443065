/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.demo.createkanbanaccount;
 import java.util.Scanner;
/**
 *
 * @author bonolodinkoanyane
 */
public class CreateKanbanAccount {

    //this method was taken from JAVA Programming Tenth Edition
    //Figure 2-22 The GetUserInfo3 class page 61
    //Joyce Farrell
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for account creation 
        System.out.println("Enter username :");
        String username = scanner.nextLine();

        System.out.println("Enter password :");
        String password = scanner.nextLine();

        System.out.println("Enter first name:");
        String firstName = scanner.nextLine();

        System.out.println("Enter last name:");
        String lastName = scanner.nextLine();

        
        if (checkUsername(username)) {
            // Validate password
            if (checkPasswordComplexity(password)) {
                
                System.out.println("Account created successfully.");
                System.out.println("Username: " + username);
                System.out.println("First Name: " + firstName);
                System.out.println("Last Name: " + lastName);
                } 
            else {
                // Display error message for incorrect password format
                System.out.println("Password is not correctly formatted, please ensure that the password contains at least 8 characters, "
                        + "a capital letter, a number and a special character.");
                }
        }       
        else {
            // Displays error message for invalid username format
            System.out.println("Invalid username! Username must be no more than 5 characters long and contain an underscore.");
        }
    }

    // Username validation
    public static boolean checkUsername(String username) { 
        
        if(username.length() >5 && username.contains("")) {
            return false;
        }
        return username.length() <= 5 && username.contains("_");
    }

    // Password Validation
    public static boolean checkPasswordComplexity(String password) {
        // Checks the length of the password
        if (password.length() < 8)
            return false;

        // Checks for capital letters, numbers, and special characters in the created password
        boolean hasCapital = false;
        boolean hasNumber = false;
        boolean hasSpecial = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasCapital = true;
            } else if (Character.isDigit(c)) {
                hasNumber = true;
            } else if (!Character.isLetterOrDigit(c)) {
                hasSpecial = true;
            }
        }

        return hasCapital && hasNumber && hasSpecial;
    } 
}


