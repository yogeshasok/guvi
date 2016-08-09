import java.util.*;
import java.io.*;
import java.lang.*;
class Factor
{
    public static void main(String arg[])
            {
                  Scanner d=new Scanner(System.in);
                  long num=d.nextLong();
                  long tot=1;
                  if(num>1)
                   {
                      for(long i=num;i>0;i--)
                          {
                             tot=tot*i;
                           }
                    }
                 
                   System.out.println(tot);
            }
 }