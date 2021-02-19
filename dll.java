package pack1;

import java.util.Scanner;

import pack1.Linklist.node;

public class dll {
 node head;

class node{
	int data;
	node prev;
	node next;
 node(int data)
 {
	 prev=null;
	 next=null;
	 this.data=data;
 }}
 
 public void ins(dll li,int data)
 {
	 node newnode=new node(data);
	 if(li.head==null)
	 {
		 li.head= newnode;
		 newnode.prev=li.head;
		 newnode.next=null;
	 }
	 else {
		 node temp=li.head;
		 while(temp.next!=null)
		 temp=temp.next;
		 temp.next=newnode;
		 newnode.prev=temp;
		 newnode.next=null;
		 
	 }
 }
 
 public void print(dll l)
	{
		node temp=l.head;
		while(temp!=null)
		{System.out.println(temp.data);
		temp=temp.next;
					}
	}
 
 public void deleteend(dll l)
	{
		node temp=l.head;
		node pre = temp;
		temp=temp.next;
		if(pre.next==null)
		{
			l.head.next=null;
			System.out.println("Removed:Double LL now empty");
			pre=null;
		}
		else {
		while(temp.next!=null)
		{
		temp=temp.next;	
		
		}
		pre=temp.prev;
		pre.next=null;
		temp.prev=null;
		temp=null;
		}
		
	}

 
 
	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		int i=7;
		dll l=new dll();
		while (i!=4)
		{i= s.nextInt();
		switch(i)
		{
		case 1:int j= s.nextInt();
				l.ins(l,j);break;
		case 2:l.print(l);break;
		case 3: l.deleteend(l);break;
		case 4:break;
		}
	}
		
		
	}
	
	 
 
 
 
 
 }


