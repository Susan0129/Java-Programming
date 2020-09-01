import java.io.*;
import java.util.Scanner;
public class Experiment5
{
    public static void main(String args[ ])
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a sentence(in lower case):");
        String scan = obj.nextLine( );	
        String dictionary[ ] = new String[1000];
        dictionary = scan.split(" ");
        for(int i = 0; i<dictionary.length; i++)
        {
             for(int j = i; j<dictionary.length-1;j++)
             {
                   String min = dictionary[i];
                   if(min.compareTo(dictionary[j+1])>0){
                           dictionary[i] = dictionary[j+1];
                           dictionary[j+1] = min;
                   }
             }
        } //Sorted array
        // binary search
        System.out.print("Enter a word to be searched: ");
        String key = obj.nextLine( );
        int last = dictionary.length - 1;
        int first = 0;
        while(first<=last){
             int mid = (first+last)/2;
             String str = dictionary[mid];
             if(key.compareTo(str)<0){
                   last = mid - 1;
             }
             else if(key.equals(str)){
                  System.out.println("Element is fount at index: " + mid); 
                  break;
             }
             else{
                 first = mid + 1;
             }
         }
    }
}  
        