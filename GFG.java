/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//cod
		Scanner sc= new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int i;
		 int n=sc.nextInt();   
		 int arr[] =new int[n];
		 for(i=0;i<n;i++)
		 {
		     arr[i]=sc.nextInt();
		 }
		 for(i=0;i<n-1;i++)
		 {
		     if(arr[i]>arr[i+1])
		     {
		         System.out.print(arr[i]+" ");
		     }
		 }
		}
	}
}