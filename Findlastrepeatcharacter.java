
	
	import java.util.HashMap;

	public class Findlastrepeatcharacter {

	    public static Character findLastRepeatingChar(String str) {
	        // Handle null or empty string cases
	        if (str == null || str.length() == 0) {
	            return null; 
	        }

	        // Use a HashMap to track character frequencies
	        HashMap<Character, Integer> cc = new HashMap<>();

	        // Loop through the string from the end to the beginning
	        for (int i = str.length() - 1; i >= 0; i--) {
	            char currentChar = str.charAt(i);

	            // If the character is already in the map, it's a repeating character.
	            // Since we're iterating backward, this is the LAST one.
	            if (cc.containsKey(currentChar)) {
	                return currentChar;
	            } else {
	                // If it's not in the map, add it with a count of 1
	                cc.put(currentChar, 1);
	            }
	        }
	        
	        // If the loop finishes without returning, there are no repeating characters
	        return null;
	    }

	    public static void main(String[] args) {
	        String s1 = "kishan";
	        System.out.println("The last repeating character in '" + s1 + "' is: " + findLastRepeatingChar(s1));
	    }
	}
