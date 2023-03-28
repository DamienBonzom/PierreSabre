package personnages;

public class Commercant extends Humain {
	
	public Commercant(String nom, int argent) {
		super(nom, "th�", argent);
	}
	
	public void seFaireExtorquer() {
		 this.money = 0;
		 this.parler("J'ai tout perdu ! Le monde est trop injuste...");
	}
	
	public void recevoir(int argent) {
		this.gagnerArgent(argent);
		this.parler(argent + " sous ! Je te remercie g�n�reux donateur !");
	}
	
}
