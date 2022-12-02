class CommandLineArgument {
   
    public static void main(String[] args)
    {
	
	for(int i = 0; i < args.length; i++) {
    		System.out.println(args[i]);
 	 }

	//Another way to write for loop:
     //   for (String i : args)
       //     System.out.println(i);
 	
    }
}