import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;


public class Client {

	/**
	 * @param args
	 * @throws RemoteException 
	 */
	public static void main(String[] args) throws RemoteException {
		if(System.getSecurityManager() == null) 
		     System.setSecurityManager (new RMISecurityManager()) ;
		// TODO Auto-generated method stub
		Animal a = new Animal( "Blacky","ely","Berger allemand");
		EspecePro es =new EspecePro("4 pattes ","10 ans");
		a.setEspece(es);
		//es.setDVMEspece("5ans");
				String host = (args.length < 1) ? null : args[0];
				try {
					Registry registry = LocateRegistry.getRegistry(host);
					CabinetInterface stub = (CabinetInterface) registry.lookup("Cabinet");
					//System.out.println(stub.rechercher("kiki"));
					
					//Animal inter=stub.afficheliste().get(0);
					//Espece ff=inter.mesespece;
					//System.out.println(stub.synthese());
					
					//System.out.println(a.mesespece.creeSynthese());
					System.out.println(stub.synthese(a.mesespece));
					//InterfaceVeterinaire stub2 = (InterfaceVeterinaire) registry.lookup("EspeceProtege");
					
					//for( int i=0;i<mesanimaux.size();i++)
					//{
					//	((InterfaceVeterinaire) mesanimaux.get(i)).synthese(stub2);
					//}
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
