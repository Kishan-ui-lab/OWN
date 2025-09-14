public class doWhile {

	public static void main(String[] args) {
		
		int i=0;
		do
		{
			System.out.println(i);
			if(i==4) {
				break;
			}
			i++;
		}
		while(true);	
		System.out.println("kishan");
	}
	
	/*
	 int i=0;
		while(i<=10) {
			System.out.println(i);
			i++;
		}
		System.out.println("kishan");
	 
	 */
	
	// Switch case example 1 
	/*
	 int a=10;
		
		switch(a)
		{
		case 10:
			System.out.println("Kishan");
			//break;
		case 20:
			System.out.println("Dontha");
			//break;
		case 30:
			System.out.println("Kumar");
			break;
		}

	 
	 */
	
	
	// Switch case example 2
		/*
		String browser = "chrome";
		
		switch (browser) {
		
		case "chrome":
			System.out.println("chrome loop");
			//break;
			
		case "ie":
			System.out.println("ie");
			//break;
			
		case "safari":
			System.out.println("safari");
			break;
			
		case "firefox":
			System.out.println("firefox");
			break;

		}
		 */
	/*Note : 

	-> here browser name = chrome, so it will directly jump into chrome and will come out of the loop.
	       if browser name is ie, then it will directly jump into ie and will come out of the loop.
	    if break statement is not there at line no:13, and line  then o/p is : chrome loop
	*/

	//Imp :  float,double,long are not allowed as switch argument because these are having too large values.
	          // boolean also not allowed because boolean contains too less values.

}