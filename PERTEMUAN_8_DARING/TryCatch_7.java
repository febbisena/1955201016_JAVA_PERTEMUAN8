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
public class TryCatch_7 {
    public static void main(String[] args) {
        try{
            int data1 = 50/0;   // may throw exception
        }
            // handling the exception
        catch(Exception e){
            // generating the exception in catch block
            int data2 = 50/0;   // may throw exception
        }
        System.out.println("Rest of the code");
    }
}
