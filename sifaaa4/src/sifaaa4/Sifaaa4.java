/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sifaaa4;

/**
 *
 * @author Labkom-M12
 */
import java.util.Scanner;
public class Sifaaa4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
        int bil;
        System.out.println("PROGRAM MENENTUKAN BILANGAN GANJIL & GENAP");
        System.out.println("-------------------------------------------------");
        System.out.print("Masukan Bilangan = ");
        bil=input.nextInt();
        
        if (bil%2==0){
            System.out.println("Bilangan "+bil+" adalah bilangan genap");
        }else {
             System.out.println("Bilangan "+bil+" adalah bilangan ganjil");
        }
    
  }
}
        // TODO code application logic here
    }
    
}
