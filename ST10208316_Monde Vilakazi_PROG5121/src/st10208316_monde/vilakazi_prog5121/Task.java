/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package st10208316_monde.vilakazi_prog5121;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author monde
 */
public class Task {
    
    public static boolean checkTaskDescription(String taskDescription){
        //variables
        int TaskLength = taskDescription.length();
        boolean correctLength = false;
        
        //conditons to check is task description is 50 characters or less
        if(TaskLength <= 50){
            correctLength = true;
        }else{
            correctLength = false;
        }
        return correctLength;
    }
    
    public static String createTaskID(String taskName, int taskNumber, String developerName){
        //variables and initializing
        String taskID = "";
        String firstLetters = taskName.substring(0,2);
        String lastLetters = developerName.substring(developerName.length() - 3);
        taskID = firstLetters .toUpperCase() + ":" + taskNumber + ":" + lastLetters.toUpperCase();
        return taskID;
    }
    
    public static String printTaskDetails(String taskName, String taskDescription, String developerName, int taskNumber){
        //variables and initializing
        String displayTaskDetails ="";
        String taskID ="";
        
        String firstLetters = taskName.substring(0,2);
        String lastLetters = developerName.substring(developerName.length() - 3);
        taskID = firstLetters .toUpperCase() + ":" + taskNumber + ":" + lastLetters.toUpperCase();
        displayTaskDetails =taskName + taskDescription + developerName + taskID;
        
        return displayTaskDetails;
        
    }
    
    public static int returnTotalHours(int startHour){
        //variables and initializing
        int minutesLeft;
        int endHour = 120;
        
        //setting difference to find minutes left of a task
        minutesLeft = endHour - startHour;
        
        return minutesLeft;
    }
    
    
    
}
