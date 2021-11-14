package Prenota;
import java.util.Scanner;

public class Campo {
	Scanner input = new Scanner(System.in);
	private static Prenotazione[] prenotazioni = new Prenotazione[24];

	public boolean addPrenotazione(String nome, int ora, int minuti) {
		if((ora < 8) || (ora > 20)) {
			System.out.println("Hai inserito un'ora errata");
			return false;
		}
		else {
			if(minuti == 0 || minuti == 30) {
				int index = ora-8;
				if(minuti == 0)
					index*=2;
				else
					index=index*2+1;
				if(prenotazioni[index]==null) {
					prenotazioni[index].setNome(nome);
					prenotazioni[index].setTempo(ora, minuti);
					return true;
				}
				else {
					System.out.println("Ora già prenotata");
					return false;
				}
			}
		}
		return false;
	}
	
	public boolean removePrenotazione(String nome, int ora, int minuti) {
		if((ora < 8) || (ora > 20)) {
			//System.out.println("Hai inserito un'ora errata");
			return false;
		}
		else {
			if(minuti == 0 || minuti == 30) {
				int index = ora-8;
				if(minuti == 0)
					index*=2;
				else
					index=index*2+1;
				if(prenotazioni[index]!=null) {
					prenotazioni[index]=null;
					return true;
				}
			}
		}
		return false;
	}
	
	public String toString() {
		return "Ecco la lista delle prenotazioni: " + prenotazioni;
		/*String listaP = "";
		int p = 1;
		for(int i = 0; i < prenotazioni.length; i++) {
			if(prenotazioni[i] != null)
				listaP += "La prenotazione"+ p +"è alle ore"+ prenotazioni[i].getTempo();
				p++;
		}
		return listaP;
		*/
	}
	
}
