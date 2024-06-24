/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bonolodinkoanyane
 */
public class Task {
    private static int taskCounter = 0;

    private String taskName;
    private int taskNumber;
    private String description;
    private String developerFirstName;
    private String developerLastName;
    private int duration;
    private String taskID;
    private String status;

    public Task(String taskName, String description, String developerFirstName, String developerLastName, int duration, String status) {
        this.taskName = taskName;
        this.taskNumber = taskCounter++;
        this.description = description;
        this.developerFirstName = developerFirstName;
        this.developerLastName = developerLastName;
        this.duration = duration;
        this.status = status;
        this.taskID = generateTaskID();
    }
//this method was taken from ChatGPT
//
    private String generateTaskID() {
        String taskInitials = taskName.length() >= 2 ? taskName.substring(0, 2).toUpperCase() : taskName.toUpperCase();
        String developerSuffix = developerLastName.length() >= 3 ? developerLastName.substring(developerLastName.length
        () - 3).toUpperCase() : developerLastName.toUpperCase();
        return String.format("%s:%d:%s", taskInitials, taskNumber, developerSuffix);
    }

    public String getDescription() {
        return description;
    }

    public int getDuration() {
        return duration;
    }

    public boolean checkTaskDescription() {
        return this.description.length() <= 50;
    } 
    
    public int getTaskNumber() {
        
        return taskNumber;
    }

    public String getTaskID() {
        return taskID;
    }

    Object getTaskName() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Object getDeveloperFirstName() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
