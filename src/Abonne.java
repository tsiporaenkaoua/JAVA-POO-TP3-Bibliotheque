import java.util.ArrayList;

public class Abonne {
	
	private int idAbonne;
	private String nom;
	private String prenom;
	private String email;
	private ArrayList<Livre> lesLivresEmpruntes;
	
	public Abonne(int idAbonne, String nom,String prenom, String email){
		this.idAbonne = idAbonne;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		lesLivresEmpruntes = new ArrayList<>();
	}
	
	
	//getter id
	public String getNom() {
		return nom;
	}
	
	public String getEmail() {
		return email;
	}
	
	
	//emprunterLivre - verif sil nest pas deja emprunté
	public boolean emprunterLivre(Livre livre) {
		if(livre.isEmprunte()) {
			return false;
		}
		livre.emprunter();
		lesLivresEmpruntes.add(livre);
		return true;
	}

	//rendreLivre
	public boolean rendreLivre(Livre livre) {
		if(lesLivresEmpruntes.contains(livre)) {
			lesLivresEmpruntes.remove(livre);
			livre.rendre();
			return true;
		}
		return false;
	}
	
	//getLivresEmpruntes
	public ArrayList getLivresEmpruntes() {
		return lesLivresEmpruntes;
	}
	
	
	//getnbLivresEmpruntes
	public int nbLivresEmpruntes() {
		return lesLivresEmpruntes.size();
	}
	
	
	//total valeur emmprunts
	public float totalValeurEmprunts() {
		float somme = 0;
		for (Livre livre :lesLivresEmpruntes) {
			somme += livre.getprix();
		}
		return somme;
	}
	
	//toString 
	@Override
	public String toString() {
		return (idAbonne +"; " + nom +"; " + email  +"; " + nbLivresEmpruntes()  +"; " + totalValeurEmprunts());
	}

}
