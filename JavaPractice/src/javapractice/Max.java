/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice;

/**
 * In this part, a Max function will be delivered.
 * @author Kuan
 */
public class Max {
    
    double[] array; //This is the array to compare
    int N;  //This is the length of the array
    double maxValue; //This is the maximum value
    
    public Max(double[] A){
        array = new double[A.length];
        System.arraycopy(A, 0, array, 0, A.length);
        N = A.length;
    }
    
    public double max(){
        for(int i=0;i<N-1;i++){
            if (array[i]<array[i+1]){
                maxValue = array[i+1];
            }
            else{
                maxValue = array[i];
            }
        }
        return maxValue;
    }
    
    public static void main(String[] arg){
        double[] testArray = {10,5,23,4,56,9};
        Max MaxChange = new Max(testArray);
        double maxV = MaxChange.max();
        System.out.println("The maximum value in this array is "+maxV);
    }
}
