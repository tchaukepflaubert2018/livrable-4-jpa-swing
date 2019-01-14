package com.objis.cameroun.GestionPatients.service;
import com.objis.cameroun.GestionPatients.presentation.Lanceur;
import com.objis.cameroun.GestionPatients.dao.Dao;
import com.objis.cameroun.GestionPatients.dao.IDao;
import com.objis.cameroun.GestionPatients.domaine.Patient;
import java.util.List;
import java.util.Scanner;

/**
 * Classe a partir de laquelle on fait appel des 
 * differentes methodes via l'objet traitement.
 * 
 * @author FLAUBERT
 * 
 * @version 1.0 \\ premiere version de mon programme
 */
public class Traitement implements ITraitement{
	
	private IDao dao;
	/**
	 * 
	 */
	public Traitement() {
		this.dao= new Dao();
	}
	// methode qui affiche le message de bienvenue
	/* (non-Javadoc)
	 * @see com.objis.cameroun.GestionPatients.service.ITraitement#messageBienvenue()
	 */
	public void messageBienvenue(){
	System.out.println("Bienvenu dans mon application de gestion des patients dans les hopitaux clinic et centre de sante");
	//System.out.println("Voulez vous enregistrez un patient O/N");
	System.out.println("				    Merci de choisir une option    " + '\n'
			+ "                                                            " + '\n'
			+ "                  		##################################" + '\n'
			+ "                  		##                              ##" + '\n'
			+ "                  		##       E - ENREGISTRE         ##" + '\n'
			+ "                  		##       C - CONSULTER          ##" + '\n'
			+ "                  		##       S - SORTIR        		##" + '\n'
			+"                          ##                              ##" + '\n'
			+ "                  		##################################");

}
//methode qui permet d'entree les coordonneees du patient
/* (non-Javadoc)
 * @see com.objis.cameroun.GestionPatients.service.ITraitement#enregistrePatient()
 */
public void enregistrePatient(){
	char reponse;
	Patient pn= new Patient();// instanciation
	Scanner scc = new Scanner(System.in);// scanner scc pous les variables de type string
	Scanner sci = new Scanner(System.in);// scanner sci pour les varibles de type int
	System.out.println("Voulez vous continuer O/N?");// instruction d'affichage
	reponse = scc.nextLine().charAt(0);
	
    if(reponse== 'O') {
	while(reponse == 'O'){
	
	  System.out.println("Donnez un nom : ");//On affiche une instruction
	  //On recupere le nom saisi
	 pn.setNom(scc.nextLine());
	 // on affiche une instruction
	 System.out.println("Donnez un prenom : ");
	 //on recupere le prenom saisi
	 pn.setPrenom(scc.nextLine());
	 // on affiche une instruction
	 System.out.println("Donnez le quartier: ");
	 // on recupere le quartier saisi
	 pn.setQuartier(scc.nextLine());
	 //on affiche une instruction
	 System.out.println("Donnez la fonction: ");
	 //on recupere la fonction saisi
	 pn.setFonction(scc.nextLine());
	// on affiche une instruction
	System.out.println("Donnez l'age");
	// on recupere l'age saisi
	pn.setAge(sci.nextInt());
	//on affiche une instruction
	System.out.println("Donnez le sexe M/F");
	// on recupere le sexe saisi
	pn.setSexe(scc.nextLine());
	 //on affiche une instruction
	 System.out.println("Donnez le matricule: ");
	 // on recupere le matricule saisi
	 pn.setMatricule(sci.nextInt());
	  System.out.println ("Voulez-vous corriger les informations ? (O/N)");
    reponse = scc.nextLine().charAt(0);
	}
	//ENREGISTRE EN BASE DE DONNEE
	
	dao.savePatientDao(pn);
	
    System.out.println("le patient  a été enregistre avec success dans la base de donnee");
	// System.out.println( "le patient"+" " +p1.getNom()+" "+p1.getPrenom()+" "+"resident a:"+" "+p1.getQuartier()+" "+"avec pour fonction:"+" "+p1.getFonction()+" "+"age de"+" "+p1.getAge()+" "+"et ayant le matricule:"+" "+p1.getMatricule()+" "+ "est bien enregistre");
    }
	 else {
   
	   System.out.println("A bientot pour le prochain enregistrement");// instruction d'affichage
	 }
}
/**
 * methode qui permet de sauvegarder 
 * le patient en base de donnee
 * @param savePatientTraitement
 * @return dao.savepatientDao
 */
public int savePatientTraitement(Patient patient) {
	
	return dao.savePatientDao(patient);
}
// methode qui permet de consulter les donnees du patient
/* (non-Javadoc)
 * @see com.objis.cameroun.GestionPatients.service.ITraitement#consulteDonnees()
 */
public void consulteDonnees() {
	
	
	//recuperation de la list des patients en bd
	
		List<Patient> listPatient= dao.getAllPatientDao();
		
		//affiche la liste des patients
		for (Patient patient : listPatient) {
			
			// instructions d'affichages
			 System.out.println("Nom :"+ " " +patient.getNom());
			 System.out.println("Prenom :"+" " +patient.getPrenom());
			 System.out.println("Quartier :"+" " +patient.getQuartier());
			 System.out.println("Fonction :"+" " +patient.getFonction());
			 System.out.println("Age :"+""+patient.getAge());
			 System.out.println("Sexe :"+""+patient.getSexe());
			 System.out.println("Matricule :"+" " +patient.getMatricule());
			 // instruction d'affichage
			// System.out.println(" le patient est bien enregistre");	

	    
	    	   
	 	   System.out.println("*************************************************************** ");// instruction d'affichage
	 }

}
@Override
public  List<Patient> getAllPatientTraitement() {
	// TODO Auto-generated method stub
	return dao.getAllPatientDao();
}
}