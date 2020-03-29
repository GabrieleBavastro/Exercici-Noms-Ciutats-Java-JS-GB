import java.util.Arrays;
import java.util.Scanner;
public class Fase3 {
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
	
	city1 = city1.toUpperCase();
	city2 = city2.toUpperCase();
	city3 = city3.toUpperCase();
	city4 = city4.toUpperCase();
	city5 = city5.toUpperCase();
	city6 = city6.toUpperCase();
	
	//replaces all occurrences of 'A' to '4'
	String replaceStringCity1=city1.replace('A','4'); 
	String replaceStringCity2=city2.replace('A','4');
	String replaceStringCity3=city3.replace('A','4');
	String replaceStringCity4=city4.replace('A','4');
	String replaceStringCity5=city5.replace('A','4');
	String replaceStringCity6=city6.replace('A','4');

	//Create an Array
	String[] ArrayCiutatsModificades = {replaceStringCity1, replaceStringCity2, replaceStringCity3, replaceStringCity4, replaceStringCity5, replaceStringCity6};
	Arrays.sort(ArrayCiutatsModificades);
	for (int i = 0; i < ArrayCiutatsModificades.length; i++) {
      System.out.println("Your cities in Alphabetic order are: " + (i + 1) + " - " +ArrayCiutatsModificades[i]);
      myObj.close();
	} 
  }
}