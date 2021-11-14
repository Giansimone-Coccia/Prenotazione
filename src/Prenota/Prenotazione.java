package Prenota;

public class Prenotazione {
	
	private String nome;
	private int ora;
	private int minuti;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getTempo() {
		String stringa = ora +" "+ minuti;
		return stringa;
	}
	
	public void setTempo(int ora, int minuti) {
		this.ora = ora;
		this.minuti = minuti;
	}
	
	
}
