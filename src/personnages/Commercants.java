package personnages;

public class Commercants extends Humain {
	public Commercants(String nom,int argent) {
		super(nom,"thé",argent);
	}
	
	public int seFaireExtorquer() {
		int argentPerdu = argent;
		argent = 0;
		System.out.println(parler("J'ai tout perdu ! Le monde est trop injuste..."));
		return argentPerdu;
	}
	
	public void recevoir(int argents) {
		argent = argent + argents;
		System.out.println(parler(argents + " sous ! Je te remercie généreux donateur !"));
	}

}
