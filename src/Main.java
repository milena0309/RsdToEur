/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Milena
 */

import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Definisi promenljive
        double amountInRsd;
        double rate;
        double amountInEuro;
        Scanner input = new Scanner(System.in);
        
        // Pozdravna poruka
        System.out.println("This app convert RSD to Euro");
        System.out.println("Enter rate for today");
        
        rate = input.nextDouble();
        
        // Unesi iznos u dinarima
        System.out.println("Enter amount in RSD");
        amountInRsd = input.nextDouble();
        
        // Izracunaj iznos u evrima
        amountInEuro = amountInRsd / rate;
        System.out.println("Amount in Euro is " + amountInEuro + ".");
        
        
        
      
      
        
        
        
        
        
        
        
        
        
    }
    
}
