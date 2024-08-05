/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bsnkingapplication;

import java.util.Scanner;

/**
 *
 * @author Priyanjan
 */
public class BankAccount {
    int previousTransaction;
    int balance;
    
    String bankName;
    String customerName;
    String customerId;
    
    
    public BankAccount(String bankName,String customerName , String customerId){
        this.bankName = bankName;
        this.customerName = customerName;
        this.customerId = customerId;
    }
    
    public void deposite(int amount){
        if (amount != 0){
            balance += amount;
            previousTransaction = amount;
        }
    }
    
    public void withdraw(int amount){
    if(amount != 0){
        balance -= amount;
        previousTransaction = - amount;
    }
    }
    
    public void getPreviousTransaction(){
        if(previousTransaction > 0){
            System.out.println("Deposite : " + previousTransaction);
        }else if(previousTransaction < 0){
        System.out.println("withdraw : " + Math.abs(previousTransaction));
        }else{
            System.out.println("No trasaction occured!");
        }
    }
    
    public void showMenu(){
    char option = '\0';
    Scanner sc = new Scanner(System.in);
        
        System.out.println("Bank Name " + bankName);
        System.out.println("Customer Name " + customerName);
        System.out.println("Customer ID " + customerId);
        
        System.out.println("");
        
        System.out.println("A. Check Balance");
        System.out.println("B. Deposite");
        System.out.println("C. Withdraw");
        System.out.println("D. Previos Transaction");
        System.out.println("E. Exit");
        
        do{
            System.out.println("====================================");
            System.out.println("Enter the Option");
            System.out.println("====================================");
            option = sc.next().charAt(0);
            option = Character.toUpperCase(option);
            
            switch(option){
                case 'A':
                    System.out.println("====================================");
                    System.out.println("Balance" + balance);
                    System.out.println("====================================");
                    System.out.println("");
                    break;
                case 'B':
                    System.out.println("====================================");
                    System.out.println("Enter amount of deposite ");
                    int amount = sc.nextInt();
                    deposite(amount);
                    System.out.println("====================================");
                    System.out.println("");
                    break;
                case 'C':
                    System.out.println("====================================");
                    System.out.println("Enter amount to withdraw");
                    System.out.println("====================================");
                     int amountWithdraw = sc.nextInt();
                    withdraw(amountWithdraw);
                    System.out.println("");
                    break;
                case 'D':
                    System.out.println("====================================");
                    getPreviousTransaction();
                    System.out.println("====================================");
                    System.out.println("");
                    break;
                case 'E':
                    System.out.println("====================================");
                    System.out.println("Succesfully Exited");
                    System.out.println("====================================");
                    System.out.println("");
                    break;
                    
                default:
                    System.out.println("Wrong input");
                    break;
            }
        }while(option !='E');
        
       System.exit(0);
    }
    
}
