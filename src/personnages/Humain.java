package personnages;

public class Humain {
	private String name;
	private String favDrink;
	protected int money;
	
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

}
