package view;
import controller.PalindromoController;
import javax.swing.JOptionPane;

public class PalindromoPrincipal {
	public static void main (String[]args) {
		
		PalindromoController pCont = new PalindromoController();
		String palavra = JOptionPane.showInputDialog("Consulta de Palíndromos! ");
		
		String invertida = pCont.invertePalavra(palavra);
		boolean confere = pCont.comparaPalavras(palavra, invertida);
		
		if (confere) {
			System.out.println("A palavra \"" + palavra + "\" é um palíndromo!");
	        
		} else {
			System.out.println("A palavra \"" + palavra + "\" não é um palíndromo!");
		}
	}
}
