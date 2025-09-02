public class Programs {
	
	
	public static void main(String[] args) {
	      
		// Enter three numbers , get big numbers
		/*
	     Scanner s= new Scanner(System.in);
	        int x = s.nextInt();
	        int y = s.nextInt();
	        int z = s.nextInt();
	        
	    if(x>y && x>z) {
	    	
	    	System.out.println(x	+ " : is largest number");
	    }
	    else if(y>x && y>z) {
	    	
	    	System.out.println(y + " : is largest number");
	    }
	    else if(z>x && z>y) {
	    	
	    	System.out.println(z  + " : is largest number");
	    }
	    */
	// ======================================================================== 
	//Q:  Read all elements in reverse Order
	   
	   int[] x = {3,6,8};
	   
	   for(int i=x.length-1;i>0;i--)
	     {
	     System.out.println(x[i]);
	     }
  //  =====================================================================================================
	   
	// Q : Find max element from given array
	   /*
	   int [] x = {1,99,76,593,4,23,63,999,3};
	   		
	   		int max=x[0];
	   		
	   	for (int i=0;i<x.length;i++)
	   	{
	   	   if(x[i]>max)
	   	     {
	   	        max=x[i];
	   	     }
	   	    }
	   	    System.out.println(max);
	   		
	   */
 // =======================================================================================================
	   
	// Q : Find minimum number from given array
	   /*
	         if(x[i]<max)
	         {
	           max=x[i];
	          }
	    
	    */
	// ================================================================================================
	   
	   // Q : Reverse of string using StringBuffer class
	          
	   /*
	     StringBuffer sb = new StringBuffer("KishanKumar");
	     System.out.println(sb.reverse());
	    
	    */
 // =======================================================================================================
	   
	   // Q : Split 
	   /*
	    
	   String s1 = "java string split method by javatpoint";
	   String[] words = s1.Split("\\s");
	   
	      for(int i=0;i<words.length;i++)
	        {
	          System.out.println(words[i]);
	         }
	   
	   */
	 // ================================================================
 } 

}
