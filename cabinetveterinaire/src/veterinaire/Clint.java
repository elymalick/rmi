package veterinaire;
import veterinaire.InterfaceVeterinaire;

import java.rmi.RMISecurityManager;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;
public class Clint {
private Clint(){}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	System.setSecurityManager (
		//		new RMISecurityManager ()) ;

		String host = (args.length < 1) ? null : args[0];
		try {
			Registry registry = LocateRegistry.getRegistry(host);
			InterfaceVeterinaire stub = (InterfaceVeterinaire) registry.lookup("Cabinet");
			//InterfaceVeterinaire stub2 = (InterfaceVeterinaire) registry.lookup("EspeceProtege");
			ArrayList mesanimaux = (ArrayList)stub.maliste();
			
			for( int i=0;i<mesanimaux.size();i++)
			{
			//	((InterfaceVeterinaire) mesanimaux.get(i)).synthese(stub2);
			}
			//stub.rechercher("chat");
			//stub.affichage();
			//stub.afficheespece();
			//stub.mondossiersuivi("mon dossier de suivi");
		} catch (Exception e) {
			System.err.println("Client exception: " + e.toString());
			e.printStackTrace();
		}
	}

}
