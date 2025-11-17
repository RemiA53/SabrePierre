package personnages;

public class Ronin extends Humain {
	public int honneur=1;
	public int force = 2*honneur;
	public Ronin(String nom,String boissonFav,int argent) {
		super(nom,boissonFav,argent);
	}
	
	public void donner(Commercants beneficiaire) {
		String nomBenef = beneficiaire.getNom();
		int argentDonné = argent*10/100;
		System.out.println(parler(nomBenef + " prend ces " + argentDonné +" sous."));
		argent = perdreArgent(argentDonné);
		beneficiaire.recevoir(argentDonné);
	}
	
	public void provoquer(Yakuza adversaire) {
		int réputAd = adversaire.getRéput();
		if (réputAd>force) {
			adversaire.perdre();
		}else {
			adversaire.gagner(argent);
			argent = perdreArgent(argent);
		}
	}
}
