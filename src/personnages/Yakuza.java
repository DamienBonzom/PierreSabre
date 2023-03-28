package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reptutation = 0;
	
	public Yakuza(String nom, String boisson, int argent, String clan) {
		super(nom, boisson, argent);
		this.clan = clan;
	}
	
	public void extorquer(Commercant victime) {
		this.parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par l� ?");
		this.parler(victime.getName() + ", si tu tiens � la vie donne moi ta bourse !");
		int gain = victime.seFaireExtorquer();
		this.gagnerArgent(gain);
		this.parler("J'ai piqu� les " + gain + " sous de " + victime.getName() + ", ce qui me fait " + this.money + " sous dans ma poche. Hi ! Hi !");
	}
	
}
