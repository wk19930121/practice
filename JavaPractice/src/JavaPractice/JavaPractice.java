/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice;

/**
 * This project is a practice of JAVA programming, what I will do is to realize 
 * a set of mathematical calculations. 
 * 
 * The first function I will deliver is the Max function.
 * @author Kuan
 */
public class JavaPractice {

    public static void main(String[] arg){
        double[] testArray = {10,5,23,4,56,9};
        Max MaxChange = new Max(testArray);
        double maxV = MaxChange.getMax();
        System.out.println("The maximum value in this array is "+maxV);
        
        System.out.println("The ");
    }
    
}
