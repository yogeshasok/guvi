import java.io.*;
import java.lang.*;
import java.util.*;
class Identical
{
     public static void main(String arg[])
            {
              Scanner d=new Scanner(System.in);
               int num=d.nextInt();
               int k=d.nextInt();
               int i=0;
                int count=0;
               while(num>0)
                   {
                   i=num%10;
                   if(i==k)
                         count++;
                   num=num/10;
                    }
             System.out.println(count);
         }
 }    