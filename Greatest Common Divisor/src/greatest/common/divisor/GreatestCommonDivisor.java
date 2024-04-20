/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package greatest.common.divisor;

/**
 *
 * @author tsheg
 */
public class GreatestCommonDivisor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        int a = 20;
        int b = 30;
        int gcd = greatestCommonDivisor(a, b);
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd);
    }

    public static int greatestCommonDivisor(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

    
    

