import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;


public interface CabinetInterface extends Remote {
	public ArrayList<Animal> afficheliste() throws	RemoteException;
	public String rechercher(String nom)throws	RemoteException;
	public String synthese(Espece mesespeces) throws	RemoteException;

}
