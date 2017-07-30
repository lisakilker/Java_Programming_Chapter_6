/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package W3HW;

/**
 *
 * @author Lisa
 */
public class Perfect {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x;
        int number = 1;
        int sum;
        int limit = 1000;
        
         while (number <= limit){
             sum = 0;
             x = 1;
             while (x < number){
                 if(number % x == 0)
                     sum += x;
                 x++;
             }
             if(sum == number)
                 System.out.println(number + " is a perfect number.");
             number++;
             }
         }
}
    

