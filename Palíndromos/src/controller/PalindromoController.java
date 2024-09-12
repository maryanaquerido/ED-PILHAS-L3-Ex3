package controller;
import maryanalib.pilhastring.*;
public class PalindromoController {
	public PalindromoController() {
		super();
	}
	
	PilhaString pS = new PilhaString();
	
	public String invertePalavra (String palavra) {
		
		String[] vetPalavra = new String[palavra.length()];
		String[] palavraInvertida = new String[palavra.length()];

        for (int i = 0; i < palavra.length(); i++) {
        	vetPalavra[i] = String.valueOf(palavra.charAt(i));
        }
        
        for (String letra : vetPalavra) {
        	pS.push(letra);
        }
        
        for(int i = 0; i<vetPalavra.length; i++) {
        	palavraInvertida[i] = pS.pop();
        }
        
        return String.join("", palavraInvertida);
	}
	
	public boolean comparaPalavras (String palavra, String palavraInvertida) {
		 return palavra.toLowerCase().equals(palavraInvertida.toLowerCase());
	}
}
