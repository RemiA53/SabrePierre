package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int réput;
	
	public Yakuza(String nom,String boissonFav,int argent,String clan) {
		super(nom,boissonFav,argent);
		this.clan=clan;
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
}
