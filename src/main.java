

public class main {

	public static void main(String[] args) {
		
		Bibliotheque biblio1 = new Bibliotheque(1,"Anna Langfus","5 avenue du 8 mai");

		Livre livre1 = new Livre(1,"Hello world","Info", 12.5f);
		Livre livre2 = new Livre(2,"Martine petite maman","Justine Pochon", 21.5f);
		Livre livre3 = new Livre(3,"Meme dans les orties","Josette Daudeline", 14.5f);
		Livre livre4 = new Livre(4,"Harry Potter et la coupe de feu","J. K. Rowling", 17.5f);
		
		biblio1.ajouterLivre(livre4);
		biblio1.ajouterLivre(livre3);
		biblio1.ajouterLivre(livre2);
		biblio1.ajouterLivre(livre1);

		/*Faire des actions :
			abonne1.toString()
			abonne2.toString(*/
		
		Abonne abonne1 = new Abonne(1, "Enkaoua","Tsipora", "tsipo@gmail.com");
		Abonne abonne2 = new Abonne(2, "Guetta","Sarah", "sarah@gmail.com");
		
		abonne1.emprunterLivre(livre4);
		abonne1.emprunterLivre(livre2);
		System.out.println(abonne1.getLivresEmpruntes());
		//System.out.println(livre3);
		if(abonne2.emprunterLivre(livre4)) {
			System.out.println("Vous venez d'emprunter le livre" + livre4.getTitre());
		}else {
			System.out.println("Livre déjà emprunté par un autre utilisateur");
		}
		abonne1.rendreLivre(livre4);
		if(abonne2.emprunterLivre(livre4)) {
			System.out.println("Vous venez d'emprunter le livre" + livre4.getTitre());
		}else {
			System.out.println("Livre déjà emprunté par un autre utilisateur");
		}

		System.out.println(biblio1.toString());
		

		System.out.println(abonne1.toString());
		System.out.println(abonne2.toString());
	}
	

	//ajouter contrainte on ne peut pas emprunter si ce nesr pas dans un biblio
}
