package com.objis.cameroun.GestionPatients.presentation;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.objis.cameroun.GestionPatients.domaine.Patient;

import com.objis.cameroun.GestionPatients.service.Traitement;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Enregistrer extends JFrame {

	private JPanel contentPane;
	private JTextField nomTextField;
	private JTextField prenomTextField;
	private JTextField quartierTextField;
	private JTextField fonctionTextField;
	private JTextField ageTextField;
	private JTextField sexeTextField;
	private JTextField matriculeTextField;
	private JLabel lblMessage;
	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public Enregistrer() {
		setTitle("Enregistrer un Patient");
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNom = new JLabel("Nom :");
		lblNom.setBounds(10, 11, 46, 14);
		contentPane.add(lblNom);
		
		nomTextField = new JTextField();
		nomTextField.setBounds(78, 8, 211, 20);
		contentPane.add(nomTextField);
		nomTextField.setColumns(10);
		
		JLabel lblPrenom = new JLabel("Prenom :");
		lblPrenom.setBounds(10, 36, 46, 14);
		contentPane.add(lblPrenom);
		
		prenomTextField = new JTextField();
		prenomTextField.setBounds(78, 39, 211, 20);
		contentPane.add(prenomTextField);
		prenomTextField.setColumns(10);
		
		JLabel lblQuartier = new JLabel("Quartier :");
		lblQuartier.setBounds(10, 73, 58, 14);
		contentPane.add(lblQuartier);
		
		quartierTextField = new JTextField();
		quartierTextField.setBounds(78, 70, 211, 20);
		contentPane.add(quartierTextField);
		quartierTextField.setColumns(10);
		
		JLabel lblFonction = new JLabel("Fonction :");
		lblFonction.setBounds(10, 98, 58, 14);
		contentPane.add(lblFonction);
		
		fonctionTextField = new JTextField();
		fonctionTextField.setBounds(78, 95, 211, 20);
		contentPane.add(fonctionTextField);
		fonctionTextField.setColumns(10);
		
		JLabel lblAge = new JLabel("Age :");
		lblAge.setBounds(10, 128, 46, 14);
		contentPane.add(lblAge);
		
		ageTextField = new JTextField();
		ageTextField.setBounds(78, 126, 86, 20);
		contentPane.add(ageTextField);
		ageTextField.setColumns(10);
		
		JLabel lblSexe = new JLabel("Sexe :");
		lblSexe.setBounds(10, 156, 46, 14);
		contentPane.add(lblSexe);
		
		sexeTextField = new JTextField();
		sexeTextField.setBounds(78, 153, 86, 20);
		contentPane.add(sexeTextField);
		sexeTextField.setColumns(10);
		
		JLabel lblMatricule = new JLabel("Matricule :");
		lblMatricule.setBounds(10, 187, 58, 14);
		contentPane.add(lblMatricule);
		
		matriculeTextField = new JTextField();
		matriculeTextField.setBounds(78, 184, 86, 20);
		contentPane.add(matriculeTextField);
		matriculeTextField.setColumns(10);
		
		JButton btnEnregistre = new JButton("Enregistre");
		btnEnregistre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// recuperation des valeurs saisies dans le formulaire
				
				String nom, prenom, quartier, fonction, sexe;
				int age, matricule;
				//affectation des valeurs saisies dans le formulaire
	
				nom = nomTextField.getText();
				prenom = prenomTextField.getText();
				quartier = quartierTextField.getText();
				fonction = fonctionTextField.getText();
				//age = ageTextField.getText();
				sexe = sexeTextField.getText();
				//mat = matriculeTextField.getText();
				//classe = classeTextField.getText();
				age = Integer.parseInt(ageTextField.getText()); //parseInt permet de convertir un String en int
				
				matricule = Integer.parseInt(matriculeTextField.getText()); //parseInt permet de convertir un String en int
				
				// creation d'un objet patient
				
				Patient patient = new Patient();
				
				patient.setNom(nom);
				patient.setPrenom(prenom);
				patient.setQuartier(quartier);
				patient.setFonction(fonction);
				patient.setAge(age);
				patient.setSexe(sexe);
				patient.setMatricule(matricule);
				// appel de la methode savePatientTraitement de la couche traitement
				Traitement traitement = new Traitement();
				
				int etat;
				etat = traitement.savePatientTraitement(patient);
				if(etat == 1) {
					// vidages des zones textes
					
					nomTextField.setText("");
					prenomTextField.setText("");
					quartierTextField.setText("");
					fonctionTextField.setText("");
					ageTextField.setText("");
					sexeTextField.setText("");
					matriculeTextField.setText("");
					
					//classeTextField.setText("");
					
					// affiche du dialoguebox succes
					JOptionPane.showMessageDialog(null, "le patient "+" "+ patient.getNom()+" "+"a été enregistré avec SUCCES dans la base de donnée");
				}
					
					else {
						JOptionPane.showMessageDialog(null, "une ERREUR c'est produit " + "pendant l'enregistrement" );
					}
				
			}
		});
		btnEnregistre.setBounds(316, 212, 89, 23);
		
		contentPane.add(btnEnregistre);
	}
}
