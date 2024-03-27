package exo03;

public class main {
	public static void main(String args[]) {
	
	employe e1=new E_fix("xx",1000);
	E_comission e2 =new E_comission("yyy", (float)1000, (float)50, (float)0.5);
	E_horaire e3 = new E_horaire("zzz",500,20);
	
	Enterprise entrep = new Enterprise (10);
	
	entrep.add(e1);
	entrep.add(e2);
	entrep.add(e3);
	System.out.println("le salaire moyen est: "+entrep.moyenne());
	
	
	
	 
	

}
}
