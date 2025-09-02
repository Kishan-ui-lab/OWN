public class Switched {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
		
	}

}

/*Note : 

-> here browser name = chrome, so it will directly jump into chrome and will come out of the loop.
       if browser name is ie, then it will directly jump into ie and will come out of the loop.
    if break statement is not there at line no:13, and line  then o/p is : chrome loop
*/

//Imp :  float,double,long are not allowed as switch argument because these are having too large values.
          // boolean also not allowed because boolean contains too less values.
