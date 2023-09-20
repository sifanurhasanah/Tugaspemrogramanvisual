/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sifaa5;

/**
 *
 * @author Labkom-M12
 */
import java.util.Scanner;
public class Sifaa5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        
        int i, n;
        float jum, x, rat;
        
        System.out.print("Banyak Data : ");
        n= input.nextInt();
        jum=0;
        i=1;
        
        while(i<=n){
            System.out.print("Data Ke-"+i+" : ");
            x=input.nextInt();
            jum += x;
            i++;
        }
        rat=jum/n;
        System.out.println("Jumlah : "+jum);
        System.out.println("Rata Rata : "+rat);
        // TODO code application logic here
    }
    
}
    

