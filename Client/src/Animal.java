import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class Animal extends UnicastRemoteObject implements AnimalInterface {
		/**
	 * 
	 */
//	private static final long serialVersionUID = 1L;
		public Animal( String nom,String nommaitre,String race) throws RemoteException{
			this.nom=nom;
			this.nommaitre=nommaitre;
			
			this.race=race;
			this.mesespece = new Espece();
				
		}
		
		private String nom;
		private String nommaitre;
		private String race;
		Espece mesespece;
		private SuiviDossier dossiersuivi;
		public String getNom()
		{
			return this.nom;
		}
		public String getNomMaitre()
		{
			return this.nom;
		}
		public String getRace()
		{
			return this.nom;
		}
		public void setEspece(Espece espece)
		{
			this.mesespece=espece;
		}
		public Espece getEspece()
		{
			return this.mesespece;
		}
		
		public void affichage() throws RemoteException
		{
			System.out.println("je m'appelle "+this.getNom()+" mon maitre s'appelle "+this.nommaitre+" je fais partie de l'espece "+" et je suis de race "+this.getRace());
		}
		public void afficheespece()
		{
			System.out.println("l'animal "+this.getNom()+" aux especes "+this.getEspece().getNomEspece()+" et sa duree de vie moyenne est "+this.getEspece().getDVM());
		}
		public void nomespece(String nom)
		{
			this.mesespece.setNomEspece(nom);
		}
		public void DVMespece(String datesepece)
		{
			this.DVMespece(datesepece);
		}
		public void Modifficationespece(String nom,String dvm)
		{
			this.mesespece.setNomEspece(nom);
			this.DVMespece(dvm);
		}
		public SuiviDossier getSuivi()
		{
			return this.dossiersuivi;
		}
		public void mondossiersuivi(String dossier)
		{
		 this.getSuivi().dossierdesuivi(dossier);
		}
		/*une méthode fournissant une synthèse
		pour une espèce dans le serveur vétérinaire 
		(qui prend une espèce en paramètre et fournit en retour une chaîne contenant toutes les infos sur l'espèce)*/

//		public String synthese(Espece mesespeces) throws	RemoteException
//		{
//			return mesespeces.creeSynthese();
//		}
		{
			
		}

}
