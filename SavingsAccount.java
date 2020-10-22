import java.io.*;
import java.util.Scanner;
class SavingsAccount{

    public static double annualInterestRate;
    private double savingsBalance;

    public SavingsAccount()
    {
        savingsBalance = 0;
        annualInterestRate = 0;
    }

    public SavingsAccount(double balance, double interestRate)
    {
        savingsBalance = balance;
        annualInterestRate = interestRate;
    }

    public double calculateMonthlyInterest()
    {
        double monthlyInterest;
        monthlyInterest = (savingsBalance * annualInterestRate/12);
        savingsBalance += monthlyInterest;
        return monthlyInterest;
    }

     public static void modifyInterestRate(double newInterestRate)
    {
        annualInterestRate = newInterestRate;
    }
    
    public void setSavingsBalance(double newBal){
        savingsBalance = newBal;
    }
    
    public double getSavingsBalance(){
        return savingsBalance;
    }
    
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
}
class SavingsAccountTest
{
    public static void main(String[] args)
    {
        SavingsAccount saver1 = new SavingsAccount();
        SavingsAccount saver2 = new SavingsAccount();
        
        saver1.setSavingsBalance(2000.00);
        saver2.setSavingsBalance(3000.00);
        
        SavingsAccount.modifyInterestRate(0.04);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        
        System.out.printf("New Balance for Saver1=%f\n",saver1.getSavingsBalance());
        System.out.printf("New Balance for Saver2=%f\n",saver2.getSavingsBalance());

        SavingsAccount.modifyInterestRate(0.05);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        
        System.out.printf("New Balance for Saver1=%f\n",saver1.getSavingsBalance());
        System.out.printf("New Balance for Saver2=%f\n",saver2.getSavingsBalance());
    }
}    















