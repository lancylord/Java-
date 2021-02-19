


package pack1;

import java.io.*;
import java.util.Scanner; 

class Linklist{
	node head;
	class node{
		int data;
		node next;
		node(int d)
		{
			next=null;
			data=d;
		}
	}
	
	static void Insert(int d,Linklist l)
	{	
		node newnode= l.new node(d);
		
		if(l.head==null)
		{
			l.head=newnode;
			newnode.next=null;
		}
		else
		{
			node temp=l.head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=newnode;
			newnode.next=null;
			
			
		}
	}
		
	public void print(Linklist l)
	{
		node temp=l.head;
		while(temp!=null)
		{System.out.println(temp.data);
		temp=temp.next;
					}
	}
	
	public void deleteend(Linklist l)
	{
		node temp=l.head;
		node pre = temp;
		temp=temp.next;
		if(pre.next==null)
		{
			l.head.next=null;
			System.out.println("Removed:LL now empty");
		}
		else {
		while(temp.next!=null)
		{
		temp=temp.next;	
		pre=pre.next;
		}
		
		pre.next=null;
		}
		
	}

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		int i=7;
		Linklist l=new Linklist();
		while (i!=4)
		{i= s.nextInt();
		switch(i)
		{
		case 1:int j= s.nextInt();
				l.Insert(j,l);break;
		case 2:l.print(l);break;
		case 3: l.deleteend(l);break;
		case 4:break;
		}
	}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}