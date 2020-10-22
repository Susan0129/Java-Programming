import java.io.*;
import java.util.Scanner;
public class ElectricityBill
{
    int consumerNo, previousReading,currentReading;
    String consumerName;
    String EBcon;
    double bill;
    public static void main(String args[])
    {
        ElectricityBill ob = new ElectricityBill();
        ob.inputData();
        ob.bill();
        ob.display();
    }
    void inputData()
    {
        Scanner obj = new Scanner(System.in);
        int consumerNo = 84790;
        System.out.println("Consumer No: " + consumerNo);
        String consumerName = "Priya";
        System.out.println("Consumer Name: "+ consumerName);
        System.out.print("Enter previous month reading: ");
        previousReading = obj.nextInt();
        System.out.print("Enter current month reading: ");
        currentReading = obj.nextInt();
        System.out.println("Enter the type of EB Connection(domestic or commercial)");
        EBcon = obj.next();
    }
    double bill()
    {
        int units = currentReading - previousReading;
        if(EBcon.equals("domestic"))
        {
            if(units<=100)
              bill = 1*units;
            else if(units>100 && units<=200)
              bill = 2.50*units;
            else if(units>200 && units<=500)
              bill = 4*units;
            else
              bill = 6*units;
        }  
        else
        {
            if(units<=100){
                bill = 2*units;
            }
            else if(units>100 && units<=200){ 
                bill = 4.50*units;
            }  
            else if(units>200 && units<=500){
                bill = 6*units;
            }
            else{
                bill = 7*units;
            }
        }
        return bill;
    }
    void display()
    {
       System.out.print("The bill is: " + bill); 
    }
}




















