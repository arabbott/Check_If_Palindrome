/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromecheck;

import javax.swing.JOptionPane;

/**
 *
 * @author Adam
 */
public class PalindromeCheck {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String input = JOptionPane.showInputDialog(null, "Please enter the word you would like to check is a palindrome:");
        String reversedInput = Reverse(input);
        
        if(input.equals(reversedInput)){
            JOptionPane.showMessageDialog(null, "Yes!  '" + input + "' is a palindrome");
        }
        else{
            JOptionPane.showMessageDialog(null, "Sorry.  '" + input + "' is not a palindrome");
        }
        
        
    }
    
    public static String Reverse(String input){
        String reversedString = null;
        StringBuilder input1 = new StringBuilder();
        input1.append(input);
        input1=input1.reverse(); 
        for (int i=0;i<input1.length();i++){
            input1.charAt(i);
            reversedString = input1.toString();
        }
        return reversedString;
    }
    
}
