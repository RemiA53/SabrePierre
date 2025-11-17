package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int réput;
	
	public Yakuza(String nom,String boissonFav,int argent,String clan) {
		super(nom,boissonFav,argent);
		this.clan=clan;
	}
		
	public int getRéput() {
		return réput;
	}

	public void extorquer(Commercants victime) {
		String nomVic = victime.getNom();
		int argentVic = victime.getArgent();
		System.out.println(parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?"));
		System.out.println(parler(nomVic + ", si tu tiens à la vie, donne moi toute ta bourse !"));
		victime.seFaireExtorquer();
		argent = argent + argentVic;
		System.out.println(parler("J'ai piqué les " + argentVic + " sous de " + nomVic + ", ce qui me fait " + argent + " sous dans ma poche. Mwahahahah !"));
	}
	
	public int perdre() {
		int argentPerd = argent;
		argent = 0;
		réput = réput-1;
		System.out.println(parler("J'ai perdu mon duel et mes " + argentPerd + " sous, snifsnouf... J'ai déshonoré le clan de " + clan));
		return argentPerd;
	}
	
	public void gagner(int gain) {
		argent = gagnerArgent(gain);
		réput = réput+1;
		System.out.println(parler("Ce ronin pensait vraiment battre " + nom + " du clan de " + clan + " ? Je l'ai dépouillé de ses " + gain + "sous. Mwahahahah"));
	}
}