/*
 * the class content the methos of the main numeroatzar
 * Date:25/11/16
 */
package numeroatzar;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Kevin casaova Armada
 * @version 1.5
 */
public class NumeroAtzarClass {
    
    private int maxim;

    public NumeroAtzarClass() {
    }
    /**
     * the constructor of the class
     * @param maxim the number maxin for the possiblility number adivinate and the number of intents/2
     */
    public NumeroAtzarClass(int maxim) {
        this.maxim = maxim;
    }

    public int getMaxim() {
        return maxim;
    }

    public void setMaxim(int maxim) {
        this.maxim = maxim;
    }
    /**
     * The body of the game is a part for write the number adivinate
     * @param comptador the number of posibility intents
     */
    public void game ()
    {
        int comptador=maxim/2;
        Scanner lector = new Scanner(System.in);
        int n; //number wirter for user
        Random rnd=new Random();
        double atzar= Math.ceil(rnd.nextDouble()*maxim)+1; //ramdon generate for pc
        
        while(comptador>0){
            System.out.println("Introdueix un numero entre 1 i "+maxim);
            do{
                try{
                    n = Integer.parseInt(lector.nextLine());
                }catch (NumberFormatException error){
                    n=-1;
                    System.out.println("Només pots escriure un número enter. Torna-ho a provar");
                }
               
                n=validation(n);
            }while(n == -1);
            comptador=counter(n,atzar,comptador);    
        }
    }
    
    /**
     * the posibility result for the write a number, the possiblity scenari is the number is error and the resolt for the number is correct
     * @param n the number writer
     * @param atzar the number atzar for pc
     * @param comptador the number of count restart
     * @return the comptador and rest one intent or -1 what the party is win
     */
    public int counter (int n, double atzar, int comptador)
    {
        if(n==atzar){
                System.out.println("Has encertat, enhorabona!!! Ho has aconseguit després de "+(6-comptador)+ " intents");
                return comptador=-1;

            }else {
                if(n>atzar){
                     comptador--;
                    System.out.println("No has tingut sort!!! El nombre que es busca és més petit\nTens "+comptador+ " intents");
                    return comptador;
                }else{
                     comptador--;
                    System.out.println("No has tingut sort!!! El nombre que es busca és més gran\nTens "+comptador+ " intents");
                    return comptador;
                }
            }
    }
    /**
     * validate the number write for user is in the posibility numbers
     * @param n the number wirter for user
     * @return the n not change is a correct and n=-1 the number is incorrect and return a write the number
     */
    public int validation (int n)
    {
        if(n!=-1 && (n<1 || n>maxim)){
                    n=-1;
                    System.out.println("Només pots escriure un número enter entre 1 i "+maxim);
                }
        return n;
    }
    
}

