/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parenthesis;

/**
 *
 * @author tsheg
 */
public class Parenthesis {
    public static boolean isValid(String s) {
        if (s == null || s.length() == 0)
            return false;

        int balance = 0;
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                balance++;
            } else if (c == ')' || c == '}' || c == ']') {
                balance--;
                if (balance < 0)
                    return false;
            }
        }
        return balance == 0;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(isValid("()"));//Valid
        System.out.println(isValid("{}{)}"));//Invalid
        System.out.println(isValid(""));//Invalid
        System.out.println(isValid("{[}]"));//Invalid
        System.out.println(isValid("({[]})"));//Valid




        
    }
    
}
