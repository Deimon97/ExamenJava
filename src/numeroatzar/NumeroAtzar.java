/*
 * Main the app numeroatzar, write a number and validate is integer and take number is the number maxim for the game adivinate the numbe generate foir the pc
 * Date:25/11/16
 */
package numeroatzar;

import java.lang.Math;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Kevin Casanova Armada
 * @version 1.9
 */
public class NumeroAtzar {

    
    public static void main(String[] args) {
        
        NumeroAtzarClass atz =new NumeroAtzarClass();
        Scanner lector = new Scanner(System.in);  
        int comptador=0;
        int n=0;
        
        do{
            try{
                    System.out.println("Introdueix un numero entre 1 y el que quieras  entero sera el maximo");
                    n=(Integer.parseInt(lector.nextLine()));
                    }catch (NumberFormatException error){
                        n=-1;
                        System.out.println("Només pots escriure un número enter. Torna-ho a provar");
                    }
        }while(n == -1);
        
        if(n!=-1)
        {
            atz.setMaxim(n);
            atz.game();
        }
    } 
}
