import java.rmi.RMISecurityManager;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;


public class Serveur {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		if(System.getSecurityManager() == null) 
		     System.setSecurityManager (new RMISecurityManager());
		// TODO Auto-generated method stub
		try {
			CabinetVeterinaire obj = new CabinetVeterinaire();
			 Registry registry = LocateRegistry.createRegistry(1099);
			//Registry registry = LocateRegistry.getRegistry();
			if (registry==null){
				System.err.println("RmiRegistry not found");
			}
			else{
			registry.bind("Cabinet", obj);
				System.out.println("Server ready");
			}
		} catch (Exception e) {
			System.err.println("Server exception: " + e.toString());
			e.printStackTrace();
		}

	}

}
