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
          int x1 = sc.nextInt();
          int y1 = sc.nextInt();
          int x2 = sc.nextInt();
          int y2 = sc.nextInt();
          int first_x = Math.min(x1, n-x1+1);
          int second_x = Math.min(x2, n - x2 + 1);
          int second_y = Math.min(y2, n - y2 + 1);
          int first_y = Math.min(y1, n - y1 + 1);
          int first_second_final_result = Math.min(Math.abs(x2- x1) + Math.abs(y2 - y1),
          Math.min(first_x, first_y)+ Math.min(second_x, second_y));
          System.out.println(first_second_final_result);
	        
	        
	    }
	}
}
