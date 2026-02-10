import java.util.ArrayList;

public class Bibliotheque {

	private int idBibliotheque;
	private String nom;
	private String adresse;
	private ArrayList<Livre> catalogue;
	
	public Bibliotheque(int id,String nom,String adresse) {
		this.idBibliotheque =id;
		this.nom=nom;
		this.adresse = adresse;
	}
	
	//ajouter un livre
	//Supprimer un livre
	//getCatalogue
	//toString
	//rechercher un livre
	//nb livres empruntes
	//valeurTotalCatalogue
	//afficherLivresDispo
	
}