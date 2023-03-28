package histoire;
import personnages.Humain;
import personnages.Commercant;
import personnages.Yakuza;

public class HistoireTP4 {

	
	public static void main(String[] args) {
		Humain prof = new Humain("Prof", "kombucha", 54);
		prof.direBonjour();
		prof.acheter("une boisson", 12);
		prof.boire();
		prof.acheter("un jeu", 2);
		prof.acheter("un kimono", 50);
		System.out.println("-----------");
		Commercant marco1 = new Commercant("Marco", 20);
		marco1.direBonjour();
		int argent = marco1.seFaireExtorquer();
		marco1.recevoir(15);
		marco1.boire();
		System.out.println("-----------");
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "youtenclan");
		Commercant marco2 = new Commercant("Marco", 15);
		yaku.direBonjour();
		yaku.extorquer(marco2);
	}
}
