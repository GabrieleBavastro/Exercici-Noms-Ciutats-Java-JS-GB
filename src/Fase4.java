import java.util.Scanner;
import java.util.Stack;

class Fase4
{
	// Function to reverse a given string using a stack and character array
	public static String reverse(String nomCiutat)
	{
		// return if string is null or empty
		if (nomCiutat == null || nomCiutat.equals(" "))
			return nomCiutat;

		// create an empty stack of characters
		Stack<Character> stack = new Stack<Character>();

		// push every character of the given string into the stack
		char[] ch = nomCiutat.toCharArray();
		for (int i = 0; i < nomCiutat.length(); i++)
			stack.push(ch[i]);
		
		// start from index 0
		int k = 0;

		// pop characters from the stack until it is empty
		while (!stack.isEmpty())
		{
		// assign each popped character back to the character array
			ch[k++] = stack.pop();
		}

		// convert the character array into string and return it
		return String.copyValueOf(ch);
	}

	public static void main (String[] args)
	{
		Scanner myObj = new Scanner(System.in);
		
   	 // String input

		System.out.print("Enter the name of a City: ");
		String city1 = myObj.nextLine();  // Read user input
		String city2 = myObj.nextLine();  // Read user input
		String city3 = myObj.nextLine();  // Read user input
		String city4 = myObj.nextLine();  // Read user input
		String city5 = myObj.nextLine();  // Read user input
		String city6 = myObj.nextLine();  // Read user input
		String allCities = (city1 + " " + city2 + " " + city3 + " " + city4 + " " + city5 + " " + city6);
		
		String nomCiutat = allCities;
		nomCiutat = reverse(nomCiutat);

		System.out.println("Reverse of the given strings is : " + nomCiutat);
		myObj.close();
	}

}