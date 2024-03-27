package exo03;

public class E_horaire extends employe {
	float taux_h,nbh;
	
	
	public E_horaire(String n,float th,float nh) {
		super(n);
		this.taux_h=th;
		this.nbh=nh;
	}
	
	public float salaire() {
		return taux_h*nbh;
	}

}
