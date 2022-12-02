/*
The followers of Psycho-Helmet religion follow a peculiar calendar – a normal year contains NN days. Every KK-th year is a “MOB” year. For example, if K = 4K=4, then years 4, 8, 12, 16 \ldots4,8,12,16… are “MOB” years. A “MOB” year contains MM additional days i.e. it contains N+MN+M days.

Given XX, determine whether the day after (X-1)(X−1) days from Day 11 of Year 11 falls in a “MOB” year.
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
		    int N = sc.nextInt();
		    int M = sc.nextInt();
		    int K = sc.nextInt();
		    int X = sc.nextInt();
		    if(X%((N*K)+M)-(N*(K-1))>0)
		    {
		        System.out.println("YES");
		    }
		    else if(X%((N*K)+M) == 0)
		    {
		        System.out.println("YES");
		    }
		    else
		    {
		        System.out.println("NO");
		    }
		}
	}
}
