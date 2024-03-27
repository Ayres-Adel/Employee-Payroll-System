package exo03;

public class Enterprise {
	
	
	
	employe tab[];
	
	int cpt;
	
	public Enterprise(int taille ) {
		tab=new employe[taille];
	}
	
	public void add(employe e) {
		tab[cpt]=e;
		cpt++;
	}
	
	public float moyenne() {
		float somme =0;
		for(int i=0;i<cpt;i++) {
			somme+=tab[i].salaire();
		}
		
		return somme/cpt;
	}
	
	
	

}
