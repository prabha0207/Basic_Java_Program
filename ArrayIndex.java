import java.io.*;
import java.util.*;
import java.util.Scanner;
 public class ArrayIndex
 {
    public cstatic void main(String args[])
    {
      Scanner Sc=new Scanner(System.in);
      System.out.println("Enter Array Size:");
      int Array_Size=sc.nextInt();
      int Array_value[]=new int[Array_Size];
        for(int i=0;i<Array_Size;i++)
        {
          Array_value[i]=sc.nexInt();
        }
        for(int i=0;i<Array_Size;i++)
        {
          System.out.println(Array_value[i]+" "+i);
        }
      }  
    }  
