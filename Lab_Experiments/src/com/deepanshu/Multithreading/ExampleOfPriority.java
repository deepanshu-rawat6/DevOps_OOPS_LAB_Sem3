public class ExampleOfPriority extends Thread 
{

    public static void main(String[] args)
        {
        ExampleOfPriority thread1 = new ExampleOfPriority(); 
        ExampleOfPriority thread2 = new ExampleOfPriority(); 
        ExampleOfPriority thread3 = new ExampleOfPriority(); 
  
      System.out.println("The priority of thread1 = " + thread1.getPriority()); // Default 5 
      System.out.println("The priority of thread2 = " + thread2.getPriority()); // Default 5 
      System.out.println("The priority of thread3 = " + thread3.getPriority()); // Default 5 
        
        thread1.setPriority(6); 
        thread2.setPriority(7); 
        thread3.setPriority(8); 
       
        System.out.println("The priority of thread1 = " + thread1.getPriority()); 
        System.out.println("The priority of thread2 = " + thread2.getPriority());  
        System.out.println("The priority of thread3 = " + thread3.getPriority());  
  
        // Main thread 
        System.out.println("The priority of Main thread = " + 
        Thread.currentThread().getPriority()); 
  
        // Main thread priority is set to 10 
        Thread.currentThread().setPriority(10); 
        
        // Main thread 
        System.out.println("The priority of Main thread = " + 
       Thread.currentThread().getPriority()); 

    }
}