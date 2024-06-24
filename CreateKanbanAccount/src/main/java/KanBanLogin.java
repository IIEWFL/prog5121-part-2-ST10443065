/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author bonolodinkoanyane
 */
import static com.demo.createkanbanaccount.CreateKanbanAccount.checkPasswordComplexity;
import static com.demo.createkanbanaccount.CreateKanbanAccount.checkUsername;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Scanner;

public class KanBanLogin {
    private static String username;
    private static String password;
    private static String firstName;
    private static String lastName;
    private static Scanner scanner = new Scanner(System.in);
    static ArrayList<Task> tasks = new ArrayList<>();

    public static void main(String[] args) {        
        System.out.println("Enter username:");
        KanBanLogin.username = scanner.nextLine();

        System.out.println("Enter first name:");
        KanBanLogin.firstName = scanner.nextLine();

        System.out.println("Enter last name:");
        KanBanLogin.lastName = scanner.nextLine();

        System.out.println("Enter password:");
        KanBanLogin.password = scanner.nextLine();

        boolean userNameCheck = checkUserName(KanBanLogin.username);
        boolean passwordCheck = checkPasswordComplexity(KanBanLogin.password);

        if (userNameCheck && passwordCheck) {
            System.out.println("User registered successfully");

            System.out.println("Enter login username:");
            String loginUsername = scanner.nextLine();

            System.out.println("Enter login password:");
            String loginPassword = scanner.nextLine();

            boolean loginResult = loginUser(loginUsername, loginPassword);
            System.out.println(returnLoginStatus(loginResult));

            if (loginResult) {
                displayWelcomeMessage();
                mainApplication();
            }
        } 
        else {
            if (!userNameCheck) {
                System.out.println("Username is not correctly formatted, please ensure that your username contains"
                        + " an underscore and is no more than 5 characters in length.");
            }
            if (!passwordCheck) {
                System.out.println("Password is not correctly formatted, please ensure that the password contains"
                        + " at least 8 characters, a capital letter, a number, and a special character.");
            }
        }
    }

    public static boolean checkUserName(String username) {
        return checkUsername(username);
    }

    public static boolean loginUser(String username, String password) {
        return KanBanLogin.username.equals(username) && KanBanLogin.password.equals(password);
    }

    public static String returnLoginStatus(boolean status) {
        if (status) {
            return "Welcome " + firstName + " " + lastName + ", it is great to see you again.";
        } else {
            return "Username or password incorrect, please try again.";
        }
    }

    public static void displayWelcomeMessage() {
        JOptionPane.showMessageDialog(null, "Welcome to EasyKanban", "Welcome", JOptionPane.INFORMATION_MESSAGE);
    }
    // this method was taken from JAVA Programming Tenth Edition
    // Using the JoptionPane Class to Accept GUI Input (page 64 chapter 2.7)
    //Joyce Farrell
    public static void mainApplication() {
        boolean exit = false;
        while (!exit) {
            String input = JOptionPane.showInputDialog(
                null,
                "Choose an option:\n1) Add tasks\n2) Show report\n3) Quit",
                "Menu",
                JOptionPane.PLAIN_MESSAGE
            );

            if (input == null) {
                //close dialogue
                exit = true;
                continue;
            }

            int choice;
            try {
                choice = Integer.parseInt(input);
                } 
            catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter a number between 1 and 3."
                        , "Error", JOptionPane.ERROR_MESSAGE);
                continue;
                }

            switch (choice) {
                case 1:
                    addTasks();
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Coming Soon", "Report", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 3:
                    exit = true;
                    break;
            }
        }
    }

    public static void addTasks() {
        String input = JOptionPane.showInputDialog(null, "How many tasks would you like to add?", "Add Tasks", JOptionPane.PLAIN_MESSAGE);
        if (input == null) {
            return; 
        }

        int numberOfTasks;
        try {
            numberOfTasks = Integer.parseInt(input);
            } 
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int totalHours = 0;

        for (int i = 0; i < numberOfTasks; i++) {
            String taskName = JOptionPane.showInputDialog(null, "Enter task " + (i + 1) + " name:", "Task Name", JOptionPane.PLAIN_MESSAGE);

            if (taskName == null) {
                return; 
            }

            String taskDescription = JOptionPane.showInputDialog(null, "Enter task " + (i + 1) + " description:", "Task Description", JOptionPane.PLAIN_MESSAGE);

            if (taskDescription == null) {
                return; 
            }

            while (!checkTaskDescription(taskDescription)) {
                taskDescription = JOptionPane.showInputDialog(null, "Task description is too long. "
                        + "Please enter a description of 50 characters or less.", "Task Description", JOptionPane.ERROR_MESSAGE);

                if (taskDescription == null) {
                    return; // Handle cancel button press or close dialog
                }
            }

            JOptionPane.showMessageDialog(null, "Task successfully captured", "Task Description", JOptionPane.INFORMATION_MESSAGE);

            String developerFirstName = JOptionPane.showInputDialog(null, "Enter developer's first name:", "Developer First Name", JOptionPane.PLAIN_MESSAGE);

            if (developerFirstName == null) {
                return; 
            }

            String developerLastName = JOptionPane.showInputDialog(null, "Enter developer's last name:", "Developer Last Name", JOptionPane.PLAIN_MESSAGE);

            if (developerLastName == null) {
                return; 
            }

            String durationInput = JOptionPane.showInputDialog(null, "Enter task " + (i + 1) + " duration in hours:", "Task Duration", JOptionPane.PLAIN_MESSAGE);

            if (durationInput == null) {
                return; 
            }

            int taskDuration;
            try {
                taskDuration = Integer.parseInt(durationInput);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number for task duration.", "Error", JOptionPane.ERROR_MESSAGE);
                i--; // Decrement to retry the current task input
                continue;
            }

            totalHours += taskDuration;

            String[] statusOptions = { "To Do", "Doing", "Done" };
            String status = (String) JOptionPane.showInputDialog(null, "Select task status:", "Task Status", 
                    JOptionPane.PLAIN_MESSAGE, null, statusOptions, statusOptions[0]);

            if (status == null) {
                return; 
            }

            Task task = new Task(taskName, taskDescription, developerFirstName, developerLastName, taskDuration, status);
            tasks.add(task);

            JOptionPane.showMessageDialog(null, "Task " + (i + 1) + ": " + task + " added.", 
                    "Task Added", JOptionPane.INFORMATION_MESSAGE);
        
        JOptionPane.showMessageDialog(null, String.format("""
                                                          Task %d Details:
                                                          Status: %s
                                                          Developer: %s %s
                                                          Task Number: %d
                                                          Task Name: %s
                                                          Task Description: %s
                                                          Task ID: %s
                                                          Duration: %d hours""",
                (i + 1), status, developerFirstName, developerLastName, task.getTaskNumber(), taskName, 
                taskDescription, task.getTaskID(), taskDuration),
                "Task Added", JOptionPane.INFORMATION_MESSAGE);
        } 
        JOptionPane.showMessageDialog(null, "Total number of hours across all tasks: " + 
                totalHours, "Total Hours", JOptionPane.INFORMATION_MESSAGE);
    }

    public static boolean checkTaskDescription(String description) {
        return description.length() <= 50;
    }
}
