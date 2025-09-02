// logical operator sometimes doesn't check the 2nd condition and it is based on result on first condition.
// logical operator are represented as || &&

public class LogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if(10>20 || 10/0==0) {
			System.out.println("Good morning");
		}
		else 
		{
			System.out.println("Good evening");
		}

	}

}

/*
 
 
&&                 ||
T F = F        T F =  T
F T = F        F T =  T
F F = F        T T =  T
T T = T        F F =  F

*/
