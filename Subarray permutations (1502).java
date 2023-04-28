/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt(),k=sc.nextInt();
		    if(k==1 && n!=1)
		        System.out.println(-1);
		    else{
		    int i=1;
		    for(;i<k;i++)
		       System.out.print(i+" ");    
		    System.out.print(n+" ");
		    for(;i<n;i++)
		        System.out.print(i+" ");
		    System.out.println();
		}
		    
		}
	}
}
