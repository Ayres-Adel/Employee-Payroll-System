package exo03;

public abstract class employe {
	//attributs
	String nom;
	//constructeur
	public employe(String n) {
		this.nom=n;
	}
	//method
	public abstract float salaire();
	

}
