/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bsnkingapplication;

/**
 *
 * @author Priyanjan
 */

import java.util.Scanner;
public class BankingApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String bankName;
        String id;
        String cusName;
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Bank name : ");
        bankName = scan.nextLine();
        System.out.println("");
        System.out.print("Enter the Name : ");
        cusName = scan.nextLine();
        System.out.println("");
        
        System.out.print("Enter ID :  ");
        id  = scan.next();
        
        System.out.println("");
        BankAccount nsb = new BankAccount(bankName, cusName , id);
        nsb.showMenu();
    }
    
}
