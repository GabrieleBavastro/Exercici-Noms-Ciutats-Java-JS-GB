import java.util.Scanner;
public class Fase1 {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);

    System.out.println("Enter the name of six cities, after each one press Enter:");

    // String input
    String city1 = myObj.nextLine();
	String city2 = myObj.nextLine();
	String city3 = myObj.nextLine();
	String city4 = myObj.nextLine();
	String city5 = myObj.nextLine();
	String city6 = myObj.nextLine();

    // Output input by user
    System.out.println("City Number 1: " + city1);
    System.out.println("City Number 2: " + city2);
	System.out.println("City Number 3: " + city3);
	System.out.println("City Number 4: " + city4);
	System.out.println("City Number 5: " + city5);
	System.out.println("City Number 6: " + city6);
  }
}