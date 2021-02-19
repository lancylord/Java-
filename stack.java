package pack1;
import java.util.*;

public class stack
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int i=7;
		Stack st= new Stack();
		while (i!=4)
		{i= s.nextInt();
		switch(i)
		{
		case 1:int j= s.nextInt();
				st.push(j);break;
		case 2:System.out.println(st.pop());break;
		case 3:st.print();break;
		case 4:break;
		}
		
			
		}
		
	}
}

class Stack{int top;
	int[] st=new int[6];
	Stack()
	{
		top=-1;
	}
	void push(int a)
	{
		if(top==5)
		{
			System.out.println("Stack over");
		}
		else {st[++top]=a;}
	}
	int pop()
	{
		if(top==-1)
			System.out.println("Underflow");
		    
		else
			return st[top--]; 
	}
	
	void peek()
	{
		System.out.println(st[top]);
	}
	
	void print()
	{
		for(int i=0;i<=top;i++)
			System.out.println(st[i]);
			
		}
	}
