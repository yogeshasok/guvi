import java.util.*;

import java.io.*;

import java.lang.*;

class Aeio
{

         public static void main(String arg[])
 
               {
     
                 Scanner d=new Scanner(System.in);
   
                    String str=d.next();
                    String out="";
           
     StringBuffer b=new StringBuffer(str);
  
                  str=b.reverse().toString();
                  out=str;
                  str=str.replace("a","");
                   str=str.replace("e","");
                   str=str.replace("i","");
                   str=str.replace("o","");
                   str=str.replace("u","");
                    str=str.replace("A","");
                   str=str.replace("E","");
                   str=str.replace("I","");
                   str=str.replace("O","");
                   str=str.replace("U","");
                   System.out.println(out);
                   System.out.println(str);
    
               }
     
 }
