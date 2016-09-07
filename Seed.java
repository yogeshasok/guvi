import java.io.*;
import java.lang.*;
import java.util.*;
class Seed
{

public static void main(String arg[])
{  Scanner d=new Scanner(System.in);
    int number,i,product;
    number=d.nextInt();
    for(i=1;i<=number;i++){
            int temp=i;
            product=i;
            while(temp!=0){
                product=product*(temp%10);
                temp=temp/10;
            }
            if(product==number){
                System.out.println(i);
            
        }
    }
   }}