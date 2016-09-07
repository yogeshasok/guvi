import java.io.*;
import java.util.*;
import java.lang.*;
class Simple{
	public static void main(String arg[])
		{
		Scanner d=new Scanner(System.in);
		int num=d.nextInt();
		int digit=d.nextInt();
		String st=String.valueOf(num);
		String rs="";
		char arr[]=st.toCharArray();
 		Arrays.sort(arr);
		int res=arr.length-digit;
		for(int i=0;i<res;i++)
                 rs=rs+arr[i];
		int output=Integer.parseInt(rs);
		System.out.println(output);
		}
	}
 			