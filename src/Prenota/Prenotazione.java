package Prenota;
/**
 * Classe prenotazione
 * @author gians_ji5genm
 *
 */
public class Prenotazione {
	
	//Attributi
	private String nome;
	private int ora;
	private int minuti;
	
	/**
	 * Metodo per ottenere il nome
	 * @return nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * Metodo per settare il nome
	 * @param nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * Metodo per ottenere il tempo
	 * @return tempo
	 */
	public String getTempo() {
		String stringa = ora +" "+ minuti;
		return stringa;
	}
	/**
	 * Metodo per settare il tempo
	 * @param ora
	 * @param minuti
	 */
	public void setTempo(int ora, int minuti) {
		this.ora = ora;
		this.minuti = minuti;
	}
	
	
}
