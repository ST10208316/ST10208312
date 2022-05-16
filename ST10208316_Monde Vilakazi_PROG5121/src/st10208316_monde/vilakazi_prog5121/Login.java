/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package st10208316_monde.vilakazi_prog5121;

/**
 *
 * @author monde
 */
public class Login {
    
    public static boolean checkUsername(String username){
        //variables
        int lengthUsername = username.length();
        boolean isCorrect = false;
        char q = '_';
        
        //loop for identifying underscore
        for(int i=0; i < lengthUsername; i++){
        //condition to see if the password has an underscore
            if(lengthUsername == q){
                isCorrect = true;
                break;
            }else{
                isCorrect = false;
            }
        
        }
        
        //loop for checking length
        for(int i=0; i < lengthUsername; i++){
        //condition to check if username is 5 characters or less
            if(lengthUsername <= 5){
                isCorrect = true;
                break;
            }else{
              isCorrect = false;
            }
        
        }
        return isCorrect;
        
    }
    
    public static boolean checkPasswordComplexity(String password){
        //variables
        int lengthPassword = password.length();
        boolean isCorrect = false;
        final int NUM_UPPER_LETTERS =1;
        int upperCount =0;
        
        //condition to check if password is 8 characters or less, has a capital letter and a digit
        if(lengthPassword ==8 && upperCount <= NUM_UPPER_LETTERS){
            isCorrect = true;
        }else{
            isCorrect = false;
        }
        
        //loop for checking a special character
        for(int i=0; i < lengthPassword; i++){
        //condition to check if password has a character
            if(lengthPassword ==33 && lengthPassword <=47 || lengthPassword ==58 && lengthPassword <= 64 || lengthPassword ==91 && lengthPassword <=96 || lengthPassword ==123 &&  lengthPassword<=126){
                isCorrect = true;
                break;
            }else{
                isCorrect = false;
            }
        }
        
        //loop for checking a digit
        for(int i=0; i < lengthPassword; i++){
        //condition to check if password has a digit
            if(lengthPassword ==48 && lengthPassword <57){
                isCorrect = true;
                break;
            }else{
                isCorrect = false;
            }
        }return isCorrect;
    }
    
    public static String registerUser(boolean username, boolean password){
        //variable
        String message ="";
        
        //condition to display messages that meet up with the login detials of the user
        if(!username){
            message += "The username is incorreectly formatted";
        }
        if(!password){
            message += "The password deos not meest the complexity requirements";
        }
        if(username && password){
            message += "The user has been sucessfully registered";
        }
        return message;
    }
    
    public static boolean loginUser(String username, String punchedUsername, String password, String punchedPassword){
        //variable
        boolean isCorrect = false;
        
        //condition to check if username and password with ones that were punched in
        if(username != punchedUsername){
            isCorrect = false;
        }
        if(password != punchedPassword){
            isCorrect = false;
        }
        if(username.equals(punchedUsername) && password.equals(punchedPassword)){
            isCorrect = true;
        }
        return isCorrect;
     }
    
    public static String returnLoginStatus(boolean punchedUsername, boolean punchedPassword){
        //variable
        String message ="";
        
        //condition to display messages that meet up with the login detials of the user
        if(!punchedUsername && punchedPassword){
            message += "A failed login";
        }
        if(punchedUsername && punchedPassword){
            message += "A successful login";
        }return message;
    }
    
}
