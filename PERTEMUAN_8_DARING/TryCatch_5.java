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
public class TryCatch_5 {
    public static void main(String[] args) {
        try{
            int data = 50/0;    // may throw exception
        }
            // handling the exception
        catch(Exception e){
            // displaying the custom message
            System.out.println("Can't divided by zero");
        }
    }
}
