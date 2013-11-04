
public class EspecePro extends Espece {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	EspecePro(String nom,String DVM)
	{
		super(nom,DVM);
		
	}
	public String creeSynthese()
	{

		return super.creeSynthese()+" protégée";
		
	}

}
