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
public class JavaMath_1 {
    public static void main(String[] args) {
        double x = 28;
        double y = 4;
        
        // bilangan terbesar antara x dan y
        System.out.println("Maximum number of x and y is    : " +Math.max(x, y));
        
        // akar dari y
        System.out.println("Square root of y is             : " +Math.sqrt(y));
        
        // 28 pangkat 4
        System.out.println("Power of x and y is             : " +Math.pow(x, y));
        
        // logaritma natural dari x dan y
        System.out.println("Logarithm of x is               : " +Math.log(x));
        System.out.println("Logarithm of y is               : " +Math.log(y));
        
        // log 10 dari x dan y
        System.out.println("log10 of x is                   : " +Math.log10(x));
        System.out.println("log10 of y is                   : " +Math.log10(y));
        
        // hasil dari ln(x+1)
        System.out.println("log1p of x is                   : " +Math.log1p(x));
        
        // eksponen dari x atau e^x
        System.out.println("exp of x is                     : " +Math.exp(x));
        
        // hasil dari (e^x)-1
        System.out.println("expm1 of x is                   : " +Math.expm1(x));
    }
}
