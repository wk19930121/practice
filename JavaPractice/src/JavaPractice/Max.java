/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaPractice;

/**
 * In this part, a Max function will be delivered.
 * @author Kuan
 */
public class Max {
    
    double[] array; //This is the array to compare
    double maxValue; //This is the maximum value
    
    public Max(double[] A){
        
        array = new double[A.length];   
        System.arraycopy(A, 0, array, 0, A.length);
        //Input is transfered to the local variable
    }// This is constructor
    
    public double getMax(){
        for(int i=0;i<array.length-1;i++){
            if (array[i]<array[i+1]){
                maxValue = array[i+1];
            }
            else{
                maxValue = array[i];
            }
        }
        return maxValue;
    }
    

}
