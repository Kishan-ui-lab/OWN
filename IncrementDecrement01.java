


public class IncrementDecrement01 {

	public static void main(String[] args) {
		
		int a = 10;
		
		System.out.println(a++ + ++a);  //10  + 12 = 22    //a = 12
		
		
		System.out.println(++a - a++);   // 0 //a = 14
		                  //13 - 13

		
		System.out.println(a-- + --a);  // 26   //a = 12
		                 //14  + 12   
		
		System.out.println(--a - a--);  //0  // a = 10
		                 // 11 - 11    
			
		System.out.println(a);  //10
		
		System.out.println(a++ - ++a - --a - a--);
		
	}	
}