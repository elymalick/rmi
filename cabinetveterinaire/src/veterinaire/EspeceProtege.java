package veterinaire;

public class EspeceProtege extends Espece{
	private String nature;
	
EspeceProtege(String nom,String DVM)
{
	super(nom,DVM);
	nature="espece protege " ;
}
public String creesynthse()
{

	return super.getNomEspece()+" "+super.getDVM()+" "+nature;
	
}
}
