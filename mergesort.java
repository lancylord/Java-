package pack1;
import java.util.*;

public class mergesort {
 
	static void merge(int ar[],int l,int m,int r)
	{ 
		
		int ans[]=new int[r+1];
		int count=l,i=l,j=m+1;
		
		while(i<=m && j<=r)
		{
			if(ar[i]<ar[j])
			{
				ans[count]=ar[i];
				i++;
			}
			else
			{
				ans[count]=ar[j];
				j++;
				
			}count++;
			
		}
		
		if(i>m)
		{
			while(j<=r)
			{ans[count]=ar[j];
			j++;		
			count++;
			}
			
		}
		else if (j>r)
		{while(i<=m)
		{ans[count]=ar[i];
		i++;
		count++;
		}	
		}
		
		//copy full array
		
		for(int z=l;z<r+1;z++)
		{
			ar[z]=ans[z];
		}
	}
		
	static void print(int arr[],int l,int r)
	{for(int i=0;i<r;i++)
	 System.out.println(arr[i]);
	}	         
		
		
		
		
	
	 
	static void partition(int arr[],int l,int r)
	{ if(l<r)
	{
	int mid=(l+r)/2;
	partition(arr,l,mid);
	partition(arr,mid+1,r);
	merge(arr,l,mid,r);
	
	}
		
	}
	
	public static void main(String args[])
	{	Scanner s=new Scanner(System.in);
		
		System.out.println("Enter n");
		int n=s.nextInt();
		int arr[]= new int[n];
		System.out.println("Enter Elements");
		for (int i=0;i<n;i++)
		arr[i]=s.nextInt();
		
		partition(arr,0,n-1);
		
		System.out.println("Answer is");
		print(arr,0,n);
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
