package W3HW;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lisa
 */
public class EverySum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int firstNumber;
        int nextNumber;
        int totalSum;
        int limit = 50;
        
        for (firstNumber = 1; firstNumber <= limit; firstNumber++){
            totalSum = 0;
        for (nextNumber = 1; nextNumber <= firstNumber; nextNumber++){
            totalSum += nextNumber;
        }
        System.out.println("The total sum is:  " + totalSum);
        
        }
    }
    
}
    

