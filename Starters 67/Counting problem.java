/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    while(t-- > 0)
	    {
	        int n = sc.nextInt();
	        int[] arr = new int[n];
	      for(int p = 0 ; p < n ; p++)
	      {
	          arr[p] = sc.nextInt();
	      }
	         int count = 0;
	      for(int s = 0 ; s < n ; s++)
	      {
	       
	          if(arr[s]%2 != 0)
	          {
	              count++;
	          }
	      }
	          if(count == 0)
	          {
	              System.out.println("NO");
	          }
	          else if(count%2 != 0)
	          {
	              System.out.println("NO");
	          }
	          else if(count %2 == 0)
	          {
	              System.out.println("YES");
	          }
	      }
	    
	}
}
