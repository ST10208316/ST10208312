/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package st10208316_monde.vilakazi_prog5121;

import java.util.*;
import javax.swing.*;

public class ST10208316_MondeVilakazi_PROG5121 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner mm1 = new Scanner(System.in);
        JFrame mm2 = new JFrame();
        
        System.out.println("Enter your first name>>>");
        String firstName = mm1.nextLine();
        
        System.out.println("Enter your last name>>>");
        String lastName = mm1.nextLine();
        
        System.out.println("create a username>>>");
        String username = mm1.nextLine();
        
        System.out.println("Create a password>>>");
        String password = mm1.nextLine();
        
        System.out.println("----------Login-----------");
        
        System.out.println("Enter your username>>>");
        String passWord = mm1.nextLine();
        
        System.out.println("Enter your password>>>");
        String userName = mm1.nextLine();
        
        
        System.out.println(Login.checkUsername(username));
        System.out.println(Login.checkPasswordComplexity(passWord));
        System.out.println(Login.registerUser(true, true));
        System.out.println(Login.loginUser(username, userName, password, passWord));
        System.out.println(Login.returnLoginStatus(true, true));
        System.out.println("Welcome back "+firstName + lastName + ", it is great to see you back");
        
        //Task 2
        //display message 
        JOptionPane.showMessageDialog(mm2,"Welcome to Kanban");
        
        //initializing a variable
        int a=0;
        
        //loop to always come back to the menu
        while(a != 3){
            
        //display input message for choosing option    
            int promptOption = Integer.parseInt(JOptionPane.showInputDialog(mm2,"Choose option below: " + "\n"
                    + "1.Add Task\n"
                    + "2.Show Report\n"
                    + "3.Exit"));
            
        //condition to display whatever the user punched in the option prompt    
            if(promptOption ==1){
        
        //variables
                int taskNumber = Integer.parseInt(JOptionPane.showInputDialog(mm2,"Number of tasks"));
                boolean isYes;
                boolean isNo;
                boolean isCancel;
                
        //loop for altering the number of times has entered 
                for(int i=0; i < taskNumber; i++){
                    
        //displaying input messages
                    String taskName = JOptionPane.showInputDialog(mm2,"Name of task","Task Name",JOptionPane.INFORMATION_MESSAGE);
                    String taskDescription = JOptionPane.showInputDialog(mm2,"Enter task description","Description",JOptionPane.INFORMATION_MESSAGE);
                    String developerName = JOptionPane.showInputDialog(mm2,"Name of developer","Developer Name",JOptionPane.INFORMATION_MESSAGE);
                    int startHour = Integer.parseInt(JOptionPane.showInputDialog(mm2,"Duration of the task","Duration",JOptionPane.INFORMATION_MESSAGE));
                    
        //displaying task details with methods from an external classes
                    JOptionPane.showMessageDialog(mm2,"Report \n" + Task.printTaskDetails("Task name: " + taskName + "\n","Task Description: " + taskDescription + "\n","Developer name: " + developerName + "\nDeveloper ID: ", + taskNumber) + "\n"
                            + "Duration Left: " + Task.returnTotalHours(startHour) + "minutes","Message",JOptionPane.INFORMATION_MESSAGE);
                    
                    }
                
        //displaying input message before the end of the program
                int selection = JOptionPane.showConfirmDialog(mm2,"Are you completed with your task");
                    
        //condition to display whatever the user punched in the yes or no prompt       
                    if(selection == 1){
                        
                        isYes = (selection == JOptionPane.YES_OPTION);
                        JOptionPane.showMessageDialog(mm2,"STATUS: Done");
                        
                    }else if(selection ==2){
                        
                        isNo = (selection == JOptionPane.NO_OPTION);
                        JOptionPane.showMessageDialog(mm2, "STATUS: TO DO");
                        
                    }else if(selection ==3){
                        
                        isCancel = (selection == JOptionPane.CANCEL_OPTION);
                        JOptionPane.showMessageDialog(mm2,"STATUS: DOING");
                    
                }
                
        //condition to display whatever the user punched in the option prompt
            }else if(promptOption ==2){
                
                JOptionPane.showMessageDialog(mm2,"Coming soon","New feature",JOptionPane.INFORMATION_MESSAGE);
                
            }else if(promptOption ==3){
                
                a=3;
                System.exit(0);
                
            }
        
        }
    }
    
}
