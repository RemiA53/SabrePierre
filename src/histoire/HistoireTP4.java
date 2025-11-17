package histoire;

import personnages.Humain;
import personnages.Commercants;
import personnages.Yakuza;

public class HistoireTP4 {
	public static void main(String[] args) {
		Commercants marco = new Commercants("Marco",15);
		Yakuza yaku = new Yakuza("Yaku Le Noir","Ciao Kombucha",30,"Warsong");
		yaku.direBonjour();
		yaku.extorquer(marco);
	}
}
