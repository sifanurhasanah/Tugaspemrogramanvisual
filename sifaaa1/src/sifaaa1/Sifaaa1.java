/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sifaaa1;

/**
 *
 * @author Labkom-M12
 */
import java.util.Scanner;
import java.util.Locale;

public class Sifaaa1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
      
    System.out.println("##  Program Java Menghitung Luas Segitiga  ##");
    System.out.println("=============================================");
    System.out.println();
     
    double a,t, luas;
 
    System.out.print("Input alas segitiga: ");
    a = input.nextDouble();
      
    System.out.print("Input tinggi segitiga: ");
    t = input.nextDouble();
  
    luas = 0.5 * a * t;
      
    System.out.println("Luas segitiga: "+luas);
 
  }
}
        // TODO code application logic here
    }
    
}
