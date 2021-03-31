package com.diyamolvarghese_co787971_a7;

public class BankingDetails {
    private static String[] username= {"John","George","Mary"};
    private static String[] pwd= {"John","George","Mary"};
    private static double[] balance= {20000.00,500.00,1300.00};

    public static double viewBalance(String name, String password) {
        double bal=0;
        if(name.equals(username[0])&&password.equals(pwd[0]))
        {
            bal=balance[0];
        }
        else if(name.equals(username[1])&&password.equals(pwd[1]))
        {
            bal=balance[1];
        }
        else if(name.equals(username[2])&&password.equals(pwd[2]))
        {
            bal=balance[2];
        }
        return bal;
    }

    public static double newBalance(String name,String password,double debitAmt) {
        double bal=0;
        if(name.equals(username[0])&&password.equals(pwd[0]))
        {
            if(debitAmt<balance[0])
            {
                balance[0]=balance[0]-debitAmt;
                bal=balance[0];
            }
            else {
                bal=-2;
            }
        }
        else if(name.equals(username[1])&&password.equals(pwd[1]))
        {
            if(debitAmt<balance[1])
            {
                balance[1]=balance[1]-debitAmt;
                bal=balance[1];
            }
            else {
                bal=-2;
            }
        }
        else if(name.equals(username[2])&&password.equals(pwd[2]))
        {
            if(debitAmt<balance[2])
            {
                balance[2]=balance[2]-debitAmt;
                bal=balance[2];
            }
            else {
                bal=-2;
            }
        }
        else {
            bal=-1;
        }
        return bal;
    }

    public static double balance(String name,String password,double creditAmt) {
        double bal=0;
        if(name.equals(username[0])&&password.equals(pwd[0]))
        {
            balance[0]=balance[0]+creditAmt;
            bal=balance[0];}
        else if(name.equals(username[1])&&password.equals(pwd[1]))
        {
            balance[1]=balance[1]+creditAmt;
            bal=balance[1];
        }
        else if(name.equals(username[2])&&password.equals(pwd[2]))
        {
            balance[2]=balance[2]+creditAmt;
            bal=balance[2];
        }

        return bal;
    }


    public static double viewBalance(String name, String password,double balance) {
        double bal=0;
        if(name.equals(username[0])&&password.equals(pwd[0]))
        {
            bal=balance;
        }
        else if(name.equals(username[1])&&password.equals(pwd[1]))
        {
            bal=balance;
        }
        else if(name.equals(username[2])&&password.equals(pwd[2]))
        {
            bal=balance;
        }
        return bal;
    }

}
