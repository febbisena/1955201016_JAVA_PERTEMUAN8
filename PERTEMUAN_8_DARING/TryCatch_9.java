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
public class TryCatch_9 {
    public static void main(String[] args) {
        try{
            int arr[] = {1, 3, 5, 7};
            System.out.println(arr[10]);    // may throw exception
        }
            // handling the array exception
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        System.out.println("Rest of the code");
    }
}