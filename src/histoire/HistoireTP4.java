package histoire;

import personnages.Humain;
import personnages.Commercants;

public class HistoireTP4 {
	public static void main(String[] args) {
		Commercants marco = new Commercants("Marco",20);
		marco.direBonjour();
		marco.seFaireExtorquer();
		marco.recevoir(15);
		marco.boire();
	}
}
