
public class Livre {

	private int idLivre;
	private String titre;
	private String auteur;
	private float prix;
	private boolean emprunte = false;
	
	public Livre(int id,String titre,String auteur, float prix) {
		this.idLivre = id;
		this.titre = titre;
		this.auteur = auteur;
		this.prix = prix;
	}
	
	//Getters id - titre - prix - emprunte
	public int getIdLivre() {
		return idLivre;
	}
	
	public String getTitre() {
		return titre;
	}
	
	public String getAuteur() {
		return auteur;
	}
	
	public float getprix() {
		return prix;
	}
	
	public boolean isEmprunte() {
		return emprunte;
	}
	
	//emprunter
	public boolean emprunter() {
		if(!emprunte) {
			 emprunte = true;
			return true;
		}else {
			 return false;
		}
	}
	
	
	//rendre
	public boolean rendre() {
		if(emprunte) {
			emprunte = false;
			return false;
		}else {
			return true;
		}
	}
	
	//toString
	@Override
	public String toString() {
		return(titre + "; " + auteur  + "; " + prix  + "; " + emprunte);
	}
	
}
