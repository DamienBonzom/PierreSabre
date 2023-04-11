package personnages;

public class Humain {
	private String name;
	private String favDrink;
	protected int money;
	protected int nbConnaissance = 0;
	private int max_connaissance = 3;
	protected Humain[] memoire = new Humain[max_connaissance];
	
	public Humain(String nom, String boisson, int argent) {
		this.name = nom;
		this.favDrink = boisson;
		this.money = argent;
	}
	
	public String getName() {
		return name;
	}
	public int getMoney() {
		return money;
	}
	
	protected void parler(String texte) {
		System.out.println("("+this.name+") - " + texte);
	}
	
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + this.name + " et j'aime boire du " + this.favDrink +".");	
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de " + this.favDrink + " ! GLOUPS !");
	}
	
	public void acheter(String bien, int prix) {
		if(this.money >= prix) {
			parler("J'ai " + this.money + " sous en poche. Je vais pouvoir m'offrir " + bien + " à " + prix + " sous");
			perdreArgent(prix);
		}else {
			parler("Je n'ai plus que " + this.money + " sous en poche. Je ne peux même pas m'offrir " + bien + " à " + prix + " sous.");
		}
	}
	
	public void gagnerArgent(int argent) {
		this.money += argent;
	}
	
	public void perdreArgent(int argent) {
		this.money -= argent;
	}
	
	private void repondre(Humain autreHumain) {
		autreHumain.direBonjour();
	}
	
	private void memoriser(Humain autreHumain) {
		if(nbConnaissance == max_connaissance) {
			for(int i = 0; i < nbConnaissance-1; i++) {
				memoire[i] = memoire[i+1];
			}
			memoire[nbConnaissance-1] = autreHumain;
		}else {
			memoire[nbConnaissance] = autreHumain;
			nbConnaissance++;			
		}
		

		
	}
	
	public void faireConnaissanceAvec(Humain autreHumain) {
		direBonjour();
		repondre(autreHumain);
		autreHumain.memoriser(this);
		memoriser(autreHumain);
	}
	
	public void listerConnaissance() {
		String texte = "";
		for(int i = 0; i < nbConnaissance ; i++) {
			texte += memoire[i].getName() + ", ";
		}
		parler("Je connais beaucoup de monde dont : " + texte.substring(0, texte.length() - 2));
	}

}
