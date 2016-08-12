import java.io.*;
import java.lang.*;
import java.util.*;
class Maxstr  {
               public static void main(String arg[])
                  {
                   Scanner d=new Scanner(System.in);
                   int n=d.nextInt();
                   int tot[]=new int[n];
                   int r=0;
                   int count=0;
                   String str[]=new String[n];
                   for(int i=0;i<n;i++)
                       {
                           str[i]=d.next();
                       }
                    for(int i=0;i<str.length;i++)
                          {
                              for(int j=0;j<str.length-1;j++)
                              {   count=0;
                                   for(int k=0;k<str[i].length()-1;j++)

                                        {   
                                            if(str[i].indexOf(str[j].charAt(k))==-1)
                                                 count++;
                                        }
                                   if(count==0)
                                        {
                                         tot[r]=str[i].length()*str[j].length();
                                          r++;
                                        }
                               }
                           }
                           System.out.println(tot[0]);
                    }
             }   