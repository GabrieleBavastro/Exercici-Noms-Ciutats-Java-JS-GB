import java.util.Arrays;
import javax.swing.JOptionPane;
public class Fase2 {
  public static void main(String[] args) {
	  
	String [] arrayCiutat = new String [6];
	for (int i=0;i<6;i++){
	arrayCiutat[i]=JOptionPane.showInputDialog("Introduce the name of the city " + (i+1) + " and press enter.");
		}
	Arrays.sort(arrayCiutat);
	for (int i=0; i<arrayCiutat.length;i++){
	System.out.println("City " + (i+1) + ": " + arrayCiutat [i]);}

	}
}