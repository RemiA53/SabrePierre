package personnages;

public class Ronin extends Humain {
	private int honneur=1;
	public Ronin(String nom,String boissonFav,int argent, int honneur) {
		super(nom,boissonFav,argent);
		this.honneur = honneur;
	}
	
	public void donner(Commercants beneficiaire) {
		String nomBenef = beneficiaire.getNom();
		int argentDonné = argent*10/100;
		System.out.println(parler(nomBenef + " prend ces " + argentDonné +" sous."));
		argent = perdreArgent(argentDonné);
		beneficiaire.recevoir(argentDonné);
	}
}
