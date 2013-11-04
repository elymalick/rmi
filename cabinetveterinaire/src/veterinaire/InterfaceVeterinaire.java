package veterinaire;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface InterfaceVeterinaire extends Remote{
	public void rechercher(String nom)throws	RemoteException;
	public String synthese(Espece mesespeces) throws	RemoteException;
	public ArrayList maliste()throws  RemoteException;
}
