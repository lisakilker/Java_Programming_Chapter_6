/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package W3HW;
import java.util.Scanner;
/**
 *
 * @author Lisa
 */
public class EvenOdd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int evenOdd;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Give me a number... ");
        evenOdd = input.nextInt();
        
        if(evenOdd%2==0)
        System.out.println("Your number is even");
        
        else
            System.out.println("Your number is odd");
    }
}

