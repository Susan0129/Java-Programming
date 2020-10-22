import java.io.*;
import java.util.Scanner;
class Invoice_{
        //Define instance variables here
        String number;
        String description;
        int quantity;
        double price;
        public Invoice_(){ }
        //Define parameterized constructor here
        Invoice_(String n, String d, int q, double p)
        {
            number = n;
            description = d;
            quantity = q;
            price = p;
        }
       // Setters
        public void setNumber(String n){
            number = n;
        }
        public void setDescription(String d){
            description = d;
        }
        public void setQuantity(int q){
            quantity = q;
            if(q<0)
              quantity = 0;
        }
        public void setPrice(double p){
            price = p;
            if(p<0)
              price = 0.0;
        }
       // Getters
       String getNumber(){
           return number;
       }
       String getDescription(){
           return description;
       }
       int getQuantity(){
           return quantity;
       }
       double getPrice(){
           return price;
       }

       public double getInvoiceAmount(){
                 double invoiceAmount = 0.0;
                // Write your logic here
                invoiceAmount = quantity*price;
                return invoiceAmount;
       }
}
public class Invoice{
         public static void main(String []args){
                   Invoice_ myInvoice;
                   //Write your code here
                   myInvoice = new Invoice_("34","Hammer",2,98.72);
                   System.out.println("Invoice:" + '\n');
                   System.out.print(myInvoice.getNumber() +'\t'+ myInvoice.getDescription()+'\t'+ myInvoice.getQuantity() + '\t'+myInvoice.getPrice() + '\t'+myInvoice.getInvoiceAmount());
         }
}




