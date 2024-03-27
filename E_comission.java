package exo03;

public class E_comission extends employe {
	float salaire_b,ventes,pourc;
	
	public E_comission (String n,float sb, float v,float p) {
		super(n);
		this.salaire_b=sb;
		this.ventes=v;
		this.pourc=p;
		
	}
	
	
	public float salaire() {
		return salaire_b + ventes*pourc;
		
		
	}

}
