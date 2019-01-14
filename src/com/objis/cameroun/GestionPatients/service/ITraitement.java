package com.objis.cameroun.GestionPatients.service;

import java.util.List;

import com.objis.cameroun.GestionPatients.domaine.Patient;

/**
 * interface generique: elle contient toutes les signatures des methodes 
 * qui vont etre implementer par la classe Traitement
 * 
 * @author FLAUBERT
 * 
 *@version 1.0 \\ premiere version de mon programme
 */
public interface ITraitement {
	public void messageBienvenue();
	public void enregistrePatient();
	public void consulteDonnees();
	public  List<Patient> getAllPatientTraitement();

}

