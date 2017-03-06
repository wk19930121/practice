/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaPractice;

/**
 *
 * @author Kuan
 */
public class TestRabbit {
    
    public TestRabbit(){
        
    };
    
    // N is the month.
    public static int sumRabbit(int N){
        int k = 1;  //The quantity of the rabbits in the first month
        int m = 0;
        int temp;
        for(int i=1; i < N; i++){
            temp = k;
            k = k + m;
            m = temp;
        }
        return k;
    }
    
}
