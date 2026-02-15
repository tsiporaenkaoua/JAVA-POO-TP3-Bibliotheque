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
		catalogue = new ArrayList<>();
	}
	
	//ajouter un livre - verif : s'il existe pas deja
	public void  ajouterLivre(Livre livre) {
		catalogue.add(livre);
	}
	
	//Supprimer un livre - verif
	public void supprimerLivre(Livre livre) {
		catalogue.remove(livre);
	}
	
	//getCatalogue
	public ArrayList getCatalogue() {
		return catalogue;
	}
	
	
	
	//rechercher un livre 
	public Livre rechercherLivre(Livre livre) {
	    for(Livre l : catalogue) {
	        if(livre.getTitre().equals(l.getTitre()) && livre.getAuteur().equals(l.getAuteur())) {
	            return l;  
	        }
	    }
	    return null;  
	}
	
	//nb livres empruntes
	public int nbLivresEmpruntes() {
		int emprunte = 0;
		for (Livre livre : catalogue) {
			if (livre.isEmprunte()){
				emprunte+=1;
			}
		}
		return emprunte;
	}
	
	//nbLivresCatalogue
	public int nbLivresCatalogue() {
		return catalogue.size();
	}
	
	//valeurTotalCatalogue
	public float valeurCatalogue() {
		float prixTotal = 0;
		for (Livre l : catalogue) {
			prixTotal += l.getprix();
		}
		return prixTotal;
	}
	
	
	//afficherLivresDispo 
	public ArrayList livresDispo() {
		ArrayList<Livre> livresDispo = new ArrayList<>();
		for(Livre l : catalogue) {
			if(!l.isEmprunte()) {
				livresDispo.add(l);
			}
		}
		return livresDispo;
	}
	
	//toString
		@Override
		public String toString() {
			return ("Nom de bibliothèque : "+  nom + "; Nombre de livres : " + nbLivresCatalogue() + "; valeur du catalogie : " + valeurCatalogue() + "; nombre de livres empruntés : " + nbLivresEmpruntes() + "; adresse biblio : " + adresse +"; Catalogue complet : " + catalogue);
		}
		
	
}