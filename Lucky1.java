import java.util.*;
import java.io.*;
import java.lang.*;
class Lucky1  {
   public static void main(String arg[])
            {
               Scanner d=new Scanner(System.in);
               int test=d.nextInt();
               int l=0;
               boolean arr[]=new boolean[test];
         for(int j=0;j<test;j++){
               int num=d.nextInt();
               String st="";
              for(int i=0;i<num;i++)
               { st=st+String.valueOf(d.nextInt())+",";
               }
                int fav=d.nextInt();
               String res="";
              for(int i=0;i<fav;i++)
               { res=res+String.valueOf(d.nextInt())+",";
               }
            arr[l]=(st.contains(res));
             l++;
            }
               for(int i=0;i<arr.length;i++)
                  System.out.println(arr[i]);
            }
        }
             