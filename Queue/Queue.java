import java.util.*; 
  
class Queue  
{  
    static Stack<Integer> s1 = new Stack<Integer>();  
    static Stack<Integer> s2 = new Stack<Integer>();  
  
    static void enQueue(int x)  
    {  
       while(!s1.isEmpty())
	   {
		   s2.push(s1.pop());
		   
	   }
	   s1.push(x);
	   while(!s2.isEmpty())
	   {
		   s1.push(s2.pop());
	   }
    }  
    
    static void deQueue()  
    {  
         while(!s1.isEmpty())
		 {
			 int d=s1.pop();
			 System.out.println(d);
		 }
       
    }  
public static void main(String[] args)  
{  
    Queue q = new Queue();  
    q.enQueue(11);  
    q.enQueue(12);  
    q.enQueue(13);  
	  q.enQueue(14);
  
    q.deQueue();
   
}  
}  
  