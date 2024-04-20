/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package generator.function;
import java.util.stream.IntStream;
/**
 *
 * @author tsheg
 */
public class GeneratorFunction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int limit = 30; // Change this to your desired limit
        IntStream.iterate(1, n -> n + 2)
                .map(n -> n * n)
                .limit(limit)
                .reduce((a, b) -> a + b)
                .ifPresent(sum -> System.out.println("Sum of squares of odd numbers up to " + limit + ": " + sum));
    }


    
        
}

    
    

