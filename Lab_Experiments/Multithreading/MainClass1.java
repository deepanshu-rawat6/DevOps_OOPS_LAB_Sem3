class Printer1
{ 
    // Initial 100 paper are set in Printer
    int noOfPaper = 100; 

    // Synchronized the method for inter-thread communication 
    synchronized void printingPages(int pages) 
    { 
        System.out.println("Printing the Pages"); 
        for(int i = 0; i < 100; i++)
        {
            // Printing Pages
        }
        
        // If balance number of Papers are less than user input 
        // then wait for addPages() synchronized method   
        // and printing will resume after that
        if (this.noOfPaper < pages)
        { 
            System.out.println("Number of Papers in printer are less"); 
            try 
            { 
                System.out.println("Waiting...");
                wait(); 
            } 
            catch (Exception e) 
            { 
                
            } 
        } 
        System.out.println("After called notify() method number of Paper : " +    this.noOfPaper); 
        System.out.println("Printing process complete");
         
    } 

    synchronized void addPages(int noOfPages) 
    { 
        // Adding more Papers in Printer; 
        this.noOfPaper += noOfPages; 
        // After adding the paper in printer. Notify the Paused thread; 
        notify(); 
        System.out.println("Notify called but thread needs 5 more seconds");
        // After call notify() method lock will be give up after 5 seconds 
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    } 
} 

public class MainClass1
{ 
    public static void main(String args[]) 
    { 
        Printer printer = new Printer();
        // create two new thread and start them simultaneously 
        // First thread for print the pages
        new Thread() 
        { 
           // @Override
            public void run() 
            { 
                // User want to print 120 pages
                printer.printingPages(120); 
            } 
        }.start(); 
        
        // Second thread for Add pages in printer
        new Thread() 
        { 
           // @Override
            public void run() 
            { 
                // Add 100 more pages in Printer
                printer.addPages(100); 
            } 
        }.start(); 
    } 
} 