package personnages;

public class Humain {
	private String nom;
	private String boissonFav;
	private int argent;
	public String getNom() {
		return nom;
	}
	public Humain(String nom, String boissonFav,int argent) {
		this.nom = nom;
		this.boissonFav = boissonFav;
		this.argent = argent;
	}
	public String getBoissonFav() {
		return boissonFav;
	}
	public int getArgent() {
		return argent;
	}
	
	public int gagnerArgent(int gain) {
		return argent + gain ;
	}
	
	public int perdreArgent(int perte) {
		return argent - perte ;
	}
	
	public String parler(String texte) {
		return "(" + nom + ")-" + texte;
	}
	
	public void direBonjour() {
		System.out.println(parler("Bonjour ! Je m'appelle " + nom + " et j'aime boire du " + boissonFav + "."));
	}
	
	public void boire() {
		System.out.println(parler("Mmmm, un bon verre de " + boissonFav + " ! GLOUPS !" ));
	}
	
	public void acheter(String bien, int prix) {
		if (prix > argent) {
			System.out.println(parler("Je n'ai plus que " + argent + " sous en poche. Je ne peux même pas m'offrir un " + bien + " à " + prix + " sous."));
		}else {
			System.out.println(parler("J'ai " + argent + " sous en poche. Je vais pouvoir m'offrir un jeu à " + prix + " sous."));
			argent = perdreArgent(prix);
		}
	}
}
