package veterinaire;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class Cabinet extends UnicastRemoteObject  implements InterfaceVeterinaire {
	
	private Animal a1;
	private Animal a2;
	ArrayList list=new ArrayList();
		
	public  Cabinet() throws RemoteException {
			
			a1 = new Animal( "gelger allemand","ely","chien");
			a1.setEspece(new Espece("animall"," 5 ans "));
			a2 = new Animal( "gelger allemand","elymane","chat");
			a2.setEspece(new EspeceProtege("animall"," 3 ans "));
			list.add(a1);
			list.add(a2);
		}
	public ArrayList maliste() throws	RemoteException
	{
		return list;
	}
			public void rechercher(String nom) throws	RemoteException
			{
				Boolean trouve=false;
				int i;
				
				for( i=0;i<list.size();i++)
				{
					if(nom.equals(((Animal)list.get(i)).getNom()))
						trouve=true;
						break;
				}
				if(trouve)
				{
				System.out.println("l'animal est "+(Animal)list.get(i)); 
				}
				else
				{
					System.out.println("Nom inexistant");
				}
			}
		// TODO Auto-generated constructor stub
	
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		@Override
		public String synthese(Espece mesespeces) throws RemoteException {
			// TODO Auto-generated method stub
			return null;
		}
		 
	
		 
				
}
