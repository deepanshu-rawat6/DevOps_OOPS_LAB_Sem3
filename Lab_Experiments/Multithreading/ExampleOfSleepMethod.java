//sleep() - Multithread
public class ExampleOfSleepMethod extends Thread
{  
   public void run()
   {  
     for(int i = 1; i <= 5; i++)
     {  
        System.out.println(Thread.currentThread().getName() + " is running and i = "+i);  
        try 
    {
         Thread.sleep(1000); // Sleep the current thread for 1 second
    } catch (InterruptedException e) 
    {
        e.printStackTrace();
    }
     }  
  }  
  public static void main(String args[])
  {  
     ExampleOfSleepMethod  thread1 = new ExampleOfSleepMethod ();  
     thread1.setName("Thread1");
     ExampleOfSleepMethod  thread2 = new ExampleOfSleepMethod ();
     thread2.setName("Thread2");
         
     thread1.start();  
                
     thread2.start();  
   }  
}