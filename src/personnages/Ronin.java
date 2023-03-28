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
	
	public void provoquer(Yakuza adversaire) {
		int force = honneur * 2;
		this.parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand !");
		if (force >= adversaire.getReptutation()) {
			this.gagnerArgent(adversaire.getMoney());
			honneur++;
			this.parler("Je t'ai eu petit yakusa !");
			adversaire.perdre();
		}else {
			honneur--;
			this.parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
			adversaire.gagner(this.getMoney());
		}
	}
}
