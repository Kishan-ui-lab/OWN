import java.util.Scanner;

public class iF {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("proceed for taking input from user");
		int i = s.nextInt();
		
		if(i>0) {
			System.out.println("Positive number");
			if(i%2==0) {
				System.out.println("Positive number & it is even number");
				System.out.println(s);
			}
		}else if(i<0) {
			System.out.println("Negative number");
		}else {
			System.out.println("Zerooooooo number");
		}
		
		// in else-if statement taking else block is optional but recommended.
	}

}
