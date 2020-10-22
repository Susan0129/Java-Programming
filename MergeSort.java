import java.io.*;
import java.util.Scanner;
public class MergeSort{
            public static void main(String args[ ]){
                       Scanner obj = new Scanner(System.in);
                       System.out.print("Enter the size of the array: ");
                       int n = obj.nextInt( );
                       int array[] = new int[n];
                       System.out.print("Enter the array elements: ");
                       for(int k =0; k<n ;k++)
                                array[k] = obj.nextInt( );      
  
                       System.out.println("Before sorting  ");
                       display(array); 
                                                 
                       mergeSort(array, 0, n-1);   
                                        
                       System.out.println("\nAfter sorting  ");
                       display(array);              
            }               
            public static void merge(int array[ ], int lb, int mid, int ub ){
                       int i ; //for starting position of left sublist
                       int j; // for starting position of right sublist
                       int k;//for index of temporary array
                       int temp [ ]= new int[20];
                           
                       i = lb;
                       j = mid + 1;
                       k = lb;
                       while(i<=mid && j<=ub)
                       {                  
                                  if(array[i] < array[j])
                                           temp[k++] = array[i++];
                                  else
                                          temp[k++] = array[j++];                
                       } 
                       for( ;i<=mid;i++)     //for left over elements in left sublists
                                  temp[k++] = array[i];
                       for( ;j<=ub;j++)      //for left over elements in right sublists
                                 temp[k++] = array[j];
                      for(i=lb;i<=ub;i++)
                                array[i] = temp[i];                              
            }
                              
            public static void mergeSort(int array[ ], int lb,int ub ){   
                      int mid;
                      if(lb!=ub)
                     {                  
                            mid = (lb+ub)/2;
                            mergeSort(array,lb,mid);
                            mergeSort(array,mid +1,ub);
                            merge(array,lb,mid,ub);
                    }
            }  
                                    
           public static void display(int array[ ]){
                     for(int i = 0;i<array.length;i++)
                              System.out.print(array[i] + " ");
           } 
}