class Count
{  
    synchronized void printTable(int n)
    {
        //method not synchronized  
       for(int i=1;i<=5;i++)
       {  
         System.out.println(n*i);  
         try
         {  
           Thread.sleep(400);  
         }
         catch(Exception e){System.out.println(e);}  
       }  
      
     }  
}  
  
class MyThread1 extends Thread
{  
    Count c;  
    MyThread1(Count c)
    {  
        this.c=c;  
    }  
    public void run()
    {  
        c.printTable(5);  
    }  
      
}  
class MyThread2 extends Thread
{  
    Count c;  
    MyThread2(Count c)
    {  
        this.c=c;  
    }  
    public void run()
    {  
        c.printTable(100);  
    }  
}  
  
public class WithSynchronization
{  
    public static void main(String args[])
    {  
        Count obj = new Count();//only one object  
        MyThread1 t1=new MyThread1(obj);  
        MyThread2 t2=new MyThread2(obj);  
        t1.start();  
        t2.start();  
    }  
}  