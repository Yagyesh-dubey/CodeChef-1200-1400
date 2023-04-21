/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
class fastscanner
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    String next()
    {
            while(st==null || !st.hasMoreTokens())
            {
            try{
                    
                st=new StringTokenizer(br.readLine());
            }
        catch(IOException e){}
            }
        return st.nextToken();
    }
    int nextInt()
    {
        return Integer.parseInt(next());
    }
    float nextFloat()
    {
        return Float.parseFloat(next());
    }
    long nextLong()
    {
        return Long.parseLong(next());
    }
    double nextDouble()
    {
        return Double.parseDouble(next());
    }
    String nextLine()
    {
        String s="";
        try{
            s=br.readLine();
        }
        catch(IOException e){}
        return s;
    }
}


/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	fastscanner input=new fastscanner();
		PrintWriter output=new PrintWriter(System.out);
		int t=input.nextInt();
		while(t-- !=0)
		{
		  int n=input.nextInt();
		  int a[]=new int[n];
		  for(int i=0;i<n;i++)
		  {
		    a[i]=input.nextInt();
		  }
		  Arrays.sort(a);
		  int count=0;
		  for(int i=0;i<n;i++)
		  {
		    if(a[i]==0)
		    {
		      count++;
		    }
		    else
		    {
		      if(a[i]<=count)
		      {
		        count++;
		      }
		    }
		  }
		  
		  output.println(count);
		}
		output.flush();	// your code goes here
	}
}
