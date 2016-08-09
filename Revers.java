import java.io.*;
import java.util.*;
import java.lang.*;
class Revers
{
  public static void main(String arg[])
         {
              Scanner d=new Scanner(System.in);
              int num=d.nextInt();
              int l=0;
              while(num>0)
                  {
                    l=l*10+(num%10);
                    num=num/10;
                  }
            System.out.println(l);
         }
 }