package com.objis.cameroun.GestionPatients.presentation;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

import com.objis.cameroun.GestionPatients.domaine.PatientModel;
import com.objis.cameroun.GestionPatients.service.ITraitement;
import com.objis.cameroun.GestionPatients.service.Traitement;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class ListPatient extends JFrame {

	private JPanel contentPane;
	private JTable tablePatient;
	private PatientModel  patientModel;
	private JTextField nomTextField;
	private JTextField prenomTextField;
	private JTextField quartierTextField;
	private JTextField fonctionTextField;
	private JTextField ageTextField;
	private JTextField sexeTextField;
	private JTextField matriculeTextField;
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public ListPatient() {
		setTitle("Liste des Patients");
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		//contentPane.setLayout(null);
		
		  ITraitement traitement = new Traitement();
			
		    patientModel = new PatientModel(traitement.getAllPatientTraitement());
			
			tablePatient = new JTable(patientModel);
			
			
			contentPane.add(new JScrollPane(tablePatient), BorderLayout.CENTER);
			
		
	}
}
