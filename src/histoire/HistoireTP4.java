package histoire;

import personnages.Humain;
import personnages.Commercants;
import personnages.Yakuza;
import personnages.Ronin;

public class HistoireTP4 {
	public static void main(String[] args) {
		Commercants marco = new Commercants("Marco",0);
		Ronin roro = new Ronin("Roro","shochu",60,1);
		roro.direBonjour();
		roro.donner(marco);
	}
}
