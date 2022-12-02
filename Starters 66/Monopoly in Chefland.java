/*
Chef is the financial incharge of Chefland and one of his duties is identifying if any company has gained a monopolistic advantage in the market.

There are exactly 33 companies in the market each of whose revenues are denoted by R_1R 
1
 , R_2R 
2
  and R_3R 
3
  respectively. A company is said to have a monopolistic advantage if its revenue is strictly greater than the sum of the revenues of its competitors.

Given the revenue of the 33 companies, help Chef determine if any of them has a monopolistic advantage.
package codechef; // don't place package name! */

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
		    int n1 = sc.nextInt();
		    int n2 = sc.nextInt();
		    int n3 = sc.nextInt();
		    if((n1+n2 < n3) || (n1+n3 < n2) || (n2+n3 < n1))
		    {
		        System.out.println("Yes");
		    }
		    else{
		        System.out.println("No");
		    }
		}
	}
}
