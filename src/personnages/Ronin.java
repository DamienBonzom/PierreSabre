package personnages;

public class Ronin extends Humain{
	private int honneur = 1;
	
	public Ronin(String nom, String boisson, int argent) {
		super(nom, boisson, argent);
	}
	
	public void donner(Commercant beneficiaire) {
		int don = this.money * 10/100;
		this.perdreArgent(don);
		this.parler(beneficiaire.getName() + " prend ces " + don + " sous.");
		beneficiaire.recevoir(don);
	}
}
