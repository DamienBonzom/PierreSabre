package personnages;

public class Yakuza extends Humain {
	private String clan;

	private int reputation = 0;
	
	public Yakuza(String nom, String boisson, int argent, String clan) {
		super(nom, boisson, argent);
		this.clan = clan;
	}
	
	public int getReptutation() {
		return reputation;
	}
	
	public void extorquer(Commercant victime) {
		this.parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par l� ?");
		this.parler(victime.getName() + ", si tu tiens � la vie donne moi ta bourse !");
		int gain = victime.seFaireExtorquer();
		this.gagnerArgent(gain);
		this.reputation++;
		this.parler("J'ai piqu� les " + gain + " sous de " + victime.getName() + ", ce qui me fait " + this.money + " sous dans ma poche. Hi ! Hi !");
	}
	
	public void perdre() {
		this.parler("J'ai perdu mon duel et mes " + this.getMoney() + " sous, snif... J'ai d�shonor� le clan de " + clan +".");
		this.perdreArgent(this.getMoney());
		reputation--;
	}
	
	public void gagner(int gain) {
		this.gagnerArgent(gain);
		reputation++;
		this.parler("Ce ronin pensait vraiment battre " + this.getName() + " du clan " + clan + " ? Je l'ai d�pouill� de ses " + gain + " sous.");
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Mon clan est celui de " + clan +".");
	}
	
}
