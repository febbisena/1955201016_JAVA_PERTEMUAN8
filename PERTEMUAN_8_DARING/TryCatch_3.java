/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PERTEMUAN_8_DARING;

/**
 *
 * @author USER
 */
public class TryCatch_3 {
    public static void main(String[] args) {
        try{
            int data = 50/0;    // may throw exception
                // if exception occurs, the remaining statement will not execute
            System.out.println("Rest of the code");
        }
            // handling the exception
        catch(ArithmeticException e){
            System.out.println(e);
        }
    }
}
