package Prenota;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Campo vettore = new Campo();
		
		int scelta;
		do {
			System.out.println("MENU");
			System.out.println("0: Per uscire");
			System.out.println("1: Aggiungi prenotazione");
			System.out.println("2: Rimuovi prenotazione");
			System.out.println("3: Visualizza prenotazioni");
			System.out.print("Scelta: ");
			scelta = input.nextInt();
			
			switch(scelta) {
			case 0:
				System.out.println("Arrivederci!");
				break;
			case 1:
				System.out.println("Inserisci nominativo: ");
				String nome = input.next();
				System.out.println("Inserisci orario della prenotazione: ");
				int ora = input.nextInt();
				int minuti = input.nextInt();
				vettore.addPrenotazione(nome, ora, minuti);
				break;
			case 2:
				System.out.println("Inserisci nominativo: ");
				String nomeR = input.next();
				System.out.println("Inserisci orario della prenotazione: ");
				int oraR = input.nextInt();
				int minutiR = input.nextInt();
				vettore.removePrenotazione(nomeR, oraR, minutiR);
				break;
			case 3:
				vettore.toString();
				break;
			default:
				System.out.println("Numero errato");
				break;
			}
			
		} while(scelta != 0);

	}
}
