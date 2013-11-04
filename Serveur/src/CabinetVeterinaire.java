import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;



public class CabinetVeterinaire extends UnicastRemoteObject implements CabinetInterface {
	private Animal a1;
	private Animal a2;
	 ArrayList <Animal>list;
		
	public  CabinetVeterinaire() throws RemoteException {
			
			a1 = new Animal( "leon","ely","Leopard");
			Espece e1=new Espece("tortue","14 ans");
			e1.setDVMspece("14 ans");
			a1.setEspece(e1);
			a2 = new Animal( "kiki","elymane","Chien d'Oysel");
			Espece e2=new Espece("Le chien de prairie à queue noire","20 ans");
			a2.setEspece(e2);
			list=new ArrayList();
			list.add(a1);
			list.add(a2);
		}
	public ArrayList afficheliste() throws	RemoteException
	{
		return list;
	}
			public  String rechercher(String nom) throws	RemoteException
			{
				
				Boolean trouve=false;
				String sortie;
				int i;
				
				for( i=0;i<list.size();i++)
				{
					if(nom.equalsIgnoreCase(((Animal)list.get(i)).getNom())) {
						trouve=true;
						break;
				}
				}
				if(trouve)
					sortie="l'animal est "+(Animal)list.get(i);
				else
				{
					sortie="Nom inexistant";
				
							
				}
				return sortie;
				
			}
			
			
		// TODO Auto-generated constructor stub
	
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		@Override
		
		
		public String synthese(Espece mesespeces) throws RemoteException {
			return mesespeces.creeSynthese();

		

}
}
