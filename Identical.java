import java.io.*;
import java.lang.*;
import java.util.*;
class Identical
{
     public static void main(String arg[])
            {
              Scanner d=new Scanner(System.in);
               int n=d.nextInt();
               int count=0;
               int arr[]=new int[n+1];
               for(int i=0;i<n;i++)
               arr[i]=d.nextInt();
               for(int i=0;i<n-1;i++)
                {
                      for(int j=i+1;j<n;j++)
                      {
                           if(a[i)>a[j])
                           count++;
                      }
                }
                if(count>0)
                System.out.println("Values not sorted");
                else
                System.out.println("Sorted");
         }
 }    
