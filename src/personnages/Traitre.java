package personnages;

public class Traitre extends Samourai {

	private int niveauTraitrise = 0;
	
	public Traitre(String seigneur, String nom, String boisson, int argent) {
		super(seigneur, nom, boisson, argent);
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Mais je suis un traître et mon niveau de traîtrise est : " + niveauTraitrise + ". Chut !");
	}
	
	public void ranconner(Commercant commercant) {
		if(niveauTraitrise < 3) {
			int argentRanconner = commercant.getMoney() * 2/10;
			commercant.perdreArgent(argentRanconner);
			gagnerArgent(argentRanconner);
			parler("Si tu veux ma protextion contre les Yakuzas, il va falloi payer ! Donne-moi " + argentRanconner + " sous ou gare à toi !");
			commercant.parler("Tout de suite grand " + getName() + ".");
		}else {
			parler("Mince je ne peux plus rançonner personne sinon un samouraï risque de me démasquer !");
		}
	}
	
	public void faireLeGentil() {
		if(nbConnaissance < 1) {
			parler("Je ne peux pas faire ami ami avec personne car je ne connais personne ! Snif.");
		}else {
			int hasard = 2;
			Humain humain_hasard = memoire[hasard];
			int don = getMoney() * 1/20;
			String nomAmi = humain_hasard.getName();
			parler("Il faut absolument remonter ma cote de confiance. Je vais faire ami ami avec " + nomAmi + ".");
			parler("Bonjour l'ami ! Je voudrais vous aider en vous donnant " + don + "sous." );
			humain_hasard.gagnerArgent(don);
			perdreArgent(don);
			humain_hasard.parler("Merci " + getName() + " Vous êtes quelqu'un de bien.");
			if(niveauTraitrise > 1) {
				niveauTraitrise--;
			}
		}
	}
	
}
