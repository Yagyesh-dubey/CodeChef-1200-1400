/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t-->0)
	    {
	        // your code goes here
	        int n=sc.nextInt();
	        int arr[]=new int[n];
	        
	        for(int i=0;i<n;i++)
	        {
	            arr[i]=sc.nextInt();
	        }
	        
	        int c=0;
	        for(int i=0;i<n;i++)
	        {
	           // c=0;
	            for(int j=0;j<n;j++)
	            {
	                if(arr[i]<arr[j])c++;
	            }
	        }
	        System.out.println(c);
	    }
	}
}
