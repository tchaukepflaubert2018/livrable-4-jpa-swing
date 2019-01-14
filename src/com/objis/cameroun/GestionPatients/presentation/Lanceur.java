package com.objis.cameroun.GestionPatients.presentation;
import java.util.Scanner;
import com.objis.cameroun.GestionPatients.domaine.Patient;
import com.objis.cameroun.GestionPatients.dao.Dao;
import com.objis.cameroun.GestionPatients.dao.IDao;
import com.objis.cameroun.GestionPatients.service.Traitement;
/**
 * @author FLAUBERT
 * 
 *@version 1.0 // premiere version de mon programme
 *
 */
public class Lanceur  { 
	/**
	 * cette classe est la classe principale
	 * @param arg
	 */

/**
 * la methode main // point d'entree de mon application
 * qui affiche le mot de Bienvenue
 * reponse: variable de type char
 * pn: nouveau objet creer a† partir de la variable 
 * patient par instanciation
 * Scanner: classe Scanner
 * @param args classe qui permet de lancer mon application
 */
	public Lanceur() {
	}
	
	
public static void main(String args[]){
  // System.out.println ("Bienvenu dans mon application de gestion des patients dans les hopitaux clinic et centre de sant√©");
   char reponse; // declaration d'une variable de type character
   
  // Patient p1 = new Patient(); // instanciation 
   Scanner scc = new Scanner(System.in); // instanciation d'un objet de type Scanner 
   Scanner sci = new Scanner(System.in); //instanciation d'un objet de type Scanner 
  
   Traitement traitement = new Traitement();// instanciation de la classe traitement
   
   traitement.messageBienvenue(); //appel de la methode messageBienvenue via l'objet traitement
   
   System.out.println("Entre votre choix");//on affiche un instruction
   reponse = scc.nextLine().charAt(0);
   //boucle switch
  switch(reponse) {
  case 'E':
  System.out.println("Vous avez choisi d'entree les donnees du patient");  // instruction d'affichage
  
  traitement.enregistrePatient();  //appel de la methode enregistrePatient via l'objet traitement
  break;
  case 'C':
  System.out.println("Vous avez choisi de consulter les donnees du patient");  // instruction d'affichage
  
  traitement.consulteDonnees();  //appel de la methode consulteDonnees via l'objet traitement 
  break;
  case 'S':
	  System.out.println("vous sortez du programme");// instruction d'affichage
	break;  
  default:
	  System.out.println("Au revoir");  // instruction d'affichage
  }
   
 
   
}
}

	 
	 
   
    
   
   
   
  
   
   
 



