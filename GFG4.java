


import java.util.*;
import java.lang.*;
import java.io.*;

class GFG4 {
           static void rotate(int arr[],int d,int n)
		        {
		          reverse(arr,0,d-1);
		         reverse(arr,d,n-1);
		         reverse(arr,0,n-1);
		        }
		        static void reverse(int arr[],int start, int end)
		        {
		            int temp;
		            while(start<end)
		            {
		            temp= arr[start];
		            arr[start]=arr[end];
		            arr[end]=temp;
		            start++;
		            end--;
		            }
		        }
     public static void main (String[] args)throws Exception {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter rhe no. of test case :");
	    int t=sc.nextInt();
	    while(t-->0)
	    {
	    	System.out.println("Enter no. of element in the array:");
	        int n=sc.nextInt();
	        System.out.println("Enter the array element:");
	        int arr[]=new int[n];
	        for(int i=0;i<n;i++)
	        {
	            arr[i]=sc.nextInt();
	        }
	        System.out.println("Enter the no. of element you want to rotate:");
	        int d=sc.nextInt();
	        rotate(arr,d,n);
	        for(int i=0;i<n;i++)
	        {
	            System.out.print(arr[i]+" ");
	        }
	    }
	}
}