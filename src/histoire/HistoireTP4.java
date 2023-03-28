package histoire;
import personnages.Humain;
import personnages.Commercant;
import personnages.Yakuza;
import personnages.Ronin;

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
		
		Yakuza yaku1 = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
		Commercant marco2 = new Commercant("Marco", 15);
		yaku1.direBonjour();
		yaku1.extorquer(marco2);
		
		System.out.println("-----------");
		
		Ronin roro1 = new Ronin("Roro", "shochu", 60);
		Commercant marco3 = new Commercant("Marco", 15);
		roro1.direBonjour();
		roro1.donner(marco3);
		
		System.out.println("-----------");
		
		Ronin roro2 = new Ronin("Roro", "shochu", 54);
		Yakuza yaku2 = new Yakuza("Yaku Le Noir", "whisky", 45, "Warsong");
		
		roro2.provoquer(yaku2);
	}
}
