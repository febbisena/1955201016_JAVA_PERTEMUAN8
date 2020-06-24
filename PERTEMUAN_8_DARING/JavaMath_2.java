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
public class JavaMath_2 {
    public static void main(String[] args) {
       double a = 30;
       
       // convert nilai ke radian
       double b = Math.toRadians(a);
       
       // hasil dari sin a
        System.out.println("Sine value of a is      : " +Math.sin(a));
        
        // hasil dari cos a
        System.out.println("Cosine value of a is    : " +Math.cos(a));
        
        // hasil dari tan a
        System.out.println("Tangent value of a is   : " +Math.tan(a));
        
        // hasil dari arc sin a
        System.out.println("Sine value of a is      : " +Math.asin(a));
        
        // hasil dari arc cos a
        System.out.println("Cosine value of a is    : " +Math.acos(a));
        
        // hasil dari arc tan a
        System.out.println("Tangent value of a is   : " +Math.atan(a));
        
        // nilai sin hiperbolik dari a
        System.out.println("Sine value of a is      : " +Math.sinh(a));
        
        // nilai cos hiperbolik dari a
        System.out.println("Cosine value of a is      : " +Math.cosh(a));
        
        // nilai tan hiperbolik dari a
        System.out.println("Tangent value of a is      : " +Math.tanh(a));
    }
}
