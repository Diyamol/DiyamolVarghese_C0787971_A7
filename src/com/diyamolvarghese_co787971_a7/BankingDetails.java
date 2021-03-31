package com.diyamolvarghese_co787971_a7;

public class BankingDetails {
    private static String[] username= {"John","George","Mary"};
    private static String[] pwd= {"John","George","Mary"};
    private static double[] balance= {20000.00,500.00,1300.00};

    public static double ViewStatement(String name, String password) {
        double bal=0;
        if(name.equals(username[0])&&password.equals(pwd[0]))
        {
            bal=balance[0];}
        else if(name.equals(username[1])&&password.equals(pwd[1]))
        {
            bal=balance[1];}
        else if(name.equals(username[2])&&password.equals(pwd[2]))
        {
            bal=balance[3];}
        return bal;
    }

    public static double newBalance(String name,String password,double debit) {
        double bal=0;
        if(name.equals(username[0])&&password.equals(pwd[0]))
        {
            balance[0]=balance[0]-debit;
            bal=balance[0];}
        else if(name.equals(username[1])&&password.equals(pwd[1]))
        {balance[1]=balance[1]-debit;
            bal=balance[1];
        }
        else if(name.equals(username[2])&&password.equals(pwd[2]))
        {
            balance[2]=balance[2]-debit;
            bal=balance[2];
        }
        return bal;
    }

    public static double credit(String name,String pass,double credit) {
        double bal=0;
        if(name.equals(username[0])&&pass.equals(pwd[0]))
        {
            balance[0]=balance[0]+credit;
            bal=balance[0];}
        else if(name.equals(username[1])&&pass.equals(pwd[1]))
        {
            balance[1]=balance[1]+credit;
            bal=balance[1];
        }
        else if(name.equals(username[2])&&pass.equals(pwd[2]))
        {
            balance[2]=balance[2]+credit;
            bal=balance[2];
        }
        return bal;
    }



    public double newBalance(String name, String password,double balance) {
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
