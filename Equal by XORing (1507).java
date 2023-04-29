/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static int highestsetbit(long num){
        int count=0;
        while(num>0){
            num=num>>1;
            count++;
        }
        return count;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
		while(test-->0){
		    long a=sc.nextLong(),b=sc.nextLong(),n=sc.nextLong();
		    long c=a^b;
		    int x=highestsetbit(c);
		    int y=highestsetbit(n);
		    long temp=(long)Math.pow(2,(x-1));
		    if(c==0)    System.out.println(0);
		    else if(c<n) System.out.println(1);
		    else if(temp>=n) System.out.println(-1);
		    else if(n<=c) System.out.println(2);
		}
		
	}
}
