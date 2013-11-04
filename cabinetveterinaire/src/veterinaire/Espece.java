package veterinaire;

import java.util.Date;

public class Espece {

	private String nomespece;
	private String DVM;

	/**
	 * @param args
	 */
	public Espece(String nom,String DVM)
	{
		this.nomespece=nom;
		this.DVM=DVM;
		
	}
public String getNomEspece()
{
	return this.nomespece;
	
}
public String getDVM()
{
	return this.DVM;
}
public void setNomEspece(String nom)
{
	
	this.nomespece=nom;
}
public void modifespece(String nom,String dvm)
{
	this.nomespece=nom;
	this.DVM=dvm;
}
// methode permettant de creer la synthese de l'espece
public String creeSynthese()
{
	return this.getNomEspece()+this.getDVM();
}

}
