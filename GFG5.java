//rotate string
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG5 {
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
	   Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t-->0)
	    {
	        int p=2;
	        int arr1[]=new int[p];
	        for(int i=0;i<p;i++)
	        {
	            arr1[i]=sc.nextInt();
	        }
	        int n=arr1[0];
	        int d=arr1[1];
	        int arr[]=new int[arr1[0]];
	        for(int i=0;i<n;i++)
	        {
	            arr[i]=sc.nextInt();
	        }
	        rotate(arr,d,n);
	        for(int i=0;i<n;i++)
	        {
	            System.out.print(arr[i]+" ");
	        }
	        System.out.println();
	    }
	}
}
/*include <iostream> //this code works
using namespace std;

int main() {
	int t;
	cin>>t;
	while(t-->0)
	{
	    int n,d;
	    cin>>n>>d;
	    int arr[n];
	    for(int i=0;i<n;i++)
	    {
	        cin>>arr[(i+n-d)%n];
	        
	    }
	    for(int i=0;i<n;i++)
	    {
	        cout<<arr[i]<<" ";
	    }
	    cout<<"\n";
	}
	return 0;
}