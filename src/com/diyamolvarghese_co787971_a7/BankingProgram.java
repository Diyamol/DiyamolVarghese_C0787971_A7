package com.diyamolvarghese_co787971_a7;

import java.io.FileWriter;
import java.util.*;
import java.io.*;
import javax.swing.JOptionPane;

public class BankingProgram {
    float balance;
    String accNo;
    public static void main(String[] args) throws IOException {
        String[] credentials=new String[2];
        credentials=checkUsernamePassword();
        String name, password;
        name=credentials[0];
        password=credentials[1];
        BankingDetails bank=new BankingDetails();
        FileWriter file = new FileWriter("Banking.txt",true);
        try {
            int choice =Integer.parseInt(JOptionPane.showInputDialog("Select:\n1.Cash Deposit\n2.Cas Withdrawal\n3.Check Balance"));
            double bal=0;
            if (choice==1){
                double debitAmount=Double.parseDouble(JOptionPane.showInputDialog("Enter Amount: "));
                bal=bank.newBalance(name, password, debitAmount);
                if(bal==-1){
                    JOptionPane.showMessageDialog(null, "You entered wrong credentials!");
                }
                else if(bal==0.0 || bal==-2){
                    JOptionPane.showMessageDialog(null, "You don't have enough balance!");
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Balance is $"+bal);

                    file.append("\nUsername:"+name+" \nDebit Amount: $"+debitAmount+"\nCurrent Balance: $"+bal);
                    file.close();
                    JOptionPane.showMessageDialog(null,"Successfully wrote to the file.");}

            }
            else if(choice==2) {
                double credit=Double.parseDouble(JOptionPane.showInputDialog("Enter Credit Amount: "));
                bal=bank.balance(name, password, credit);
                if(bal==0.0)
                    JOptionPane.showMessageDialog(null, "You entered wrong credentials!");
                else
                {JOptionPane.showMessageDialog(null, "Balance is "+bal);

                    file.append("\nUsername:"+name+" \nDeposit Amount: $"+credit+"\nCurrent Balance: $"+bal);
                    file.close();
                    JOptionPane.showMessageDialog(null,"Successfully wrote to the file.");}


            }
            else if(choice==3) {
                double amt=bank.newBalance(name,password,bal);
                if(amt==0.0|| amt==-1)
                    JOptionPane.showMessageDialog(null, "Wrong Credentials!");
                else
                    JOptionPane.showMessageDialog(null, "Balance is "+amt);
            }
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null,"Wrong Input");
        }
    }



    public static String[] checkUsernamePassword(){
        String[] credentials=new String[2];
        String name= JOptionPane.showInputDialog("Enter username: ");
        String pwd=JOptionPane.showInputDialog("Enter password: ");
        credentials[0]=name;
        credentials[1]=pwd;
        return credentials;
    }
}

