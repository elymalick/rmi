package veterinaire;
import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Serveur {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
    //System.setSecurityManager (
//	new RMISecurityManager ()) ;

		// TODO Auto-generated method stub
		try {
			Cabinet obj = new Cabinet();
			EspeceProtege esp=new EspeceProtege("lapin","5 ans");
			//Animal obj = new Animal( "gelger allemand","ely","chien");
			//obj.setEspece(new Espece("animal"," 5 ans "));
		    
			Registry registry = LocateRegistry.createRegistry(2000);
			//Registry registry = LocateRegistry.getRegistry();
			if (registry==null){
				System.err.println("RmiRegistry not found");
			}else{
				registry.rebind("Cabinet", obj);
				
				//registry.bind("Animal", obj);
				registry.bind("EspeceProtege", (Remote) esp);
				System.err.println("Server ready");
			}
		} catch (Exception e) {
			System.err.println("Server exception: " + e.toString());
			e.printStackTrace();
		}
	}

}
