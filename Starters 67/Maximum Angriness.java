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
		for(int i=0;i<t;i++){
		    long p=sc.nextInt();
		    long s=sc.nextInt();
		    if(s>(p/2)){
		        System.out.println(p*(p-1)/2);
		    }
		    else{
		        long r=p*(p-1)/2;
		        p-=2*s;
		        r-=p*(p-1)/2;
		        System.out.println(r);
	}
		}
}
}
